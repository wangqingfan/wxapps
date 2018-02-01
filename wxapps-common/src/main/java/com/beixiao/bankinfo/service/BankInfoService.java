package com.beixiao.bankinfo.service;

import com.beixiao.bankinfo.domain.BankInfo;

public interface BankInfoService {
	
	/**
	 * 插入
	 * @author wqf V1.0 2018年1月24日 下午6:37:46
	 * @param bankInfo
	 * @return Integer
	 */
	Integer insert(BankInfo bankInfo);

	/**
	 * 通过客户卡id查找
	 * @author wqf V1.0 2018年2月1日 下午2:22:01
	 * @param id
	 * @return BankInfo
	 */
	BankInfo findByCustomerCardId(Integer id); 
	
	/**
	 * 更新
	 * @author wqf V1.0 2018年2月1日 下午2:27:10
	 * @param bankInfo
	 * @return Integer
	 */
	Integer update (BankInfo bankInfo);
	
}
