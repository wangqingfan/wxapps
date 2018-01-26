package com.beixiao.system.repository;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.City;

public interface CityDao extends BaseDao<City>{
	
	List<City> findByProvinceId(Integer id);
}