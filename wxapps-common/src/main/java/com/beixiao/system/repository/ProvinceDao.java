package com.beixiao.system.repository;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.Province;

public interface ProvinceDao extends BaseDao<Province>{
	
	/**
	 * 通过name获取省信息
	 * @author wqf V1.0 2018年1月30日 下午5:12:33
	 * @param name
	 * @return Province
	 */
	public Province getProvinceByName(String name);
}