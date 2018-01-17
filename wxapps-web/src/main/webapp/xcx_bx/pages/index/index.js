//index.js
//获取应用实例
const app = getApp();
// 缓存this
let that;
// 进入页面时判断是否能进入点餐
let orderIdFlag = false;
// 点餐ID
let orderId;

Page({
  data: {
    //是否有商品数据
    hasData: 0,
    // 首页数据
    info: {},
  },
  
  onLoad: function (options) {
    that = this;
    if (options.hasOwnProperty("orderId")) {
      orderId = options.orderId;
      orderIdFlag = true;
    }
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs);
  },
  onShow: function () {
    if (!app.globalData.userInfo.hasOwnProperty("avatarUrl")){
      app.dataManager.prepareBaseInfo(getInfo); // 获取信息 开始注册等。。
    } else {
      getInfo();
    }
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
    return {
      title: "小程序名称！",
      path: "/pages/index/index",
      imageUrl: app.globalData.userInfo.avatarUrl,
      success: function (res) {
      },
      fail: function (res) {
        // 转发失败
      }
    }
  },

  /**
   * 事件处理函数
   */
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },

  /**
   * 拨打电话
   */
  makePhoneCall: function () {
    wx.makePhoneCall({
      phoneNumber: that.data.info.shopInfor.shopPhone
    })
  },

  /**
   * 跳转订餐
   */
  goToOrder: function () {
    if (orderIdFlag) {
      wx.navigateTo({
        url: '../myOrderFood/myOrderFood?orderId=' + orderId,
      })
    } else {
      app.alert("扫描桌面二维码才能进入点餐哦！", "", false);
    }
  },

  /**
   * 跳转预定
   */
  goToReservation: function () {

  },

  /**
   * 跳转外卖
   */
  goToTakeOut: function () {
    wx.navigateTo({
      url: '../takeOut/takeOut'
    })
  },

  /**
   * 跳转评论
   */
  goToComments: function () {

  },

  /**
   * 跳转地图
   */
  goToMyMap: function () {
    wx.navigateTo({
      url: '../myMap/myMap'
    })
  }
})

/**
 * 获取首页信息
 */
let getInfo = () => {
  // app.request({
  //   url: app.host + '/login',
  //   data: {},
  //   method: 'POST',
  //   success: getInfoSuccess,
  //   fail: getInfoFail
  // })
  getInfoSuccess();
}

/**
 * 获取首页信息成功
 */
function getInfoSuccess () {
  let data = {
    title: {
      shopName: "商店名称",
      disScope: 5,
      disMenoy: 40,
      business: "正在营业",
      sign: "参与本店分享活动可获取小菜或者随机红包",
      activeText: [
        { signal: "首", text: "首次消费满300.00元立减40元（不与其他活动同享）", color: "#64eb12" },
        { signal: "减", text: "满50减20", color: "#c0164e"}
      ]
    },
    rollingShow: {
      imgUrl: [
        'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
        'http://img06.tooopen.com/images/20160818/tooopen_sy_175866434296.jpg',
        'http://img06.tooopen.com/images/20160818/tooopen_sy_175833047715.jpg'
      ]
    },
    shopInfor: {
      shopName: "商店名称",
      shopAddress: "北京市海淀区北京市海淀区",
      shopPhone: "18511427712",
      shopTime: "00:00-23:55"
    },
    recommended: {
      features: [
        { imgUrl: "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg", title: "本店特色", foodName: ["铁板烤鸭"], praise: "镇店之宝掌柜力荐"},
        { imgUrl: "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg", title: "本店特色", foodName: ["铁板烤鸭"], praise: "低价酬宾", discount: "4.7折" },
        { imgUrl: "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg", title: "随缘一吃", foodName: ["铁板烤鸭"], praise: "咋还不点我呢" }
      ]
    }
  }
  that.setData({
    hasData: 1,
    userInfo: app.globalData.userInfo,
    info: data
  })
}

/**
 * 获取首页信息失败
 */
function getInfoFail() {

}