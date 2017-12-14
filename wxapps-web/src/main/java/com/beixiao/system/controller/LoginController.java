package com.beixiao.system.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.system.domain.AdminInfo;
import com.beixiao.system.service.AdminInfoService;

/**
 * 登录controller
 * @author geniusDashingFan
 * 2017�?11�?27�? 上午10:05:45
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Resource
	private AdminInfoService adminInfoService;
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info("---------------登录------------------");
		return "/common/login";
	}
	
	/**
	 * 登录
	 * @author geniusDashingFan
	 * 2017年12月13日 下午5:14:23
	 * 
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Object login(@RequestBody Map<String,Object> param){
		/*AdminInfo adminInfo = new AdminInfo();
		ServletRequestDataBinder servletRequestDataBinder = new ServletRequestDataBinder(adminInfo);
		servletRequestDataBinder.bind(request);*/
		String result = "";
		/*AdminInfo find = adminInfoService.findByAdminCode(adminInfo.getAdminCode());
		if(find != null){
			result = "success";
		}*/
		return result;
	}
}
