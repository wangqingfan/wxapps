//logs.js
const util = require('../../utils/util.js')
const _app = getApp();
Page({
  data: {
    logs: []
  },
  onLoad: function () {
    _app.log("onload")
    this.setData({
      logs: (wx.getStorageSync('logs') || []).map(log => {
        return util.formatTime(new Date(log))
      })
    })
  }
})
