package com.beixiao.system.service;

import com.beixiao.system.domain.MiniApps;

public interface MiniAppsService {

	/**
	 * 通过AppId查找
	 * @author wqf V1.0 2017年12月25日 上午10:35:38
	 * @param appId
	 * @return MiniApps
	 */
	MiniApps findByAppId (String appId);
}
