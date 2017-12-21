package com.beixiao.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import util.Base64Util;
import util.MD5Util;

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
	public Object login(@RequestBody AdminInfo adminInfo,HttpSession session){
		String result = "";
		try {
			AdminInfo find = adminInfoService.findByAdminCode(adminInfo.getAdminCode());
			if(find != null){
				String base = Base64Util.decode(adminInfo.getPassword(), "Unicode");
				MD5Util md5Key = new MD5Util();
				String md5Pwd = md5Key.getkeyBeanofStr(base);
				if(find.getPassword().equals(md5Pwd)){
					session.setAttribute("adminInfo", find);
					result="success";
				}
			}else{
				result="error";
			}
		} catch (Exception e) {
			logger.error("--------工号为："+adminInfo.getAdminCode()+"------login--------------发生异常",e);
			result="error";
		}
		return result;
	}
	
}
