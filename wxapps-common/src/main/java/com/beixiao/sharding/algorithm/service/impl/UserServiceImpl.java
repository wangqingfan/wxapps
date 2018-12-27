package com.beixiao.sharding.algorithm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.sharding.algorithm.domain.user.User;
import com.beixiao.sharding.algorithm.repository.user.UserDao;
import com.beixiao.sharding.algorithm.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	@Override
	public List<User> findByUserIds(List<Integer> ids) {
		return userDao.findByUserIds(ids);
	}
	
	@Override
	public boolean insert(User u) {
		return userDao.insert(u) == 1 ? true : false;
	}
}
