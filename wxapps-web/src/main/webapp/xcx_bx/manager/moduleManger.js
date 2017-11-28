const log = require("../utils/log");
const wxlog = require("../service/wxLog");
const http = require("../service/encaHttp");
const user = require("../service/userInfo");
var modal = require("../utils/alert");


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
  // 注册用户工具
  _app.user = user;

  _app.confirm = modal.confirm;
  // 注册获取数据时提示框的显示
  _app.alert = modal.alert;
  _app.alertFun = modal.alertFun;

}

module.exports = {
  init: init
}