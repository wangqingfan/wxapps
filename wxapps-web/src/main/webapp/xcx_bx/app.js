// 2017 / 11 / 27
//app.js
const moduleManger = require("./manager/moduleManger");
const dataManager = require("./manager/dataManager");

App({
  onLaunch: function (options) {
    moduleManger.init(this);
    dataManager.init(this);
    this.dataManager = dataManager;
    this.log("onLaunch");
  },
  onShow: function (options) {
    this.log("onShow");
    this.globalData.options = options;
    this.sceneCount(options);
    this.log(options, "onShow");
  },
  host: "这里是host"
})