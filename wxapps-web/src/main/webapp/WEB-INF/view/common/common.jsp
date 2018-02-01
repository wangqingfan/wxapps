<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
    String contextPath = request.getContextPath();
    pageContext.setAttribute("path", contextPath);
       
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
	pageContext.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
	<head lang="zh-CN">
		<meta charset="UTF-8"/>
	    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	    <meta name="renderer" content="webkit"/>
	    <meta name="viewport" content="width=device-width, initial-scale=1"/>
	    <title>后台管理系统</title>
	    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/layui/css/layui.css">
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js" ></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/layui/layui.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/angular.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/handlebars-v4.0.10.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/serializableJson.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/valid/jquery.validate.min.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath }/js/valid/localization/messages_zh.min.js"></script>
	</head>
	<body>
		<script type="text/x-handlebars-template" id="city-template">
			{{#each citys}}
				<option value={{cityName}} cityId={{cityId}} class={{className}}>{{cityName}}</option>
			{{/each}}
		</script>
		<script type="text/x-handlebars-template" id="subCity-template">
			{{#each subCitys}}
				<option value={{subCityName}} cityId={{subCityId}} class={{className}}>{{subCityName}}</option>
			{{/each}}
		</script>
		<script type="text/javascript">
			//加载城市
			function loadCity(id,ele,cityClear,subCityClear){
				return new Promise(function(resolve,reject){
					$("option").remove("."+cityClear);
					$("option").remove("."+subCityClear);
					var url = "";
					if(Number(id)){
						url = "${pageContext.request.contextPath}/system/getCity";
					}else{
						url = "${pageContext.request.contextPath}/system/getCityByName";
					}
					$.ajax({
						type:"POST",
						data:{id:id},
						dataType:"JSON",
						url: url,
						success:function(data){
							var result = {};
							result.citys = data;
							for(var i = 0;i<result.citys.length;i++){
								result.citys[i].className=cityClear;
							}
							var template = Handlebars.compile($("#city-template").html());
							var html =template(result);
							$("#"+ele).append(html);
							resolve();
						}
					})
				})
			}
			
			//加载区
			function loadSubCity(id,ele,clear){
				return new Promise(function(resolve,reject){
					$("option").remove("."+clear);
					var url = "";
					if(Number(id)){
						url = "${pageContext.request.contextPath}/system/getSubCity";
					}else{
						url = "${pageContext.request.contextPath}/system/getSubCityByName";
					}
					$.ajax({
						type:"POST",
						data:{id:id},
						dataType:"JSON",
						url:url,
						success:function(data){
							var result = {};
							result.subCitys = data;
							for(var i = 0;i<result.subCitys.length;i++){
								result.subCitys[i].className=clear;
							}
							var template = Handlebars.compile($("#subCity-template").html());
							var html =template(result);
							console.log(id+"html------------------"+html);
							$("#"+ele).append(html);
							resolve();
						}
					})
					
				})
			}
		</script>
	</body>
</html>
