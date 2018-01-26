package com.beixiao.bankinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.bankinfo.repository.BankInfoDao;
import com.beixiao.bankinfo.service.BankInfoService;

@Service
public class BankInfoServiceImpl implements BankInfoService{

	@Resource
	private BankInfoDao bankInfoDao;
	
	@Override
	public Integer insert(BankInfo bankInfo) {
		return bankInfoDao.insert(bankInfo);
	}
}
