package com.beixiao.wechat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.common.util.ValidateUtil;
import com.beixiao.wechat.dto.WechatResponse;
import com.beixiao.wechat.service.WechatOrderFromService;

@Controller
@RequestMapping("/wechat/orderForm")
public class WechatOrderFormController {

	private WechatOrderFromService wechatOrderFromService;
	
	/**
	 * 保存订单
	 * @author wqf V1.0 2018年2月5日 下午4:47:16
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Object save(@RequestParam Map<String,Object> param){
		WechatResponse<String> response = null;
		String type = (String)param.get("type");
		String dishesIds = (String)param.get("ids");
		String totalMoney = (String)param.get("totalMoney");
		String restaurantId = (String)param.get("restaurantId");
		if(ValidateUtil.isEmpty(type) || ValidateUtil.isEmpty(dishesIds) ||ValidateUtil.isEmpty(totalMoney) ||ValidateUtil.isEmpty(restaurantId)){
			response = new  WechatResponse<String>(WechatResponse.PARAM_INCOMPLETE_CODE,"请求参数为空",null);
		}else{
			wechatOrderFromService.saveOrderFrom(param);
			response = new  WechatResponse<String>(WechatResponse.SUCCESS_CODE,"处理成功",null);
		}
		return response;
	}
	
}
