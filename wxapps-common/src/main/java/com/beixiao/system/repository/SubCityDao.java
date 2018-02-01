package com.beixiao.system.repository;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.SubCity;

public interface SubCityDao extends BaseDao<SubCity>{
	
	List<SubCity> findByCityId(Integer id);
	
	/**
	 * 获取区县
	 * @author wqf V1.0 2018年1月23日 下午4:18:40
	 * @param Id
	 * @return List<SubCity>
	 */
	public List<SubCity> getSubCitysByName(String cityName);
}