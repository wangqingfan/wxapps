//index.js
//获取应用实例
const app = getApp();
const _http = require("../../utils/http");

let that;

Page({
  data: {
    motto: 'Hello World',
    hasData: 0,
    userInfo: {}
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    that = this;
    this.setData({
      hasData: 0
    });
    
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs);
  },
  onShow: function () {
    if (!app.globalData.userInfo.hasOwnProperty("avatarUrl")){
      app.dataManager.prepareBaseInfo(getUser); // 获取信息 开始注册等。。
    } else {
      getUser();
    }
  }
})

function getUser () {
  that.setData({
    hasData: 1,
    userInfo: app.globalData.userInfo
  })
  _http.request({
    url: app.host + '/login',
    data: {
    },
    method: 'POST',
    success: function (res) {
      console.log(res)
    },
    fail: function (res) {
      console.log(res);
    }
  })
}