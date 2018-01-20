<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="../common/common.jsp" %>
<html>
	<head>
		<title>基本信息列表</title>
	</head>
	<body ng-app="app" ng-controller="myCtrl">
		<div class="layui-tab layui-tab-brief">
			<ul class="layui-tab-title">
				<li class="layui-this">高级搜索</li>
		  	</ul>
			<div class="layui-tab-content">
		    	<div class="layui-tab-item layui-show">
		    		<form class="layui-form" action="">
		    			<div class="layui-form-item">
						    <div class="layui-inline">
						      <label class="layui-form-label">餐厅名称：</label>
						      <div class="layui-input-inline">
						        <input type="text" name="shopName" id="shopName" autocomplete="off" class="layui-input">
						      </div>
						    </div>
						    <div class="layui-inline">
						      <label class="layui-form-label">新增日期(开始)：</label>
						      <div class="layui-input-inline">
						        <input type="text" name="createTimeStart" id="createTimeStart" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
						      </div>
						    </div>
						    <div class="layui-inline">
						      <label class="layui-form-label">新增日期(结束)：</label>
						      <div class="layui-input-inline">
						        <input type="text" name="createTimeEnd" id="createTimeEnd" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
						      </div>
						    </div>
						    <div class="layui-inline">
						      <div class="layui-input-inline">
						        <button class="layui-btn layui-btn-normal">查找</button>
						      </div>
						    </div>
					    </div>
					</form>
			    </div>
		  	</div>
		</div>
		<div class="layui-tab layui-tab-brief">
			<ul class="layui-tab-title">
				<li class="layui-this">门店列表</li>
		  	</ul>
		  	<div class="layui-tab-content">
		  		<div>
		  			<input type="button" class="layui-btn layui-btn-normal" value="新增" ng-click="addShop()" >
		  		</div>
		    	<div class="layui-tab-item layui-show">
		    		<table class="layui-hide" id="test" lay-filter="basic"></table>
		    	</div>
		    </div>
		</div>
		<div class="layui-tab-item">
	      <div id="pageDemo"></div>
	    </div>
		<script type="text/html" id="barDemo">
			<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  			<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  			<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
		</script>
		<script type="text/javascript">
			var app = angular.module('app',[]);
			app.controller('myCtrl',function($scope,$http){
				layui.use(['laydate','layer','laypage','table'],function(){
					var laydate = layui.laydate,//日期
					layer = layui.layer,//弹出层
					laypage = layui.laypage, //分页
					table = layui.table;//表格
					
					laydate.render({
						elem:'#createTimeStart'//指定元素
					});
					laydate.render({
						elem:'#createTimeEnd'//指定元素
					});
					//执行一个 table 实例
					table.render({
						elem: '#test',
					    url: '${pageContext.request.contextPath}/basic/info/getList', //数据接口
					    page: true, //开启分页
					    cols: [[ //表头
					      {field: 'shopName', title: '商店名称', width:80, fixed: 'left'},
					      {field: 'cutomerName', title: '商户负责人姓名', width:80},
					      {field: 'idCode', title: '身份证号', width:80, },
					      {field: 'shopCity', title: '城市', width:80} ,
					      {field: 'shopTelphone', title: '商户电话', width: 170},
					      {field: 'createTime', title: '创建时间', width: 80, },
					      {field: 'lstModTime', title: '最后修改时间', width: 80, },
					      {field: 'shopState', title: '商铺状态', width: 80},
					      {field: 'totalDealMoney', title: '累计成交金额', width: 135, },
					      {fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
					    ]]
					});
					//监听工具条
					table.on('tool(basic)',function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
						var data = obj.data;//获取当前行数据
						var layEvent = obj.event;//获得layevent属性
						var tr = obj.tr;//获取当前行trdom值
						if(layEvent=='detail'){
						alert(data.shopId);
							layer.open({
							  type: 2,
							  skin: 'layui-layer-rim', //加上边框
							  title:'编辑',
							  area: ['420px', '240px'], //宽高
							  content: '${pageContext.request.contextPath}/basic/info/toEditBasic?shopId'+data.shopId
							});
						}else if(layEvent == 'edit'){
							layer.open({
							  type: 1,
							  skin: 'layui-layer-rim', //加上边框
							  area: ['420px', '240px'], //宽高
							  content: data.cutomerName
							});
						}else if(layEvent == 'del'){
							alert('del'+data.cutomerName);
						}
					});
					
					$scope.addShop = function(){
						layer.open({
							  type: 2,
							  skin : 'layui-layer-lan', //加上边框49'layui-layer-lan'layui-layer-rim 
							  area : [ '80%', '80%' ], //宽高50
							  title:'新增商户',
							  content: '${pageContext.request.contextPath}/basic/info/toAddBasic',
							  btn:['提交','关闭'],
							  yes:function(index,layero){
								  //提交
							  },
							  btn2:function(index,layero){
								  
							  }
							});
					}
				});
			})
		</script>
	</body>
</html>