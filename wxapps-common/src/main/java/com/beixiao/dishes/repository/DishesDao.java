package com.beixiao.dishes.repository;


import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.dishes.domain.Dishes;

/**
 * 菜品dao
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月3日	上午11:32:35
 */
public interface DishesDao extends BaseDao<Dishes>{
	
	/**
	 * 通过商户id获取菜品名称
	 * @author wqf V1.0 2018年1月4日 上午10:59:22
	 * @param shopId
	 * @return List<Dishes>
	 */
	List<Dishes> findByShopId(Integer shopId);
}