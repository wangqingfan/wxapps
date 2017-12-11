<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="common.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>北潇小程序系统</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black"> 
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">北潇小程序系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          			帅凡
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">订单信息</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;" mianFrameUrl="${pageContext.request.contextPath }/test/content" onclick="aa(event);">店内订餐</a></dd>
            <dd><a href="javascript:;">外卖</a></dd>
            <dd><a href="javascript:;">历史订单信息</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">解决方案</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">列表一</a></dd>
            <dd><a href="javascript:;">列表二</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item"><a href="">云市场</a></li>
        <li class="layui-nav-item"><a href="">发布商品</a></li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body" id="main">
    <iframe id="mainFrame" src="${pageContext.request.contextPath }/test/content" scrolling="no" frameborder="0" ></iframe>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © beixiao.com - 底部固定区域  - 猥琐页面
  </div>
</div>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});

$("#mainFrame").width($("#main").width());
$("#mainFrame").height($("#main").height());

window.onresize = function(){
//	$("#main").parent().width($("body").width() -310);
//	$("#mainFrame").width($("#main").width() -310).height($("main").height() -60);
}

function aa(e){
	alert($(e).attr('mianFrameUrl'));
}

</script>
</body>
</html>
