// pages/shoppingCart/shoppingCart.js
var app = getApp();
var that;
var list;
var tpri;
var tnum;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    showType: -1,
    totalPrice: 0,
    goodsList: [],
    totalNum: 0,
    //是否全选
    selectAll: 0,

    delBtnWidth: 124,//删除按钮宽度单位（rpx）
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    that = this;
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
    // list = getListFromCart();
    list = [];
    if (list.length == 0) {
      that.setData({
        showType: 0
      });
    } else {
      that.setData({
        showType: 1
      });
    }
    // tpri = app.card.totalPrice();
    // tnum = app.card.totalNum();
    tpri = 0;
    tnum = 0;

    that.setData({
      goodsList: list,
      totalPrice: tpri,
      totalNum: tnum
    });
    var arr = [];
    for (var i in list) {
      arr.push(list[i]["check"]);
    }
    if (arr.indexOf(false) == -1) {
      that.setData({
        selectAll: 1
      })
    } else {
      that.setData({
        selectAll: 0
      })
    }
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
  * 选中一款产品
  */
  clickCheckBox: function (e) {
    console.log("选中一款产品");
    var index = e.target.dataset.index;
    var res = app.card.check(index);
    list[index]["check"] = res;
    var arr = [];
    for (var i in list) {
      arr.push(list[i]["check"]);
    }
    tpri = app.card.totalPrice();
    console.log(tpri);
    tnum = app.card.totalNum();
    // debugger;
    if (arr.indexOf(false) == -1) {  //产品全部被选中
      that.setData({
        goodsList: list,
        selectAll: 1,
        totalPrice: tpri,
        totalNum: tnum
      })
    } else {
      that.setData({
        goodsList: list,
        selectAll: 0,
        totalPrice: tpri,
        totalNum: tnum
      })
    }
  },

  /**  
  * 选中全选
  */
  clickCheckAll: function (e) {
    console.log("选中全选");
    var res = app.card.checkAll();
    tpri = app.card.totalPrice();
    tnum = app.card.totalNum();
    if (res) {
      for (var i in list) {
        list[i]["check"] = true;
      }
      this.setData({
        goodsList: list,
        selectAll: 1,
        totalPrice: tpri,
        totalNum: tnum
      });
    } else {
      for (var i in list) {
        list[i]["check"] = false;
      }
      this.setData({
        goodsList: list,
        selectAll: 0,
        totalPrice: tpri,
        totalNum: tnum
      });
    }
  },


  /**
   * 商品数量减1
   */
  clickMinus: function (e) {
    console.log("商品数量减1");
    var index = e.currentTarget.dataset.index;
    var res = app.card.numMinus(index);
    tpri = app.card.totalPrice();
    tnum = app.card.totalNum();
    if (res == -1) {
      app.alert("不能再减少啦");
    } else {
      list[index]["num"] = res;
      that.setData({
        goodsList: list,
        totalPrice: tpri,
        totalNum: tnum
      })
    }
  },


  /**
   * 商品数量加1
   */
  clickAdd: function (e) {
    console.log("商品数量加1");
    var index = e.currentTarget.dataset.index;
    var res = app.card.numAdd(index);
    tpri = app.card.totalPrice();
    tnum = app.card.totalNum();
    list[index]["num"] = res;
    that.setData({
      goodsList: list,
      totalPrice: tpri,
      totalNum: tnum
    })
  },

  touchS: function (e) {
    console.log("开始触摸");
    if (e.touches.length == 1) {  //如果当前只有一个触摸点
      that.setData({
        //设置触摸起始点水平方向位置
        startX: e.touches[0].clientX
      });
      console.log("起始坐标 " + e.touches[0].clientX);
    }
  },

  touchE: function (e) {
    console.log(e);
    console.log("结束触摸");
    if (e.changedTouches.length == 1) {
      //手指移动结束后水平位置
      var endX = e.changedTouches[0].clientX;
      //触摸开始与结束，手指移动的距离
      var disX = that.data.startX - endX;
      var delBtnWidth = that.data.delBtnWidth;
      //如果距离小于删除按钮的1/2，不显示删除按钮
      var listStyle = disX > delBtnWidth / 2 ? "left:-" + delBtnWidth + "rpx" : "left:0px";
      //获取手指触摸的是哪一项
      var index = e.target.dataset.index;
      var goodslist = that.data.goodsList;
      goodslist[index]["listStyle"] = listStyle;
      //更新列表的状态
      that.setData({
        goodsList: goodslist
      });
    }
  },


  //点击删除按钮事件
  delItem: function (e) {
    //获取列表中要删除项的下标
    var id = e.currentTarget.dataset.id;
    app.card.remove(id);
    list = getListFromCart();
    tpri = app.card.totalPrice();
    tnum = app.card.totalNum();
    //更新列表的状态
    that.setData({
      goodsList: getListFromCart(),
      totalPrice: tpri,
      totalNum: tnum
    });
    if (that.data.goodsList.length == 0) {
      that.setData({
        showType: 0
      });
    }
  },

  //点击结算
  goSettle: function (evt) {
    app.request({
      "url": app.host + "user/collectformid/" + app.g.userInfo.id,
      "method": "post",
      "data": {
        formId: evt.detail.formId
      },
      "success": function (res) { },
      "fail": function (res) { }
    });

    var arr = [];
    for (var i in list) {
      arr.push(list[i]["check"]);
    }
    if (canPay(list)) {
      if (arr.indexOf(true) == -1) {  //没有选中任何产品
        app.alert("您还没有选择商品哦");
      } else { //产品不是全部被选中
        wx.navigateTo({
          url: '/pages/placeOrder/placeOrder?id=-100',
        })
      }
    } else {
      app.alert("商品火爆，限购3件", "", false);
    }
  },

  //回到商城首页
  goHome: function () {
    wx.switchTab({
      url: '/pages/index/index',
    })
  }
})

/**
 * 从购物车中获取数据，并格式化
 */
function getListFromCart() {
  var temp = app.card.getList();
  var re = [];
  for (var item in temp) {
    var tempItem = {};
    tempItem["name"] = temp[item]["name"];
    tempItem["id"] = temp[item]["goods_id"];
    tempItem["price"] = temp[item]["price"];
    tempItem["num"] = temp[item]["num"];
    tempItem["img"] = temp[item]["images"][0];
    tempItem["check"] = temp[item]["check"];
    re.push(tempItem);
  }
  return re;
}

/**
 * 验证是否可以支付
 */
function canPay(list) {
  var re = true;
  var num = 0;
  for (var i in list) {
    if (list[i]["check"]) {
      num += parseInt(list[i]["num"]);
    }
  }
  if (num > 3) {
    re = false;
  }
  return re;
}