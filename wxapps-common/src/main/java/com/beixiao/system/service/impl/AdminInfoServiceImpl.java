package com.beixiao.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.system.domain.AdminInfo;
import com.beixiao.system.repository.AdminInfoDao;
import com.beixiao.system.service.AdminInfoService;

@Service
public class AdminInfoServiceImpl implements AdminInfoService{

	@Resource
	private AdminInfoDao adminInfoDao;
	
	@Override
	public AdminInfo findByAdminCode(String adminCode) {
		return adminInfoDao.findByAdminCode(adminCode);
	}
}
