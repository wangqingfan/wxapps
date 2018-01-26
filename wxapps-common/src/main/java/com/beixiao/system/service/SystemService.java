package com.beixiao.system.service;

import java.util.List;

import com.beixiao.system.domain.City;
import com.beixiao.system.domain.Province;
import com.beixiao.system.domain.SubCity;

public interface SystemService {

	/**
	 * 获取省
	 * @author wqf V1.0 2018年1月23日 下午2:38:16
	 * @return List<Province>
	 */
	public List<Province> getProvices();
	
	
	/**
	 * 获取市
	 * @author wqf V1.0 2018年1月23日 下午2:38:56
	 * @param id
	 * @return List<City>
	 */
	public List<City> getCitys(Integer id);
	
	
	/**
	 * 获取区县
	 * @author wqf V1.0 2018年1月23日 下午4:18:40
	 * @param Id
	 * @return List<SubCity>
	 */
	public List<SubCity> getSubCitys(Integer id);
}
