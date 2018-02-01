package com.beixiao.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.common.PageAble;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.dto.BasicInfo;
import com.beixiao.shop.repository.ShopDao;
import com.beixiao.shop.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Resource
	private ShopDao shopDao;
	
	@Override
	public BasicInfo findBasicInfoByAppId(Integer miniAppId) {
		return shopDao.findBasicInfoByAppId(miniAppId);
	}
	
	@Override
	public Shop findById(Integer shopId) {
		return shopDao.findById(shopId);
	}
	
	@Override
	public PageAble<Shop> findAllPage(Map<String, Object> map) {
		Integer page = Integer.parseInt((String)map.get("page"));
		Integer limit = Integer.parseInt((String)map.get("limit"));
		PageHelper.startPage(page, limit);
		List<Shop> list = shopDao.findAllPage(map);
		return new PageAble<Shop>(new PageInfo<Shop>(list));
	}
	
	@Override
	public Integer insert(Shop shop) {
		return shopDao.insert(shop);
	}
	
	@Override
	public BasicInfo findBasicInfoByMap(Map<String, Object> map) {
		return shopDao.findBasicInfoByMap(map);
	}
	
	@Override
	public Shop findByAppId(String appId) {
		return shopDao.findByAppId(appId);
	}
	
	@Override
	public Integer update(Shop shop) {
		return shopDao.update(shop);
	}
}
