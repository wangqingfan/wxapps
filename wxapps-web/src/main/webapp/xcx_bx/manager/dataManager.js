let _app;
let _user;
let _finished = false;
let _prepareBackFun;

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
    options: {},
  }
}

function prepareBaseInfo(backFun) {
  _prepareBackFun = backFun;
  //检测基础数据信息是否已经获取
  _user.checkBaseInfo(prepareBseInfoBack);
}

function prepareBseInfoBack() {
  _prepareBackFun();// 入口 开始调用
}

// 接口是否等待
function isLoadingUserInfo() {
  return _user.isLoading();
}

module.exports = {
  init: init,
  prepareBaseInfo: prepareBaseInfo,
  isLoadingUserInfo: isLoadingUserInfo
}