package com.beixiao.system.repository;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.SubCity;

public interface SubCityDao extends BaseDao<SubCity>{
	
	List<SubCity> findByCityId(Integer id);
}