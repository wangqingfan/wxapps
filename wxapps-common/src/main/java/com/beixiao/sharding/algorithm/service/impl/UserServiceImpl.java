package com.beixiao.sharding.algorithm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	/*@Override
	public boolean insert(User u) {
		return userDao.insert(u) == 1 ? true : false;
	}*/
	
	@Override
	@Transactional
	public boolean insert(User u) {
		userDao.insert(u);
		if(1==1){
			int i = 1/0;
		}
		return true;
	}
	
	@Override
	@Transactional
	public boolean insertAll() {
		User u1 = new User();
		u1.setAge(25);
		u1.setName("测试u1");
		u1.setUserId(110);
		userDao.insert(u1);
		User u2 = new User();
		u2.setAge(25);
		u2.setName("测试u2");
		u2.setUserId(111);
		userDao.insert(u2);
		if(1==1){
			int i = 1/0;
		}
		return false;
	}
	
}
