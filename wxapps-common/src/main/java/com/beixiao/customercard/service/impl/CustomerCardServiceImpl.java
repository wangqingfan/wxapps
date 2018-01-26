package com.beixiao.customercard.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.customercard.domain.CustomerCard;
import com.beixiao.customercard.repository.CustomerCardDao;
import com.beixiao.customercard.service.CustomerCardService;

@Service
public class CustomerCardServiceImpl implements CustomerCardService{

	@Resource
	private CustomerCardDao customerCardDao;
	@Override
	public Integer insert(CustomerCard customerCard) {
		return customerCardDao.insert(customerCard);
	}
}
