package com.beixiao.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ����controller
 * @author geniusDashingFan
 * 2017��12��11�� ����11:24:56
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
