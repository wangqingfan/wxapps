package com.beixiao.evaluate.service;

import java.util.List;

import com.beixiao.evaluate.domain.Evaluate;

/**
 * 评价service
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月2日	上午10:34:06
 */
public interface EvaluateService {
	
	/**
	 * 通过饭店来查找评价
	 * @author wqf V1.0 2018年1月2日 上午10:35:25
	 * @param restaurantId
	 * @return List<Evaluate>
	 */
	List<Evaluate> findByRestaurant(Integer restaurantId);
}
