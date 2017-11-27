package com.beixiao.controller.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页
 * @author geniusDashingFan
 * 2017年11月27日 上午10:05:45
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info("---------------进入登录------------------");
		try {
			int parseInt = Integer.parseInt("S");
			int a = parseInt/5 ;
		} catch (Exception e) {
			logger.error("--",e);
		}
		return "/system/login";
	}
}
