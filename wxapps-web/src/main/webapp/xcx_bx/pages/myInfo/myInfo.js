// pages/myInfo/myInfo.js
var app = getApp();
var that;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    name: "这是名字",
    image: "",
    phoneNumber: "18511427712",
    versionNum: "v1.01"
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    that = this;
    that.setData({
      name: app.globalData.userInfo.nickName,
      image: app.globalData.userInfo.avatarUrl
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

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
    return {
      title: "小程序名称！",
      path: "/pages/index/index",
      imageUrl: that.data.image,
      success: function (res) {
      },
      fail: function (res) {
        // 转发失败
      }
    }
  },

  /**
    * 跳转订单页面
    */
  onClickMyOrder: function () {
    wx.navigateTo({
      url: '/pages/myOrder/myOrder',
    })
  },

  /**
  * 跳转收货地址
  */
  onClickShipAddress: function () {
    getWxAddress();
  },

  /**
   * 卡卷
   */
  onClickCard: function () {
    wx.showModal({
      title: '调用卡卷功能失败',
      content: '卡卷功能待开发中...',
      showCancel: false,
      success: function () {
        // 
      }
    })
  },

  /**
   * 点击连接wifi
   */
  onClickWifi: function () {
    wx.showModal({
      title: '调用WIFI功能失败',
      content: 'WIFI功能待开发中...',
      showCancel: false,
      success: function () {
        // 
      }
    })
  },

 

  /**
   * 客服电话
   */
  onClickConsult: function () {
    wx.makePhoneCall({
      phoneNumber: that.data.phoneNumber,
      success: function (res) {
        app.log("已拨电话");
      },
      fail: function (res) {
        app.log(res, "拨打电话失败");
        wx.showModal({
          title: '调用电话功能失败',
          content: '小程序官方正在解决这个问题，请手动拨打电话：'+ that.data.phoneNumber + '，已将号码复制到粘贴板',
          showCancel: false,
          success: function () {
            wx.setClipboardData({
              data: that.data.phoneNumber,
              fail: function (res) {
                app.log(res, "复制电话号码");
              }
            })
          }
        })
      }
    })
  }
})

/**
 * 获取微信地址
 */
function getWxAddress () {
  wx.chooseAddress({
    success: function (res) {
      // 告知用户点击确定获取数据 最好只告知一次。
      console.log(res.userName)
      console.log(res.postalCode)
      console.log(res.provinceName)
      console.log(res.cityName)
      console.log(res.countyName)
      console.log(res.detailInfo)
      console.log(res.nationalCode)
      console.log(res.telNumber)
      // 收货地址添加过之后传入后台存入 点餐时即使删除了微信地址也直接从后台获取
    },
    fail: function (res) {
      app.alertFun("允许授权，才能更好的服务", function () {
        wx.openSetting({
          success(settingdata) {
            if (settingdata.authSetting['scope.userInfo']) {
              // getWxAddress();
              app.log('获取权限成功，再次请求用户数据')
            }
            else {
              app.log('获取权限失败，无法继续');
              app.alert("请重新打开此小程序，并允许授权", "", false);
            }
          }
        })
      });
    }
  })
}