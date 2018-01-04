package com.beixiao.wechat.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.beixiao.common.util.ValidateUtil;
import com.beixiao.dishes.domain.Dishes;
import com.beixiao.wechat.dto.WechatResponse;
import com.beixiao.wechat.service.WechatProductService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/wechat/product")
public class WechatProductController {
	
	private Logger logger = LoggerFactory.getLogger(WechatProductController.class); 
	
	@Resource
	private WechatProductService wechatProductService;
	
	/**
	 * 通过shopId获取产品
	 * @author wqf V1.0 2018年1月4日 上午9:58:22
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/findProductByShopId")
	@ResponseBody
	public Object findProductByShopId(@RequestParam Map<String,Object> param){
		String shopId = (String)param.get("shopId");
		String pageNum = (String)param.get("pageNum");
		String pageSize = (String)param.get("pageSize");
		logger.info("-----shopId:"+shopId+"---findProductByShopId---param："+param);
		WechatResponse<PageInfo<Dishes>> response = null;
		try {
			if(!ValidateUtil.isEmpty(shopId) && !ValidateUtil.isEmpty(pageNum)&& !ValidateUtil.isEmpty(pageSize)){
				response = wechatProductService.findProductByShopId(param);
			}else{
				response = new WechatResponse<PageInfo<Dishes>>(WechatResponse.PARAM_INCOMPLETE_CODE, "请求参数为空");
			}
		} catch (Exception e) {
			logger.error("-----shopId:"+shopId+"---findProductByShopId---error:：",e);
			response = new WechatResponse<PageInfo<Dishes>>(WechatResponse.EXCEPTION_CODE, "系统服务异常");
		}
		logger.info("-----shopId:"+shopId+"---findProductByShopId---返回数据:："+JSONObject.toJSONString(response));
		return response;
	}
}
