const log = require("../utils/log");
const wxlog = require("../service/wxLog");

let _app;
let _finished = false;

function init(value) {
  if (!_finished) {
    _app = value;
    initModule();
  }
}

function initModule() {
  // 打印信息
  _app.log = log.trace;
  //微信统计---url错误
  _app.urlLog = wxlog.urlBack;
  //场景值统计
  _app.sceneCount = wxlog.sceneCount;

}

module.exports = {
  init: init
}