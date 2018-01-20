<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="./../common/common.jsp"%>
<html>
	<head>
		<title>新增、编辑、查看商户信息</title>
	</head>
	<body>
		<form class="layui-form" action="">
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
			      <label class="layui-form-label">商户所在地址：</label>
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
			        <input type="text" name="shopName" lay-verify="required" autocomplete="off" class="layui-input">
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
			      <label class="layui-form-label">卡类型：</label>
			      <div class="layui-input-inline">
			        <select name="cardType" lay-verify="required" lay-search="">
			          <option value="">直接选择或搜索选择</option>
			          <option value="1">储蓄卡</option>
			          <option value="2">信用卡</option>
			        </select>
			      </div>
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">商户所在地址：</label>
			    <div class="layui-input-inline">
			      <select name="shopProvince">
			        <option value="">请选择省</option>
			        <option value="浙江" selected="">浙江省</option>
			        <option value="你的工号">江西省</option>
			        <option value="你最喜欢的老师">福建省</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="shopCity">
			        <option value="">请选择市</option>
			        <option value="杭州">杭州</option>
			        <option value="宁波" disabled="">宁波</option>
			        <option value="温州">温州</option>
			        <option value="温州">台州</option>
			        <option value="温州">绍兴</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="shopSubCity">
			        <option value="">请选择县/区</option>
			        <option value="西湖区">西湖区</option>
			        <option value="余杭区">余杭区</option>
			        <option value="拱墅区">临安市</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			        <input type="text" name="shopAddress" placeholder="详细地址" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">开户行地址：</label>
			    <div class="layui-input-inline">
			      <select name="province">
			        <option value="">请选择省</option>
			        <option value="浙江" selected="">浙江省</option>
			        <option value="你的工号">江西省</option>
			        <option value="你最喜欢的老师">福建省</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="city">
			        <option value="">请选择市</option>
			        <option value="杭州">杭州</option>
			        <option value="宁波" disabled="">宁波</option>
			        <option value="温州">温州</option>
			        <option value="温州">台州</option>
			        <option value="温州">绍兴</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="street">
			        <option value="">请选择县/区</option>
			        <option value="西湖区">西湖区</option>
			        <option value="余杭区">余杭区</option>
			        <option value="拱墅区">临安市</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			        <input type="text" name="shopAddress" placeholder="详细地址" lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
			  </div>
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
		</form>
		<script>
			layui.use(['form', 'layedit', 'laydate','upload'], function(){
			  var form = layui.form
			  ,layer = layui.layer
			  ,layedit = layui.layedit
			  ,laydate = layui.laydate
			  ,$ = layui.jquery
			  ,upload = layui.upload;
			  
			  //监听提交
			  form.on('submit(demo1)', function(data){
			    layer.alert(JSON.stringify(data.field), {
			      title: '最终的提交信息'
			    })
			    return false;
			  });
			  
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
			      alert(res);
			    }
			  });
			
			});
		</script>
		
	</body>
</html>