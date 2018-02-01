package com.beixiao.system.repository;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.City;

public interface CityDao extends BaseDao<City>{
	
	List<City> findByProvinceId(Integer id);
	
	/**
	 * 获取市
	 * @author wqf V1.0 2018年1月23日 下午2:38:56
	 * @param id
	 * @return List<City>
	 */
	public List<City> getCitysByName(String id);
}