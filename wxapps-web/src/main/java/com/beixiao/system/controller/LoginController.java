package com.beixiao.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ÁôªÂΩïÈ°?
 * @author geniusDashingFan
 * 2017Âπ?11Êú?27Êó? ‰∏äÂçà10:05:45
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info("---------------µ«¬º------------------");
		return "/system/login";
	}
}
