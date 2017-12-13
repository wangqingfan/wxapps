<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="common.jsp"%>
<html>
	<head>
		<title>北潇小程序系统</title>	
		<meta charset="UTF-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	    <meta name="renderer" content="webkit"/>
	    <meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/js/bootstrap-3.3.7-dist/css/bootstrap.min.css">
		<!-- 去除遮罩 -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/clearModalShade.css">
	</head>
	<body class="container-bg" ng-app="app" ng-controller="myCtrl">
		<div class="container" >
			<!-- Modal 去除模态框点击消失和ESC消失-->
			<div class="modal" id="myModal" tabindex="-1" data-backdrop="static" data-keyboard="false">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h4 class="modal-title" id="myModalLabel">请输入用户名和密码</h4>
			      </div>
			      <div class="modal-body">
			        <form action="" class="form-horizontal">
			        	<div class="form-group">
			        		<label for="userName" class="col-md-2 control-label">用户名：</label>
						    <div class="col-md-6">
						      <input type="text" class="form-control" id="userName" required ng-model="admin.adminCode" placeholder="用户名">
						    </div>
			        	</div>
			        	<div class="form-group">
			        		<label for="password" class="col-md-2 control-label">密码：</label>
						    <div class="col-md-6">
						      <input type="password" class="form-control" id="password" ng-model="admin.password" required placeholder="password">
						    </div>
			        	</div>
			        </form>
			      </div>
			      <div class="modal-footer">
			        <input type="button" class="btn btn-default" data-dismiss="modal" value="立即注册">
			        <button type="button" ng-click="submit(admin)" class="btn btn-primary">登录</button>
			      </div>
			    </div>
			  </div>
			</div>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#myModal").modal('show');
			});
			var app = angular.module('app',[]);
			app.config(function($httpProvider){
				$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
			})
			app.controller('myCtrl',function($scope,$http){
				$scope.admin = {adminCode:'',password:''};
				$scope.submit = function(admin){
					alert(1);
					$http.post('${pageContext.request.contextPath}/login/login',{adminCode:'aa',password:'aa'})
					.success(function(data){
						
					})
					.error(function(err){
						
					})
				}
			});
		</script>
	</body>
</html>