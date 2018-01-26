package com.beixiao.basic.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.basic.BasicInfoService;
import com.beixiao.common.ReturnInfo;
import com.beixiao.common.util.ValidateUtil;
import com.beixiao.customercard.domain.CustomerCard;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.service.ShopService;
import com.beixiao.system.domain.MiniApps;
import com.beixiao.system.service.SystemService;

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
	@Resource
	private SystemService systemService;
	@Resource
	private BasicInfoService basicInfoService;
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
	
	@RequestMapping("/toEditBasic")
	public String toEdit(@RequestParam Map<String,Object> param){
		return "";
	}
	
	
	/**
	 * 跳转到新增页面
	 * @author wqf V1.0 2018年1月24日 下午3:39:06
	 * @param modelMap
	 * @return String
	 */
	@RequestMapping("/toAddBasic")
	public String toAddBasic(ModelMap modelMap){
		modelMap.put("provinces", systemService.getProvices());
		return "/basicInfo/addBasic";
	}
	
	
	/**
	 * 新增
	 * @author wqf V1.0 2018年1月24日 下午3:39:01
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/addBasic")
	@ResponseBody
	public Object addBasic(@RequestParam Map<String,Object> param,HttpServletRequest request){
		logger.info("---------addBasic-----param:"+param);
		try {
			//小程序实体
			MiniApps miniApps = new MiniApps();
			//商户
			Shop shop = new Shop();
			//银行卡
			BankInfo bankInfo = new BankInfo();
			//客户卡信息
			CustomerCard customerCard = new CustomerCard();
			//餐厅信息
			Restaurant restaurant = null;
			ServletRequestDataBinder miniAppsBind = new ServletRequestDataBinder(miniApps);
			ServletRequestDataBinder shopBind = new ServletRequestDataBinder(shop);
			ServletRequestDataBinder bankInfoBind = new ServletRequestDataBinder(bankInfo);
			ServletRequestDataBinder customerCardBind = new ServletRequestDataBinder(customerCard);
			miniAppsBind.bind(request);
			shopBind.bind(request);
			bankInfoBind.bind(request);
			customerCardBind.bind(request);
			String shopType = (String)param.get("shopType");
			if(!ValidateUtil.isEmpty(shopType) && Integer.parseInt(shopType) == Shop.SHOP_TYPE_RESTAURANT){
				restaurant = new Restaurant();
				ServletRequestDataBinder restaurantBind = new ServletRequestDataBinder(restaurant);
				restaurantBind.bind(request);
			}
			//保存信息
			basicInfoService.saveBasic(miniApps, shop, bankInfo, customerCard,restaurant);
		} catch (Exception e) {
			logger.error("---------addBasic-----error:",e);
			return ReturnInfo.toPostReturn(ReturnInfo.CODE_ERROR, "系统异常");
		}
		return ReturnInfo.toPostReturn(ReturnInfo.CODE_SUCCESS, null);
	}
}
