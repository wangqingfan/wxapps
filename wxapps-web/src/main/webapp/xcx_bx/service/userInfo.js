const _http = require("../utils/http");

// 全局变量this
let _app;
// 从微信中获取code
let code = "";

/**
 * 初始化用户信息
 */
function init(value) {
  _app = value;
  getCode();
  _http.init(_app)
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
          // for (var item in res.data.data) {
          //   _app.globalData.userInfo[item] = res.data.data[item];
          // }
          // _app.globalData.userInfo["time"] = (res.data.data["expires_in"]) * 1000 + parseInt((new Date().getTime()));
          setBaseUserInfo();
  //   },
  //   fail: function (res) {

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
  wx.setStorageSync("login", _app.globalData.userInfo); // 将3rdSessionId返回给客户端，维护小程序登录态。通过3rdSessionId找到用户session_key和openid。
  
  //   },
  //   fail: function (res) {
  //     console.log(res);
  //   }
  // })
}


module.exports = {
  init: init
}