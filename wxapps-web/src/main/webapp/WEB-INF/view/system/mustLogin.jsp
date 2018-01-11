<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="common.jsp"%>
<html>
	<head>
		<title>跳转登录页登录页</title>
	</head>
	<body ng-app="app">
		<h1 style="height:500px;line-height:500px;text-align:center;" ng-controller="myCtrl">欢迎来到北潇传媒文化有限公司,请先登录,{{second}}秒后跳转到登录页</h1>
		<script type="text/javascript">
			var app = angular.module('app',[]);
			app.controller('myCtrl',function($scope,$interval){
				$scope.second = 3;
				$interval(function(){
					$scope.second -= 1;
					if($scope.second == 0){
						window.location="${pageContext.request.contextPath }/login/toLogin";
					}
				},1000);
			})
		</script>
	</body>
</html>