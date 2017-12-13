package com.beixiao.system.service;

import com.beixiao.system.domain.AdminInfo;


public interface AdminInfoService {

	/**
	 * 根据工号查找
	 * @author geniusDashingFan
	 * 2017年12月13日 下午5:06:33
	 * 
	 */
	AdminInfo findByAdminCode(String adminCode);
}
