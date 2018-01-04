package com.beixiao.dishes.service;

import java.util.List;

import com.beixiao.dishes.domain.Dishes;

public interface DishesService {

	/**
	 * 通过商户id获取菜品名称
	 * @author wqf V1.0 2018年1月4日 上午10:59:22
	 * @param shopId
	 * @return List<Dishes>
	 */
	List<Dishes> findByShopId(Integer shopId);
}
