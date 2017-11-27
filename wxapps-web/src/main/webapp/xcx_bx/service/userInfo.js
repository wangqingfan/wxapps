var app;
/**
 * 重新封装wx.request,用户统一处理请求
 * @param value 等同于wx.request参数
 * @param backFun 回调
 */
function request (value, backFun) {
  if (!value.url || value.url == "") {
    if(backFun) {
      backFun();
    } else {
      console.log("缺少URL参数，无法发送请求！");
      return;
    }
  }

  // 判断url中是否有参数
  if (value.url.indexof("?", 1) != -1) {
    value.url = value.url + "&t=" + new Date().getTime();
  } else {
    value.url = value.url + "?t=" + new Date().getTime();
  }

  wx.request({
    url: value.url,
    data: value.data ? value.data : '',
    header: value.header ? value.header : getHeader(),
    method: value.method ? value.method : 'GET',
    dataType: value["dataType"] ? value["dataType"] : '',
    success: function (res) {
      if (value.success) {
        value.success(res);
      }
    },
    fail: function (res) {
      if (value.fail) {
        value.fail(res);
      }
    },
    complete: function (res) {
      if (value.complete) {
        value.complete(res);
      }
    }
  })
}

// 设置请求头是否带token
function getHeader () {
  if (_app.globalData.userInfor && _app.globalData.userInfor.api_token) {
    return { 'content-type': 'application/json', 'api_token': _app.globalData.userInfor.api_token }
  } else {
    return { 'content-type': 'application/json' }
  }
}

function init (value) {
  if (!_app) {
    _app = value;
  }
}

module.exports = {
  init: init,
  request: requests
}