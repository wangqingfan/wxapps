package com.beixiao.customercard.service;

import com.beixiao.customercard.domain.CustomerCard;

public interface CustomerCardService {

	/**
	 * 插入
	 * @author wqf V1.0 2018年1月24日 下午6:39:28
	 * @param customerCard
	 * @return Integer
	 */
	Integer insert(CustomerCard customerCard);
	
	/**
	 * 更改
	 * @author wqf V1.0 2018年2月1日 下午2:11:48
	 * @param customerCard
	 * @return Integer
	 */
	Integer update (CustomerCard customerCard);
}
