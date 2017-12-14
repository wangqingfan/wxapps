const _http = require("../utils/http");

// 全局变量this
let _app;
// 从微信中获取code
let code = "";
// 正在加载数据
let _isLoading = false;
// 回调函数
let _callback;
//初始化用户信息结束
let _isFinished = false;
//是否使用本地缓存
let _useStorage = false;

/**
 * 初始化用户信息
 */
function init(value, back) {
  _app = value;
  _callback = back;
  _http.init(_app);
}

/**
 * 获取js_code
 */
function getCode () {
  _app.log("getCode");
  wx.login({
    success: function (res) {
      _app.log(res, "getCode success");
      code = res.code;
      wxLogin();
    },
    fail: function (res) {
      _app.log(res, "getCode fail");
    }
  })
}

/**
 * 使用微信登录
 * 将登录凭证发往你的服务端，并在你的服务端使用该凭证向微信服务器换取该微信用户的唯一标识(openid)和会话密钥(session_key)
 */ 

function wxLogin() {
  _app.log("wxLogin");
  // _http.request({
  //   url: _app.host + 'wxlogin',
  //   data: {
  //     "code": code
  //   },
  //   method: 'GET',
  //   success: function (res) {
  //     if (res.data && res.data.code == "10000") {
  //       for (var item in res.data.data) {
            //在globalData存入api_token
  //         _app.globalData.userInfo[item] = res.data.data[item];
  //       }
            //在globalData存入转换的请求时间 7200代表 两个小时
  //       _app.globalData.userInfo["time"] = (res.data.data["expires_in"]) * 1000 + parseInt((new Date().getTime()));
        setBaseUserInfo();
  //     } else {
  //       _isLoading = false;
  //       _isFinished = true;
  //       doCallBack();
  //     }
  //   },
  //   fail: function (res) {
  //     _isLoading = false;
  //     console.log(res, "wxlogin");
  //   }
  // })

}

/**
 * 获取用户基本信息 昵称等等
 * 用户授权
 */
function setBaseUserInfo () {
  _app.log("setBaseUserInfo");
  wx.getUserInfo({
    withCredentials: true,
    success: function (res) {
      _app.globalData.userInfo.encryptedData = res.encryptedData;
      _app.globalData.userInfo.iv = res.iv;
      for (var item in res.userInfo) {
        _app.globalData.userInfo[item] = res.userInfo[item];
      }
      register();
    },
    fail: function (res) {
      _app.alertFun("允许授权，才能更好的服务", function () {
        wx.openSetting({
          success(settingdata) {
            if (settingdata.authSetting['scope.userInfo']) {
              setBaseUserInfo();
              _app.log('获取权限成功，再次请求用户数据')
            }
            else {
              _app.log('获取权限失败，无法继续');
              _app.alert("请重新打开此小程序，并允许授权", "", false);
            }
          }
        })
      });
    }
  })
}

/**
 * 补全服务器端的用户信息
 */
function register () {
  _app.log("register");
  // _http.request({
  //   url: _app.host + 'user/register',
  //   data: _app.globalData.userInfo,
  //   method: "POST",
  //   success: function (res) {
  //     _app.log(res.data, "register success");
  //     if (res.data && res.data.code == "100000") {
  //       for (var item in res.data.data) {
  //         _app.globalData.userInfo[item] = res.data.data[item];
  //       }
        // 将3rdSessionId返回给客户端，维护小程序登录态。通过3rdSessionId找到用户session_key和openid。
        wx.setStorageSync("login", _app.globalData.userInfo); 
      // }
      _isLoading = false;
      _isFinished = true;
      doCallBack();
  //   },
  //   fail: function (res) {
  //     _isLoading = false;
  //     _isFinished = true;
  //     console.log(res);
  //   }
  // })
}

/**
 * 执行回调
 */
function doCallBack() {
  _callback();
}

/**
 * 检查当前token是否已经过期，如果过期重新请求
 */
function checkToken(backFun) {
  _callback = backFun;
  if (_app.globalData.userInfo && _app.globalData.userInfo["api_token"] && _app.globalData.userInfo["time"]) {
    if (needLogin(_app.globalData.userInfo["time"])) {
      getUserInfo();
    } else {
      doCallBack();
    }
  } else {
    getUserInfo();
  }
}

/**
 * 先从本地缓存中读取登陆信息
 * 验证过期时间，因为涉及到取特殊值，所以必须要先登陆，
 * 并且token未过期的情况下才能获取
 */
function checkStorage() {
  var st = wx.getStorageSync("login");
  if (st) {
    if (needLogin(st["time"])) {
      getCode();
    } else {
      if (st["id"] && st["id"] != "") {
        _app.globalData.userInfo = st;
        _isFinished = true;
        _isLoading = false;
        doCallBack();
      } else {
        getCode();
      }
    }
  } else {
    getCode();
  }
}

/**
 * 获取用户信息 登陆
 */
function getUserInfo() {
  _isLoading = true;
  if (_useStorage) {
    checkStorage();
  } else {
    getCode();
  }
  
}

/**
 * 根据存在本地的微信登陆过期时间判断是否需要重新登陆
 * @param value 需要对比的时间
 * 60000=1分钟
 */
function needLogin(value) {
  var temp = value - parseInt(new Date().getTime());
  if (temp < 60000) {
    return true;
  } else {
    return false;
  }
}

// 返回接口是否等待
function isLoading() {
  return _isLoading;
}

// 初始化信息结束
function isFinish() {
  return _isFinished;
}

module.exports = {
  init: init,
  checkBaseInfo: checkToken,
  isLoading: isLoading,
  isFinished: isFinish
}