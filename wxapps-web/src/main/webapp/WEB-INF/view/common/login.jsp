<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="common.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户登录</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
	</head>

	<body class="width-wrap" ng-app="app">
		
	    <nav class="nav navbar-default navbar-fixed-top" role="navigation">
	   	<div class="container">
	   		<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	   	     	<%-- <a href="#" class="navbar-brand">
	   	     		<img src="${pageContext.request.contextPath }/image/mylogo_login.png" style="height: 50px;margin-top:-15px;"/>
	   	     	</a> --%>
	   		</div>
	   		<div class="collapse navbar-collapse">
	   			<ul class="nav navbar-nav navbar-right main-header-nav">
		   			<li class="hidden-native"><a href="#">关于我们</a></li>
		   			<li class="hidden-native"><a href="#">联系我们</a></li>
		   			<li class="hidden-native"><a href="#">在线帮助</a></li>
		   		</ul>
	   		</div>
		</div>
	   </nav> 
	   <div style="height: 50px;"></div>

	   <div class="main-header" style="background-image: url(${pageContext.request.contextPath }/image/login-banner-bg.png)">
	        <div class="container">
	            <div class="row">
	                <div class="col-sm-12">
	                	<div class="col-sm-6 col-xs-6">
							<h1 style="color:#fff;">欢迎来到北潇小程序系统</h1>
							<h4 style="color:#fff;">方便查询、编辑、预览...</h4>
							<h4 style="color:#fff;">友好亲善</h4>
	            		</div>

	                	<div class="pull-right container col-md-3 col-sm-5 login-bg-color">
							<h3 class="page-header login-title">用户登录</h3>
							<form id="loginForm" class="form-horizontal" ng-controller="myCtrl">
								<div class="form-group input-group-lg">
									<div class="col-md-12">
										<input id="adminCode" name="adminCode" type="text" class="form-control" placeholder="用户名" ng-model="admin.adminCode"/>
										<p id="accountError" class="text-danger" style="margin-bottom:-5px;margin-top:5px;"></p>
									</div>
								</div>
								<div class="form-group">
									<div class="col-md-12">
										<input id="password" name="password" type="password" class="form-control" placeholder="密码" ng-model="admin.passwordstr"/>
										<p id="passwordError" class="text-danger" style="margin-bottom:-5px;margin-top:5px;"></p>
									</div>
								</div>
								<div class="form-group" style="margin-top:-10px;">
								    <div class="col-md-12">
								      <div class="checkbox">
								        <label><input id="rememberMe" type="checkbox" value="remember" name="rememberMe" form="justLogin">记住用户</label>
								        <%--
								        <label id="forgetPassword" class="pull-right" style="margin-bottom:10px"><a href="${pageContext.request.contextPath}/loginToModifyPwd.jhtml">忘记密码</a></label>
								      	--%>
								      </div>
								    </div>
								</div>
								<p id="loginError" class="text-danger"></p>
								<p id="lockError" class="text-danger"></p>
								<div class="form-group">
									<div class="col-md-12">
										<input type="button" style="width:100%;" ng-click="submit(admin)" class="btn btn-primary" id="loginButton" value="登&nbsp;&nbsp;录" />
									</div>
								</div>
							</form>
						</div>
	                </div>
	            </div>
	        </div>
    	</div>
    	<div class="container footer_nav_box" style="text-align:center; margin-top:10px;">
		   		
		   	<p class="footer-nav" style="margin:5px 0;">
		   		<a href="#">法律声明</a>
		   		<a href="#">友情链接</a>
		   	</p>
    		<p class="text-muted">2016-2019 baoxiao.com 版权所有 ICP证:浙B2-20080101</p>
    	</div>
    	<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
    	<script type="text/javascript" src="${pageContext.request.contextPath }/js/angular-route.js"></script>
		<script>
		var app = angular.module('app',['ngRoute']);
		app.config(['$httpProvider','$routeProvider',function($httpProvider,$routeProvider){
			$routeProvider
			.when('/index',{
				templateUrl:'${pageContext.request.contextPath }/test/layui'
			})
		}]);
		
		app.controller('myCtrl',function($scope,$http,$location){
			$scope.admin = {adminCode:'',password:'',passwordstr:''};
			$scope.submit = function(admin){
				$scope.admin.password = encode64($scope.admin.passwordstr + "");
				$http.post('${pageContext.request.contextPath}/login/login',$scope.admin)
				.success(function(data){
					alert(data);
					//$location.path("/index");
					window.location="${pageContext.request.contextPath }/test/layui";
				})
				.error(function(err){
					
				})
			}
		});
		</script>
	</body>
</html>
