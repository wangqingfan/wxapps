package com.beixiao.shardingjdbc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.beixiao.account.domain.Account;
import com.beixiao.account.repository.AccountDao;
import com.beixiao.sharding.algorithm.domain.user.User;
import com.beixiao.sharding.algorithm.service.UserService;


@Controller
@RequestMapping("/sharding")
public class ShardingAlgorithmController {
	
	Logger logger = LoggerFactory.getLogger(ShardingAlgorithmController.class);
	
	@Resource
	private UserService userService;
	@Resource
	private AccountDao accountDao;

	
	/**
	 * 插入
	 * @author wqf V1.0 2018年12月26日 下午4:40:38
	 * @param u
	 * @return Object
	 */
	@RequestMapping("/insertUser")
	@ResponseBody
	public Object insertUser(@RequestParam Map<String,Object> param){
		logger.info("---insertUser--param:"+param);
		User u = JSONObject.parseObject(JSONObject.toJSONString(param), User.class);
		return userService.insert(u) == true ? "success":"faild";
	}
	
	
	/**
	 * 批量查询
	 * @author wqf V1.0 2018年12月26日 下午5:37:07
	 * @param ids
	 * @return Object
	 */
	@RequestMapping("/findByUserIds")
	@ResponseBody
	public Object findByUserIds(@RequestParam("ids") String ids){
		List<String> idList = Arrays.asList(ids.split(","));
		List<User> findByUserIds = userService.findByUserIds(idList.stream().map(Integer::parseInt).collect(Collectors.toList()));
		return JSONObject.toJSON(findByUserIds);
	}
	
	@RequestMapping("/account")
	@ResponseBody
	public Object account(@RequestParam Map<String,Object> param){
		Account a = new Account();
		a.setAccountType(1);
		accountDao.insert(a);
		return "success";
	}
}
