const http = require("../utils/http");

// 存请求
let _list = [];
let _httpValue;
let _httpBackFun;

/**
 * 封装数据请求
 * 验证token是否过期，如果过期，先请求token 在执行方法 队列请求
 */
function requests (value, backFun) {
  // 判断是否正在等待请求token
  if (tokenLoading) {
    var temp = {};
    temp.value = value;
    temp.fun = backFun;
    _list.push(temp);
  } else {
    _httpValue = value;
    _httpBackFun = backFun;

    
  }
}