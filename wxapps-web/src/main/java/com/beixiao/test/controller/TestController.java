package com.beixiao.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试controller
 * @author geniusDashingFan
 * 2017年12月11日 上午11:24:56
 * 
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/layui")
	public String layui(){
		return "/test/layui";
	}
}
