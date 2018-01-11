package com.beixiao.basic.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.common.util.ValidateUtil;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 基本信息controller
 * Project: wxapps-web 
 * Author: wqf V1.0 2018年1月8日	下午5:44:34
 */
@Controller
@RequestMapping("/basic/info")
public class BasicInfoController {

	private Logger logger = LoggerFactory.getLogger(BasicInfoController.class);
	@Resource
	private ShopService shopService;
	/**
	 * 跳转到基本信息列表
	 * @author wqf V1.0 2018年1月8日 下午2:38:24
	 * @return String
	 */
	@RequestMapping("/toList")
	public String toList(){
		return "/basicInfo/baseInfoList";
	}
	
	@RequestMapping("/getList")
	@ResponseBody
	public Object getList(@RequestParam Map<String,Object> param){
		logger.info("----------getList---------param:"+param);
		
		if(!ValidateUtil.isEmpty(param.get("createTimeStart"))){
		}
		if(!ValidateUtil.isEmpty(param.get("createTimeEnd"))){
		}
		return shopService.findAllPage(param);
	}
}
