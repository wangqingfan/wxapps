<%@page language="java" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>layui测试页</title>
		<meta charset="UTF-8"/>	
		<link ref="${pageContext.request.contextPath }/resources/layui/css/layui.css"/>
	</head>
	<body>
		<h1>layui</h1>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resources/layui/layui.js"></script>
		<script type="text/javascript">
			layui.use(['layer','form'],function(){
				var layer = layui.layer,
				form = layui.form;
				layer.msg('Hello World');
			})
		</script>
	</body>
</html>