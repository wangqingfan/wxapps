package com.beixiao.sharding.algorithm.service;

import java.util.List;

import com.beixiao.sharding.algorithm.domain.user.User;

/**
 * user业务类
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年12月26日	下午4:27:30
 */
public interface UserService {

	public boolean insert(User u);  
    
    public List<User> findAll();  
      
    public List<User> findByUserIds(List<Integer> ids);  

}
