// pages/myOrderFood/myOrderFood.js
//获取应用实例
const app = getApp();
// 缓存this
let that;

Page({
  data: {
    // 首页数据
    info: {}
  },

  onLoad: function (options) {
    that = this;
  },
  onShow: function () {
    if (!app.globalData.userInfo.hasOwnProperty("avatarUrl")) {
      app.dataManager.prepareBaseInfo(getInfo); // 获取信息 开始注册等。。
    } else {
      getInfo();
    }
  },

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
function getInfoSuccess() {
  let data = {
    title: {
      shopName: "商店名称",
      disScope: 5,
      disMenoy: 40,
      business: "正在营业",
      sign: "参与本店分享活动可获取小菜或者随机红包",
      activeText: [
        { signal: "首", text: "首次消费满300.00元立减40元（不与其他活动同享）", color: "#64eb12" },
        { signal: "减", text: "满50减20", color: "#c0164e" }
      ]
    },
  }
  that.setData({
    userInfo: app.globalData.userInfo,
    info: data
  })
}

/**
 * 获取首页信息失败
 */
function getInfoFail() {

}