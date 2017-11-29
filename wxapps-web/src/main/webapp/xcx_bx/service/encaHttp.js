const http = require("../utils/http");

// 存请求
let _list = [];
let _httpValue;
let _httpBackFun;
let _app;
let _index = 0;


/**
 * 封装数据请求
 * 验证token是否过期，如果过期，先请求token 在执行方法 队列请求
 */
function requests (value, backFun) {
  // 判断是否正在等待请求token
  if (_app.dataManager.isLoadingUserInfo()) {
    var temp = {};
    temp.value = value;
    temp.fun = backFun;
    _list.push(temp);
  } else {
    _httpValue = value;
    _httpBackFun = backFun;
    //让数据中心准备token信息
    _app.dataManager.prepareBaseInfo(back);
  }
}

function back() {
  http.request(_httpValue, _httpBackFun);
  if (_list.length > 0) {
    for (var item in _list) {
      if (item == _index) {
        _index++;
        _httpValue = _list[item]["value"];
        _httpBackFun = _list[item]["fun"];
        _app.dataM.prepareBaseInfo(back);
      }
    }
  }
}

// 原始封装
function requestBase(value, backFun) {
  http.request(value, backFun);
}

function init(value) {
  if (!_app) {
    _app = value;
    _list = [];
    _index = 0;
    http.init(value);
  }
}

module.exports = {
  init: init,
  requestBase: requestBase,
  request: requests
}