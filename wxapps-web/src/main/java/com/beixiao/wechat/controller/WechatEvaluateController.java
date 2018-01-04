package com.beixiao.wechat.controller;

import java.util.List;
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
import com.beixiao.evaluate.domain.Evaluate;
import com.beixiao.evaluate.service.EvaluateService;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.restaurant.service.RestaurantService;
import com.beixiao.wechat.dto.WechatResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/wechat/evaluate")
public class WechatEvaluateController {

	private Logger logger = LoggerFactory.getLogger(WechatEvaluateController.class);
	
	@Resource
	private RestaurantService restaurantService;
	@Resource
	private EvaluateService evaluateService;
	
	/**
	 * 获取商店的基本餐厅信息
	 * @author wqf V1.0 2018年1月2日 上午11:56:53
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/getShopBasicEvaluate")
	@ResponseBody
	public Object getShopBasicEvaluate(@RequestParam Map<String,Object> param){
		String shopId = (String)param.get("shopId");
		WechatResponse<Restaurant> response = null;
		if(!ValidateUtil.isEmpty(shopId)){
			Restaurant restaurant = restaurantService.findByShopId(Integer.parseInt(shopId));
			if(!ValidateUtil.isEmpty(restaurant)){
				response = new WechatResponse<Restaurant>(WechatResponse.SUCCESS_CODE, "查询成功", restaurant);
			}else{
				response = new WechatResponse<Restaurant>(WechatResponse.SERVICE_DATA_ERROR_CODE, "查询不到下属餐厅");
			}
		}else{
			response = new WechatResponse<Restaurant>(WechatResponse.PARAM_INCOMPLETE_CODE, "请求参数为空");
		}
		return response;
	}
	
	
	
	
	/**
	 * 分页获取评价
	 * @author wqf V1.0 2018年1月2日 上午11:56:45
	 * @param param
	 * @param pageNum
	 * @param pageSize
	 * @return Object
	 */
	@RequestMapping("/getEvaluateOfPage")
	@ResponseBody
	public Object getEvaluateOfPage(@RequestParam Map<String,Object> param,
			@RequestParam("pageNum") Integer pageNum,
			@RequestParam("pageSize") Integer pageSize){
		String restaurantId = (String)param.get("restaurantId");
		WechatResponse<PageInfo<Evaluate>> response = null;
		if(!ValidateUtil.isEmpty(restaurantId) && !ValidateUtil.isEmpty(pageNum) && !ValidateUtil.isEmpty(pageSize)){
			//分页
			PageHelper.startPage(pageNum, pageSize);
			List<Evaluate> list = evaluateService.findByRestaurant(Integer.parseInt(restaurantId));
			PageInfo<Evaluate> evaluates = new PageInfo<Evaluate>(list);
			response = new WechatResponse<PageInfo<Evaluate>>(WechatResponse.SUCCESS_CODE,"查询成功",evaluates);	
		}else{
			response = new WechatResponse<PageInfo<Evaluate>>(WechatResponse.PARAM_INCOMPLETE_CODE,"请求参数为空");	
		}
		logger.info("---restaurantId："+restaurantId+"-----getEvaluateOfPage-"+JSONObject.toJSONString(response));
		return response;
	}
}
