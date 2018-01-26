package com.beixiao.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.system.domain.MiniApps;
import com.beixiao.system.repository.MiniAppsDao;
import com.beixiao.system.service.MiniAppsService;

@Service
public class MiniAppsServiceImpl implements MiniAppsService{

	@Resource
	private MiniAppsDao miniAppsDao;
	
	@Override
	public MiniApps findByAppId(String appId) {
		return miniAppsDao.findByAppId(appId);
	}
	
	@Override
	public Integer insert(MiniApps miniApps) {
		return miniAppsDao.insert(miniApps);
	}
}
