package com.beixiao.dishes.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.dishes.domain.Dishes;
import com.beixiao.dishes.repository.DishesDao;
import com.beixiao.dishes.service.DishesService;

@Service
public class DishesServiceImpl implements DishesService{

	@Resource
	private DishesDao dishesDao;
	
	@Override
	public List<Dishes> findByShopId(Integer shopId) {
		
		return dishesDao.findByShopId(shopId);
	}
}
