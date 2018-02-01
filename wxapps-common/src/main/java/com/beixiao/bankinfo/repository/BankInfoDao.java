package com.beixiao.bankinfo.repository;

import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.common.BaseDao;

/**
 * 银行Dao
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月19日	上午10:57:44
 */
public interface BankInfoDao extends BaseDao<BankInfo>{
	
	/**
	 * 通过客户卡id查找
	 * @author wqf V1.0 2018年2月1日 下午2:22:01
	 * @param id
	 * @return BankInfo
	 */
	BankInfo findByCustomerCardId(Integer id); 
}