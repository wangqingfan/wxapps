package com.beixiao.wechat.controller;

import java.util.Map;





import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.common.util.ValidateUtil;
import com.beixiao.evaluate.domain.Evaluate;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.restaurant.service.RestaurantService;
import com.beixiao.wechat.dto.WechatResponse;

@Controller
@RequestMapping("/wechat/evaluate")
public class WechatEvaluateController {

	@Resource
	private RestaurantService restaurantService;
	
	/**
	 * 查询基本评价
	 * @author wqf V1.0 2017年12月28日 下午6:11:34
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
				response = new WechatResponse<Restaurant>(WechatResponse.SERVICE_DATA_ERROR_CODE, "查询餐厅数据为空");
			}
		}else{
			response = new WechatResponse<Restaurant>(WechatResponse.PARAM_INCOMPLETE_CODE, "请求参数不全");
		}
		return response;
	}
	
	
	/**
	 * 分页查询餐厅评价
	 * @author wqf V1.0 2017年12月28日 下午6:17:08
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/getEvaluateOfPage")
	@ResponseBody
	public Object getEvaluateOfPage(@RequestParam Map<String,Object> param){
		return null;
	}
}
