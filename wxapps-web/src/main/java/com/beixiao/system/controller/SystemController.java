package com.beixiao.system.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.system.service.SystemService;


/**
 * 通用controller
 * Project: wxapps-web 
 * Author: wqf V1.0 2018年1月23日	下午2:30:50
 */
@Controller
@RequestMapping("/system")
public class SystemController {

	@Resource
	private SystemService systemService;
	/**
	 * 获取城市
	 * @author wqf V1.0 2018年1月23日 下午2:31:55
	 * @param id
	 * @return Object
	 */
	@RequestMapping("/getCity")
	@ResponseBody
	public Object getCity(@RequestParam("id") Integer id){
		return systemService.getCitys(id);
	}
	
	
	/**
	 * 获取区县
	 * @author wqf V1.0 2018年1月23日 下午4:18:07
	 * @param id
	 * @return Object
	 */
	@RequestMapping("/getSubCity")
	@ResponseBody
	public Object getSubCity(@RequestParam("id") Integer id){
	
		return  systemService.getSubCitys(id);
	}
	
	@RequestMapping("/getProvinceByName")
	@ResponseBody
	public Object getProvinceByName(@RequestParam("name") String name){
		return systemService.getProvinceByName(name);
	}
	
	/**
	 * 获取城市
	 * @author wqf V1.0 2018年1月23日 下午2:31:55
	 * @param id
	 * @return Object
	 */
	@RequestMapping("/getCityByName")
	@ResponseBody
	public Object getCityByName(@RequestParam("id") String id){
		return systemService.getCitysByName(id);
	}
	
	/**
	 * 获取区县通过cityName
	 * @author wqf V1.0 2018年1月23日 下午4:18:07
	 * @param id
	 * @return Object
	 */
	@RequestMapping("/getSubCityByName")
	@ResponseBody
	public Object getSubCityByName(@RequestParam("id") String id){
	
		return  systemService.getSubCitysByName(id);
	}
}
