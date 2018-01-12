const log = require("../utils/log");
const wxlog = require("../service/wxLog");
const http = require("../service/encaHttp");
const user = require("../service/userInfo");
var modal = require("../utils/alert");
var addrList = require("../utils/addrList.js");

let _app;
let _finished = false;

function init(value) {
  if (!_finished) {
    _app = value;
    initModule();
  }
}

function initModule() {
  http.init(_app);
  modal.init();

  // 打印信息
  _app.log = log.trace;

  //微信统计---url错误
  _app.urlLog = wxlog.urlBack;

  //场景值统计
  _app.sceneCount = wxlog.sceneCount;
  
  // 注册用户工具
  _app.user = user;

  // 注册获取数据时提示框的显示
  _app.alert = modal.alert;
  _app.alertFun = modal.alertFun;
  _app.confirm = modal.confirm;

  //http 注册
  // 注册统一http入口
  // _app.request = http.request; // 先注释掉 等待联调的时候打开
  // _app.requestBase = http.requestBase;// 先注释掉 等待联调的时候打开
  // 联调的时候需要注释掉
  _app.request = http.requestBase;

  //获取省市列表
  _app.getAddr = addrList.getAddr;

}

module.exports = {
  init: init
}