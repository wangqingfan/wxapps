package com.beixiao.activity.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.activity.domain.Activity;
import com.beixiao.activity.repository.ActivityDao;
import com.beixiao.activity.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Resource
	private ActivityDao activityDao;
	
	@Override
	public Integer insert(Activity activity) {
		return activityDao.insert(activity);
	}
	
	@Override
	public Integer deleteAll(Integer shopId) {
		return activityDao.deleteAll(shopId);
	}
	
	@Override
	public Integer updateByShopId(Activity activity) {
		return activityDao.updateByShopId(activity);
	}
	
	@Override
	public Integer update(Activity activity) {
		return activityDao.update(activity);
	}
}
