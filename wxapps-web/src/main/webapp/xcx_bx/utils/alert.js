var _relanchFlag = true;

function alert(content, url, showCancel) {
  wx.showModal({
    title: '温馨提示',
    content: content,
    showCancel: showCancel,
    success: function (res) {
      var tempUrl = "";
      if (url) {
        if (url == "/") {
          tempUrl = "/pages/index/index";
        } else {
          tempUrl = url;
        }
        if (res.confirm) {
          _relanchFlag = false;
          wx.reLaunch({
            url: tempUrl,
            complete: function () {
              _relanchFlag = true;
            }
          })
        }
      } else {
        // if (res.confirm) {
        //   console.log('用户点击确定')
        // } 
      }
    }
  })
}



function confirm(content, func, value) {
  wx.showModal({
    title: '温馨提示',
    content: content,
    showCancel: true,
    success: function (res) {
      if (res.confirm) {
        if (value) {
          func(value);
        } else {
          func();
        }
      }
    }
  })
}

function alertFun(content, func, value) {
  wx.showModal({
    title: '温馨提示',
    content: content,
    showCancel: false,
    success: function (res) {
      if (res.confirm) {
        if (value) {
          func(value);
        } else {
          func();
        }
      }
    }
  })
}

function init() {
  _relanchFlag = true;
}


module.exports = {
  alert: alert,
  confirm: confirm,
  alertFun: alertFun,
  init: init
}