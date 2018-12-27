package com.beixiao.wechat.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import com.beixiao.orderform.domain.FoodOrder;
import com.beixiao.orderform.repository.FoodOrderDao;
import com.beixiao.wechat.service.WechatOrderFromService;

public class WechatOrderFromServiceImpl implements WechatOrderFromService{

	@Resource
	private FoodOrderDao foodOrderDao;
	
	@Override
	public Integer saveOrderFrom(Map<String, Object> param) {
		String type = (String)param.get("type");
		String dishesIds = (String)param.get("ids");
		String totalMoney = (String)param.get("totalMoney");
		String restaurantId = (String)param.get("restaurantId");
		//食物订单
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setCreateTime(new Date());
		foodOrder.setDishesIds(dishesIds);
		foodOrder.setFoodOrderState(FoodOrder.STATE_YES);
		if(Integer.parseInt(type) == FoodOrder.TYPE_SHOP){
			foodOrder.setFoodOrderType(FoodOrder.TYPE_SHOP);
		}
		foodOrder.setRestaurantId(Integer.parseInt(restaurantId));
		foodOrder.setTotalMoney(new BigDecimal(totalMoney));
		foodOrderDao.insert(foodOrder);
		
		return null;
	}
}
