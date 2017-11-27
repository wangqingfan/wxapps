//场景值列表
var _secenObj = [
  { id: "1001", name: "发现栏小程序主入口" },
  { id: "1005", name: "顶部搜索框的搜索结果页" },
  { id: "1006", name: "发现栏小程序主入口搜索框的搜索结果页" },
  { id: "1007", name: "单人聊天会话中的小程序消息卡片" },
  { id: "1008", name: "群聊会话中的小程序消息卡片" },
  { id: "1011", name: "扫描二维码" },
  { id: "1012", name: "长按图片识别二维码" },
  { id: "1013", name: "手机相册选取二维码" },
  { id: "1014", name: "小程序模版消息" },
  { id: "1017", name: "前往体验版的入口页" },
  { id: "1019", name: "微信钱包" },
  { id: "1020", name: "公众号 profile 页相关小程序列表" },
  { id: "1022", name: "聊天顶部置顶小程序入口" },
  { id: "1023", name: "安卓系统桌面图标" },
  { id: "1024", name: "小程序 profile 页" },
  { id: "1025", name: "扫描一维码" },
  { id: "1026", name: "附近小程序列表" },
  { id: "1027", name: "“使用过的小程序”列表" },
  { id: "1028", name: "我的卡包" },
  { id: "1029", name: "卡券详情页" },
  { id: "1031", name: "长按图片识别一维码" },
  { id: "1032", name: "手机相册选取一维码" },
  { id: "1034", name: "微信支付完成页" },
  { id: "1035", name: "公众号自定义菜单" },
  { id: "1036", name: "App 分享消息卡片" },
  { id: "1037", name: "小程序打开小程序" },
  { id: "1038", name: "从另一个小程序返回" },
  { id: "1039", name: "摇电视" },
  { id: "1042", name: "添加好友搜索框的搜索结果页" },
  { id: "1043", name: "公众号模板消息" },
  { id: "1044", name: "带 shareTicket 的小程序消息卡片" },
  { id: "1047", name: "扫描小程序码" },
  { id: "1048", name: "长按图片识别小程序码" },
  { id: "1049", name: "手机相册选取小程序码" },
  { id: "1052", name: "卡券的适用门店列表" },
  { id: "1053", name: "搜一搜的结果页" },
  { id: "1054", name: "顶部搜索框小程序快捷入口" },
  { id: "1056", name: "音乐播放器菜单" },
  { id: "1058", name: "公众号文章" },
  { id: "1059", name: "体验版小程序绑定邀请页" },
  { id: "1064", name: "微信连Wifi状态栏" },
  { id: "1067", name: "公众号文章广告" },
  { id: "1068", name: "	附近小程序列表广告" },
  { id: "1072", name: "二维码收款页面" },
  { id: "1073", name: "客服消息列表下发的小程序消息卡片" },
  { id: "1074", name: "公众号会话下发的小程序消息卡片" }
]
/**
 * 接口错误统计
 */
function urlErrorBack(value) {
  if (!value.url) {
    value.url = "no url";
  }
  if (!value.code) {
    value.code = "no code";
  }
  if (!value.msg) {
    value.msg = "no msg";
  }
  if (!value.uid) {
    value.uid = "no uid";
  }
  if (!value.page) {
    value.page = "no page";
  }
  wx.reportAnalytics('api_back', {
    url: value.url + "",
    code: value.code + "",
    msg: value.msg + "",
    time: getTime() + "",
    uid: value.uid + "",
    page: value.page,
  });
}

/**
 * 场景值详细统计
 */
function sceneCount(value, opeinid) {
  var temp = value;
  if (!temp.scene) {
    temp.scene = "no scene";
  }
  if (!temp.path) {
    temp.path = "no path";
  }
  temp.name = getSecenName(value.scene);
  temp.query = getQurey(value);
  if (opeinid) {
    temp.openid = opeinid;
  } else {
    temp.openid = "no id";
  }
  wx.reportAnalytics('scene_detial', {
    scene: temp.scene,
    scene_name: temp.name,
    path: temp.path,
    query: temp.query,
    openid: temp.openid,
    time: getTime() + "",
  });
}

/**
 * 根据id获取场景值名称
 */
function getSecenName(value) {
  var re = "no name";
  for (var i in _secenObj) {
    if (_secenObj[i]["id"] == value) {
      re = _secenObj[i]["name"]
      return re;
    }
  }
  return re;
}

/**
 * 获取query参数
 */
function getQurey(value) {
  var re = "no query";
  if (value.query) {
    re = "";
    if (value.query.scene && value.query.scene != "") {
      re = decodeURIComponent(value.query["scene"]);
      if (re.indexOf("marketing") != -1) {
        marketingCount(re);
      }
    } else {
      for (var item in value.query) {
        re += item + ":" + value.query[item] + "  "
      }
    }
  }
  return re;
}

/**
 * 统计渠道二维码个数
 */
function marketingCount(value) {
  wx.reportAnalytics('marketing_count', {
    val: value,
  });
}

/**
 * 获取格式化后的时间
 * hh/mm/ss/ms
 */
function getTime() {
  var re = "";
  var tempDate = new Date();
  re = tempDate.getHours() + ":" + tempDate.getMinutes() + ":" + tempDate.getSeconds() + ":" + tempDate.getMilliseconds();
  return re;
}

module.exports = {
  urlBack: urlErrorBack,
  sceneCount: sceneCount
}