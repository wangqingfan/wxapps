package com.beixiao.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.common.util.HttpClientUtil;
import com.beixiao.common.util.UrlUtil;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/layui")
	public String layui(){
		return "/test/layui";
	}
	
	@RequestMapping("/header")
	public String header(){
		return "/common/header";
	}
	
	@RequestMapping("/content")
	public String content(){
		return "/test/content";
	}
	
	@RequestMapping("/wechat")
	@ResponseBody
	public Object wechat(){
		String code = "071HsXdi0iVPem1O1Aei02k7ei0HsXdw";
		String appId= "wxda9bae61900fac0a";//小程序id
		String AppSecret = "8278d09c06f09c7b100ff9614113e63f";//小程序秘钥
		String url = "https://api.weixin.qq.com/sns/jscode2session";
		Map<String,String> map = new HashMap<String, String>();
		map.put("js_code", code);
		map.put("appid", appId);
		map.put("secret", AppSecret);
		map.put("grant_type", "authorization_code");
		String post = UrlUtil.sendPost(url, map);
		System.out.println("--------------------post："+post);
		return "success";
	}
}
