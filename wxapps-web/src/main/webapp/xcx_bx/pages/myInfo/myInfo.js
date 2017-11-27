// pages/myInfo/myInfo.js
var _app = getApp();
var that;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    name: "这是名字",
    image: ""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    that = this;
    that.setData({
      name: _app.globalData.userInfo.nickName,
      image: _app.globalData.userInfo.avatarUrl
    });
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  onClickMyOrder: function () {
    wx.navigateTo({
      url: '/pages/myOrder/myOrder',
    })
  },

  onClickConsult: function () {
    wx.makePhoneCall({
      phoneNumber: "4000888222",
      success: function (res) {
        _app.log("已拨电话");
      },
      fail: function (res) {
        _app.log(res, "拨打电话失败");
        wx.showModal({
          title: '调用电话功能失败',
          content: '小程序官方正在解决这个问题，请手动拨打电话：4000-888-222，已将号码复制到粘贴板',
          showCancel: false,
          success: function () {
            wx.setClipboardData({
              data: '4000888222',
              fail: function (res) {
                _app.log(res, "复制电话号码");
              }
            })
          }
        })
      }
    })
  }
})