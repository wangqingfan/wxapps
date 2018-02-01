package com.beixiao.restaurant.service;

import com.beixiao.restaurant.domain.Restaurant;

public interface RestaurantService {
	
	/**
	 * 通过shopid查找
	 * @author wqf V1.0 2017年12月28日 下午6:27:09
	 * @param ShopId
	 * @return Restaurant
	 */
	Restaurant findByShopId (Integer ShopId);
	
	/**
	 * 插入
	 * @author wqf V1.0 2018年1月26日 上午9:52:24
	 * @param restaurant
	 * @return Integer
	 */
	Integer insert(Restaurant restaurant);
	
	/**
	 * 通过shopId更新
	 * @author wqf V1.0 2018年2月1日 下午2:36:35
	 * @param restaurant
	 * @return Integer
	 */
	Integer updateByShopId(Restaurant restaurant);
}
