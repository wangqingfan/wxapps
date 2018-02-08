<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@include file="./../common/common.jsp"%>
<html>
	<head>
		<title>新增、编辑、查看商户信息</title>
	</head>
	<body>
		<form class="layui-form" id="addForm" action="${path }/basic/info/addBasic">
			<input type="hidden" id="ids" name="ids" >
			<input type="hidden" id="flag" name="flag" value="${flag }">
			<input type="hidden" id="app_id" value="${basicInfo.miniApps.appId }">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			  <legend>基本信息</legend>
			</fieldset>
			<div class="layui-form-item">
			    <div class="layui-inline">
			      <label class="layui-form-label">商户名称：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="shopName" lay-verify="required" value="${basicInfo.shopName }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">负责人姓名：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cutomerName" lay-verify="required" value="${basicInfo.cutomerName }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">负责人身份证号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="idCode" lay-verify="required"  value="${basicInfo.idCode }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">商户电话：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="shopTelphone" lay-verify="required"  value="${basicInfo.shopTelphone }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			</div>
			<div class="layui-form-item">
				<div class="layui-inline">
			      <label class="layui-form-label">银行卡号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cardCode" lay-verify="required"  value="${basicInfo.customerCard.cardCode }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">开户人姓名：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="cardCustomerName" lay-verify="required"  value="${basicInfo.customerCard.cardCustomerName }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行预留手机号：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="mobilePhone" lay-verify="required"  value="${basicInfo.customerCard.mobilePhone }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行名称：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="bankName" lay-verify="required"  value="${basicInfo.bankInfo.bankName }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline">
			      <label class="layui-form-label">银行编码：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="bankNo" lay-verify="required"  value="${basicInfo.bankInfo.bankNo }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <c:if test="${empty basicInfo }">
				    <div class="layui-inline">
				      <label class="layui-form-label">小程序id：</label>
				      <div class="layui-input-inline">
				        <input type="text" id="appId" name="appId" lay-verify="required" value="" autocomplete="off" class="layui-input">
				      </div>
				    </div>
			    </c:if>
			    <div class="layui-inline">
			      <label class="layui-form-label">卡类型：</label>
			      <div class="layui-input-inline">
			        <select name="cardType" id="cardType" lay-verify="required" lay-search="" >
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
			        <input type="text" name="leastConsume" lay-verify="required"  value="${basicInfo.restaurant.leastConsume }" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">配送距离：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="deliveryDistance" placeholder="公里为单位" value="${basicInfo.restaurant.deliveryDistance }" lay-verify="required" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			     <label class="layui-form-label">开始营业时间：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="beginBussinessTime" class="layui-input" value="${basicInfo.restaurant.beginBussinessTime }" id="beginBussinessTime" placeholder="HH:mm:ss">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">结束营业时间：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="endBussinessTime" class="layui-input" id="endBussinessTime" value="${basicInfo.restaurant.endBussinessTime }" placeholder="HH:mm:ss">
			      </div>
			    </div>
			    <div class="layui-inline restaurant">
			      <label class="layui-form-label">公告：</label>
			      <div class="layui-input-inline">
			        <input type="text" name="announcement" lay-verify="required" autocomplete="off" value="${basicInfo.restaurant.announcement }" class="layui-input">
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
			        <input type="text" name="shopAddress" placeholder="详细地址" lay-verify="required" value="${basicInfo.shopAddress }" autocomplete="off" class="layui-input">
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
			        <input type="text" name="bankAddress" placeholder="详细地址" lay-verify="required" value="${basicInfo.bankInfo.bankAddress }"  autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  <div id="">
				  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				  	<legend>活动</legend>
				  </fieldset>
				  <div id="activityDiv">
				  	<c:forEach items="${basicInfo.activity }" var="a">
					  <div class="layui-form-item layui-form-text activity">
					  	<div class="layui-form-label">
							<input type="checkbox" name="open" checked="" lay-skin="switch" lay-text="ON|OFF">
						</div>
					    <div class="layui-input-block contentArea">
					      <textarea placeholder="请输入活动内容" name="" activityId="${a.activityId }" id="" class="layui-textarea">${a.content }</textarea>
					    </div>
					  </div>
				  	</c:forEach>
				  </div>
			  </div>
		</form>
			<c:if test="${not empty attachments}">
				<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				  <legend>已上传附件</legend>
				</fieldset>
				<table class="layui-table" lay-skin="line">
				  <colgroup>
				    <col width="150">
				    <col width="150">
				    <col width="200">
				    <col>
				  </colgroup>
				  <thead>
				    <tr>
				      <th class="attachmentId">附件id</th>
				      <th>附件名称</th>
				      <th>创建时间</th>
				      <th>操作</th>
				    </tr> 
				  </thead>
				  <tbody id="uploaded">
				  	<c:forEach items="${attachments }" var="a">
					    <tr>
					      <td class="attachmentId">${a.attachmentId }</td>
					      <td>${a.attachmentTitle }</td>
					      <td>${a.createTimeStr }</td>
					      <td>
					      	<button class="layui-btn layui-btn-sm layui-btn-normal layui-btn-radius" onclick='loadPhoto("${a.attachmentTitle}","${a.href}","${a.attachmentId }");'>预览</button>
					      	<button class="layui-btn layui-btn-sm layui-btn-danger layui-btn-radius" onclick="deleteThis(this)">删除</button>
						  </td>
					    </tr>
				  	</c:forEach>
				  </tbody>
				</table>
			</c:if>
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
		<script type="text/x-handlebars-template" id="addButtonTemp">
			<button type="button" id="addBtn"  lay-filter="demoButton"  lay-submit  class="layui-btn layui-btn-normal layui-btn-sm"><i class="layui-icon"></i></button>
		</script>
		<script type="text/x-handlebars-template" id="addActivityTemp">
			<div class="layui-form-item layui-form-text activity">
	  			<div class="layui-form-label">
					<input type="checkbox" name="open" checked="" lay-skin="switch" lay-text="ON|OFF">
				</div>
	    		<div class="layui-input-block contentArea">
	      			<textarea placeholder="请输入活动内容" name="" id="" class="layui-textarea"></textarea>
	    		</div>
	  		</div>
		</script>
		<script>
			$(function(){
				$(".restaurant").hide();
				$(".attachmentId").hide();
				getIds();
				//表单初始化后调用addButton()
				loadAddButton();
			})
			layui.use(['form', 'layedit', 'laydate','upload','element'], function(){
			  var form = layui.form
			  ,layer = layui.layer
			  ,layedit = layui.layedit
			  ,laydate = layui.laydate
			  ,$ = layui.jquery
			  ,upload = layui.upload
			  ,ele = layui.element;
			  //只能在表单初始化后调用，要不然会显示form,undefined
			  loadSelect();
			  //监听提交
			  form.on('submit(demoButton)', function(data){
				console.log(data);
				console.log(JSON.stringify(data));
				addActivity();
			    return false;
			  });
			  
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
			  });
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
			  });
			  
			  //--------------------开户行级联-----------
			  form.on('select(provinceFilter)',function(data){
				  if(!data.value){
					  //清除全部
					  $("option").remove(".cityRemove");
					  $("option").remove(".subCityRemove");
					  form.render('select');
				  }else{
					  var provinceId = $("#province").find('option:selected').attr("provinceId");
					  loadCity(provinceId,"city","cityRemove","subCityRemove").then(function(){form.render('select')});
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
			      if(res.code == "success"){
			    	  //上传成功
			    	  var ids = $("#ids").val();
			    	  if(ids){
			    		  ids +=","+res.msg;
			    	  }else{
			    		  ids = res.msg;
			    	  }
			    	  $("#ids").val(ids);
			      }
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
			  
			  
				//加载select,级联回显只能嵌套要不会有加载顺序问题
				function loadSelect(){
					//回显卡类型
					var cardType = "${basicInfo.customerCard.cardType }";
					if(cardType){
						$.each($("#cardType").find("option"),function(i,v){
							if($(v).val() == cardType){
								$(v)[0].selected = true;
							}
						})
					};
					var shopState = "${basicInfo.shopState }";
					if(shopState){
						$.each($("select[name=shopState]").find("option"),function(i,v){
							if($(v).val() == shopState){
								$(v)[0].selected = true;
							}
						});
					}
					var shopType = "${basicInfo.shopType }";
					if(shopType){
						$.each($("select[name=shopType]").find("option"),function(i,v){
							if($(v).val() == shopType){
								$(v)[0].selected = true;
								if(shopType == 1){
									$(".restaurant").show(1000);
								}
							}
						});
					}
					//商户地址级联
					var shopProvince = "${basicInfo.shopProvince }";
					if(shopProvince){
						var shopProvinceName = "";
						$.each($("select[name=shopProvince]").find("option"),function(i,v){
							if($(v).val() == shopProvince){
								$(v)[0].selected = true;
								shopProvinceName = $(v).text();
							}
						})
						loadCity(shopProvinceName,"shopCity","shopCityRemove","shopSubCityRemove").then(function(){
							var shopCity = "${basicInfo.shopCity}";
							if(shopCity){
								var cityName = "";
								$.each($("select[name=shopCity]").find("option"),function(i,v){
									if($(v).val() == shopCity){
										$(v)[0].selected = true;
										cityName =  $(v).text();
									}
								})
								loadSubCity(cityName,"shopSubCity","shopSubCityRemove").then(function(){
									var shopSubCity = "${basicInfo.shopSubCity}";
									if(shopSubCity){
										$.each($("select[name=shopSubCity]").find("option"),function(i,v){
											if($(v).val() == shopSubCity){
												$(v)[0].selected = true;
											}
										})
									}
									form.render('select');
								});
							}
							form.render('select');
						});
					}
					//开户行级联
					var province = "${basicInfo.bankInfo.province }";
					if(province){
						var provinceName = "";
						$.each($("select[name=province]").find("option"),function(i,v){
							if($(v).val() == province){
								$(v)[0].selected = true;
								provinceName =  $(v).text();
							}
						})
						loadCity(provinceName,"city","cityRemove","subCityRemove").then(function(){
							var city = "${basicInfo.bankInfo.city }";
							if(city){
								$.each($("select[name=city]").find("option"),function(i,v){
									if($(v).val() == city){
										$(v)[0].selected = true;
										city = $(v).text();
									}
								});
								loadSubCity(city,"street","subCityRemove").then(function(){
									var street = "${basicInfo.bankInfo.street }";
									if(street){
										$.each($("select[name=street]").find("option"),function(i,v){
											if($(v).val() == street){
												$(v)[0].selected = true;
											}
										});
									}
									form.render('select');
								});
							}
							form.render('select')
						});
					}
					
					var city = "${basicInfo.bankInfo.city}";
					if(city){
						var cityName = "";
						$.each($("select[name=city]").find("option"),function(i,v){
							if($(v).val() == city){
								$(v)[0].selected = true;
								city =  $(v).text();
							}
						})
					}
				}
				
				var activity = "${basicInfo.activity}";
				if(activity.length<1){
					addActivity();
				}
				
				//新增活动
				function addActivity(){
					var template = Handlebars.compile($("#addActivityTemp").html());
					var html =template();
					$("#activityDiv").append(html);
					$("#addBtn").remove();
					loadAddButton();
					form.render('checkbox')
				}
			});
			//预览图片
			function loadPhoto(alt,url,id){
				layui.use(['layer'], function(){
					layer.photos({
					    photos: {
					    	"title":"预览",
					    	"id": 0, //相册id
					    	"start": 0, //初始显示的图片序号，默认0
					    	"data":[
					    	 	{
					    	 		"alt":alt,	//图片名称
					    	 		"pid":id,	//图片id
					    	 		"src":url,	//原图地址
					    	 		"thumb":""	//缩略图地址
					    	 	}       
					    	 ]
					    },
						shift: 5 //0-6的选择，指定弹出图片动画类型，默认随机
					 })
				})
			}
			
			//删除图片
			function deleteThis(e){
				var td = $(e).parents("tr").find("td")[0];
				var attachmentId = td.innerHTML;
				var data = {id:attachmentId};
				$.formJsonAjax({
					url:"${path}/attachment/deleteAtt",
					data:data,
					success:function(result){
						if(result.code == "success"){
							layer.alert('恭喜您，操作成功', {
								  icon: 1,
								  skin: 'layer-ext-moon'
							});
							$(td).parent().remove();
							getIds();
						}
					}
				})
			}
			//表单提交
			function formSubmit(){
				var data = $("#addForm").serializableJson();
				console.log(JSON.stringify(data));
				//app_id只有在编辑页面才会有值
				var app_id = $("#app_id").val();
				if(app_id){
					$.extend(data,{appId:$("#app_id").val()});
				}
				//获取活动
				var activities = new Array();
				$.each($("#activityDiv").find("textarea"),function(i,v){
					if($(v).parent().prev().find("input").is(":checked")){
						//选中了，获取当前文本域的内容
						var content = $(v).val();
						var activityId = $(v).attr("activityId");
						console.log("activityId----------"+activityId);
						if(!activityId){
							activityId = "";
						}
						var dat = {};
						dat.content = content;
						dat.id=activityId;
						activities.push(dat);
					}
				});
				$.extend(data,{activities:JSON.stringify(activities)});
				console.log(JSON.stringify(data));
				$.ajax({
					url:"${path}/basic/info/addBasic",
					traditional:true,
					data:data,
					type:'POST',
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
			
			function getIds(){
				var ids = "";
				var trs = $("#uploaded").find("tr");
				$.each(trs,function(i,v){
					var td = $(v).find("td")[0];
					if(ids == ""){
						ids = td.innerHTML;
					}else{
						ids += ","+td.innerHTML;
					}
				})
				$("#ids").val(ids);
			}
			//显示新增按钮
			function loadAddButton(){
				var template = Handlebars.compile($("#addButtonTemp").html());
				var html =template();
				$("#activityDiv .activity:last").find(".contentArea").append(html);
			}
		</script>
	</body>
</html>