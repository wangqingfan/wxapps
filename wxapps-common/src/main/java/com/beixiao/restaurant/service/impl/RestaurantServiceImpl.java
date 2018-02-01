package com.beixiao.restaurant.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.restaurant.repository.RestaurantDao;
import com.beixiao.restaurant.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Resource
	private RestaurantDao restaurantDao;
	
	@Override
	public Restaurant findByShopId(Integer ShopId) {
		return restaurantDao.findByShopId(ShopId);
	}

	@Override
	public Integer insert(Restaurant restaurant) {
		return restaurantDao.insert(restaurant);
	}
	
	@Override
	public Integer updateByShopId(Restaurant restaurant) {
		return restaurantDao.updateByShopId(restaurant);
	}
}
