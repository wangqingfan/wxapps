package com.beixiao.restaurant.repository;

import com.beixiao.common.BaseDao;
import com.beixiao.restaurant.domain.Restaurant;

public interface RestaurantDao extends BaseDao<Restaurant>{
	
	/**
	 * 通过shopid查找
	 * @author wqf V1.0 2017年12月28日 下午6:27:09
	 * @param ShopId
	 * @return Restaurant
	 */
	Restaurant findByShopId (Integer ShopId);
}