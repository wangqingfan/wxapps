package com.beixiao.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.system.domain.City;
import com.beixiao.system.domain.Province;
import com.beixiao.system.domain.SubCity;
import com.beixiao.system.repository.CityDao;
import com.beixiao.system.repository.ProvinceDao;
import com.beixiao.system.repository.SubCityDao;
import com.beixiao.system.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService{

	@Resource
	private ProvinceDao provinceDao; 
	
	@Resource
	private CityDao cityDao;
	
	@Resource
	private SubCityDao subCityDao;
	
	
	@Override
	public List<Province> getProvices() {
		return provinceDao.findAll();
	}
	
	@Override
	public List<City> getCitys(Integer id) {
		return cityDao.findByProvinceId(id);
	}
	
	@Override
	public List<SubCity> getSubCitys(Integer id) {
		return subCityDao.findByCityId(id);
	}
}
