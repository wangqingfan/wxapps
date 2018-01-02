package com.beixiao.evaluate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.evaluate.domain.Evaluate;
import com.beixiao.evaluate.repository.EvaluateDao;
import com.beixiao.evaluate.service.EvaluateService;

@Service
public class EvaluateServiceImpl implements EvaluateService{

	@Resource
	private EvaluateDao evaluateDao;
	
	@Override
	public List<Evaluate> findByRestaurant(Integer restaurantId) {
		return evaluateDao.findByRestaurant(restaurantId);
	}
}
