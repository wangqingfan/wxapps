//index.js
//获取应用实例
const app = getApp();
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
    console.log(wx.canIUse('button.open-type.getUserInfo'))
    if (app.globalData.userInfo.length > 0) {
      console.log(app.globalData.userInfo)
      that.setData({
        hasData: 0
      })
    } else {
    }
    
  }
})