<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="./../common/common.jsp"%>
<html>
	<head>
		<title>新增、编辑、查看商户信息</title>
	</head>
	<body>
		<form class="layui-form" id="addForm" action="${path }/basic/info/addBasic">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			  <legend>基本信息</legend>
			</fieldset>
			<div class="layui-form-item">
			    <div class="layui-inline">
			      <label class="layui-form-label">商户名称：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="shopName" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">负责人姓名：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cutomerName" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">负责人身份证号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="idCode" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">商户电话：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="shopTelphone" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			</div>
			<div class="layui-form-item">
				<div class="layui-inline">
			      <label class="layui-form-label">银行卡号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cardCode" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">开户人姓名：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cardCustomerName" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行预留手机号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="mobilephone" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行名称：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="bankName" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行编码：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="bankNo" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">小程序id：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="appId" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">卡类型：</label>
			      <div class="layui-input-inline">
			        <select name="cardType" lay-verify="required" lay-search="">
			          <option value="">直接选择或搜索选择</option>
			          <option value="1">储蓄卡</option>
			          <option value="2">信用卡</option>
			        </select>
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">商店状态：</label>
			      <div class="layui-input-inline">
			        <select name="shopState" lay-verify="required" lay-search="">
			          <option value="">直接选择或搜索选择</option>
			          <option value="1">可用</option>
			          <option value="2">停用</option>
			        </select>
			      </div>
			    </div>
			  </div>
			  <div class="layui-form-item">
			  	<div class="layui-inline">
			      <label class="layui-form-label">商店类型：</label>
			      <div class="layui-input-inline">
			        <select name="shopType" lay-verify="required" lay-search="" lay-filter="shopTypeFilter">
			          <option value="">直接选择或搜索选择</option>
			          <option value="1">餐厅</option>
			        </select>
			      </div>
			    </div>
			  	<div class="layui-inline restaurant">
			      <label class="layui-form-label">起送金额：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="leastConsume" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">配送距离：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="deliveryDistance" placeholder="公里为单位" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			     <label class="layui-form-label">开始营业时间：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="beginBussinessTime" class="layui-input" id="beginBussinessTime" placeholder="HH:mm:ss">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">结束营业时间：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="endBussinessTime" class="layui-input" id="endBussinessTime" placeholder="HH:mm:ss">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">公告：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="announcement" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">商户所在地址：</label>
			    <div class="layui-input-inline">
			      <select name="shopProvince"  id="shopProvince" lay-filter="shopProvinceFilter">
				    <option value="" selected="">请选择省</option>
			      	<c:forEach items="${provinces }" var="p">
				        <option value="${p.provinceName }" provinceId="${p.provinceId }">${p.provinceName }</option>
			      	</c:forEach>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="shopCity" id="shopCity" lay-filter="shopCityFilter">
			        <option value="" id="shopCityOption">请选择市</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="shopSubCity" id="shopSubCity">
			        <option value="">请选择县/区</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			        <input type="text" name="shopAddress" placeholder="详细地址" lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
			    
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">开户行地址：</label>
			    <div class="layui-input-inline">
			      <select name="province" id="province" lay-filter="provinceFilter">
			        <option value="">请选择省</option>
			        <c:forEach items="${provinces }" var="p">
				        <option value="${p.provinceName }" provinceId="${p.provinceId }">${p.provinceName }</option>
			      	</c:forEach>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="city" id="city" lay-filter="cityFilter">
			        <option value="">请选择市</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="street" id="street">
			        <option value="">请选择县/区</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			        <input type="text" name="bankAddress" placeholder="详细地址" lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
			  </div>
		</form>
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			  <legend>附件信息</legend>
			</fieldset>
			<div class="layui-upload">
			  <input type="button" class="layui-btn" id="test2" style="margin-left: 10px;" value="商店介绍图"/> 
			  <blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;margin-left: 10px;">
			    预览：
			    <div class="layui-upload-list" id="demo2"></div>
			 </blockquote>
			</div>
		<script>
			$(function(){
				$(".restaurant").hide();
			})
			layui.use(['form', 'layedit', 'laydate','upload'], function(){
			  var form = layui.form
			  ,layer = layui.layer
			  ,layedit = layui.layedit
			  ,laydate = layui.laydate
			  ,$ = layui.jquery
			  ,upload = layui.upload;
			  //商户所在地添加监听
			  //--------------------商户级联-----------
			  form.on('select(shopProvinceFilter)',function(data){
				  if(!data.value){
					  //清除全部
					  $("option").remove(".shopCityRemove");
					  $("option").remove(".shopSubCityRemove");
					  form.render('select');
				  }else{
					  var provinceId = $("#shopProvince").find('option:selected').attr("provinceId");
					  loadCity(provinceId,"shopCity","shopCityRemove","shopSubCityRemove").then(function(){form.render('select')});
				  }
			  })
			  form.on('select(shopCityFilter)',function(data){
				  if(!data.value){
					  $("option").remove(".shopSubCityRemove");
					  form.render('select');
				  }else{
					  var cityId = $("#shopCity").find('option:selected').attr("cityId");
					  loadSubCity(cityId,"shopSubCity","shopSubCityRemove").then(function(){form.render('select')});
				  }
			  })
			  form.on('select(shopTypeFilter)',function(data){
				  if(data.value != 1){
					  $(".restaurant").hide(1000);
				  }else{
					  $(".restaurant").show(1000);
				  }
			  })
			  //--------------------开户行级联-----------
			  form.on('select(provinceFilter)',function(data){
				  if(!data.value){
					  //清除全部
					  $("option").remove(".cityRemove");
					  $("option").remove(".subCityRemove");
					  form.render('select');
				  }else{
					  var provinceId = $("#province").find('option:selected').attr("provinceId");
					  loadCity(provinceId,"city","cityRemove","subCityRemove").then(function(){form.render('select')});;
				  }
			  })
			  form.on('select(cityFilter)',function(data){
				  if(!data.value){
					  $("option").remove(".subCityRemove");
					  form.render('select');
				  }else{
					  var cityId = $("#city").find('option:selected').attr("cityId");
					  loadSubCity(cityId,"street","subCityRemove").then(function(){form.render('select')});;
				  }
			  })
			  
			  
			  //多图片上传
			  upload.render({
			    elem: '#test2'
			    ,url: '${pageContext.request.contextPath}/attachment/upload?type=2'//类型为戴普介绍
			    ,multiple: true
			    ,before: function(obj){
			      //预读本地文件示例，不支持ie8
			      obj.preview(function(index, file, result){
			        $('#demo2').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img">')
			      });
			    }
			    ,done: function(res){
			      //上传完毕
			      alert(res.code);
			    }
			  });
			  
			  //时间选择器
			  laydate.render({
			  	elem: '#beginBussinessTime'
			  	,type: 'time'
			  });
			  //时间选择器
			  laydate.render({
			  	elem: '#endBussinessTime'
			  	,type: 'time'
			  });
			});
			
			function formSubmit(){
				var data = $("#addForm").serializableJson();	
				console.log(JSON.stringify(data));
				$.formJsonAjax({
					url:"${path}/basic/info/addBasic",
					data:data,
					success:function(result){
						if("success" == result.code){
							//在当前页面调用当前页面的关闭
							layer.alert('恭喜您，操作成功', {
							  icon: 1,
							  skin: 'layer-ext-moon',
							  yes:function(){
								var index = parent.layer.getFrameIndex(window.name);// 获取窗口索引
								parent.layer.close(index);
							  }
							});
						}
					}
				});
			}
		</script>
		
	</body>
</html>