let _app;
let _user;
let _finished = false;

/**
 * 初始化
 */
function init (value) {
  if (!_finished) {
    _app = value;
    _user = _app.user;
    initData();
  }
}

/**
 * 初始化数据
 */
function initData () {
  _user.init(_app);
  _app.globalData = {
    userInfo: {},
    address: {},
    invoice: {},
    initFlag: false,
    options: {},
    //首页和砍价首页的顶导图片
    topImg: {}
  }
}

module.exports = {
  init: init
}