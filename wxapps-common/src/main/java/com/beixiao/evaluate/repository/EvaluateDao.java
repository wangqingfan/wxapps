package com.beixiao.evaluate.repository;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.evaluate.domain.Evaluate;

public interface EvaluateDao extends BaseDao<Evaluate>{
	
	/**
	 * 通过饭店来查找评价
	 * @author wqf V1.0 2018年1月2日 上午10:35:25
	 * @param restaurantId
	 * @return List<Evaluate>
	 */
	List<Evaluate> findByRestaurant(Integer restaurantId);
}