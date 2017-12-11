package com.beixiao.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录�?
 * @author geniusDashingFan
 * 2017�?11�?27�? 上午10:05:45
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info("---------------��¼------------------");
		return "/system/login";
	}
}
