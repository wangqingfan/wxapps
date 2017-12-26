package com.beixiao.wechat;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.beixiao.common.util.ValidateUtil;
import com.beixiao.shop.dto.BasicInfo;
import com.beixiao.shop.service.ShopService;
import com.beixiao.system.domain.MiniApps;
import com.beixiao.system.service.MiniAppsService;
import com.beixiao.wechat.dto.WechatResponse;
import com.cooperate.framework.utils.runtime.CommonResult;

/**
 * 小程序基本信息接口类
 * @author geniusDashingFan
 * 2017年12月24日 下午2:20:41
 * 
 */
@Controller
@RequestMapping("/wechat/basci")
public class WechatBasicInfoController {
	
	private Logger logger = LoggerFactory.getLogger(WechatBasicInfoController.class);
	
	@Resource
	private MiniAppsService miniAppsService;
	
	@Resource
	private ShopService shopService;
	
	/**
	 * 获取基本信息
	 * Project: wxapps-web 
	 * Author: wqf V1.0 2017年12月25日	上午10:01:57
	 */
	@RequestMapping("/getBasicInfo")
	@ResponseBody
	public WechatResponse<BasicInfo> getBasicInfo(@RequestParam Map<String,Object> param){
		WechatResponse<BasicInfo> response = null;
		String appId = (String)param.get("appId");
		logger.info("--appId:"+appId+"------------getBasicInfo------------");
		if(!ValidateUtil.isEmpty(appId)){
			MiniApps miniApps = miniAppsService.findByAppId(appId);
			if(!ValidateUtil.isEmpty(miniApps)){
				BasicInfo basicInfo = shopService.findBasicInfoByAppId(miniApps.getMiniAppId());
				if(!ValidateUtil.isEmpty(basicInfo)){
					response = new WechatResponse<BasicInfo>(WechatResponse.SUCCESS_CODE, "查询成功", basicInfo);
				}else{
					response = new WechatResponse<BasicInfo>(WechatResponse.USER_DATA_ERROR_CODE, "查询不到对应的餐厅", basicInfo);
				}
			}else{
				response = new WechatResponse<BasicInfo>(WechatResponse.USER_DATA_ERROR_CODE, "错误的请求参数，查询不到符合的商户");
			}
		}else{
			response = new WechatResponse<BasicInfo>(WechatResponse.PARAM_INCOMPLETE_CODE,"请求参数不完全");
		}
		logger.info("--appId:"+appId+"-----getBasicInfo------返回值为："+JSONObject.toJSONString(response));
		return response;
	}
	
	
	/**
	 * 获取附件信息
	 * @author wqf V1.0 2017年12月26日 下午5:11:08
	 * @param param
	 * @return Object
	 */
	@RequestMapping("/getAttachmentInfo")
	@ResponseBody
	public Object getAttachmentInfo(@RequestParam Map<String,Object> param){
		return null;
	}
}
