function trace(value, msg) {
  var _pages = getCurrentPages(); // 获取页面路由
  var _baseInfo = "";
  if (_pages && _pages.length > 0) {
    _baseInfo = "----" + _pages[_pages.length - 1].route + ": "
  } else {
    _baseInfo = "----app: ";
  }
  if (msg) {
    console.log(_baseInfo + msg + "  ", value);
  } else {
    console.log(_baseInfo, value);
  }
}

module.exports = {
  trace: trace,
}