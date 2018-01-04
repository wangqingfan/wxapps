package com.beixiao.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.shop.dto.BasicInfo;
import com.beixiao.shop.repository.ShopDao;
import com.beixiao.shop.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Resource
	private ShopDao shopDao;
	
	@Override
	public BasicInfo findBasicInfoByAppId(Integer miniAppId) {
		return shopDao.findBasicInfoByAppId(miniAppId);
	}
	
}
