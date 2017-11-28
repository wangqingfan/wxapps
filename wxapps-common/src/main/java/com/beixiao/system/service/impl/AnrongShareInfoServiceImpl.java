package com.beixiao.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.system.domain.AnrongShareInfo;
import com.beixiao.system.repository.AnrongShareInfoDao;
import com.beixiao.system.service.AnrongShareInfoService;

@Service
public class AnrongShareInfoServiceImpl implements AnrongShareInfoService{

	@Resource
	private AnrongShareInfoDao anrongShareInfoDao;
	
	@Override
	public AnrongShareInfo findById(Integer id) {
		
		return anrongShareInfoDao.findById(id);
	}
}
