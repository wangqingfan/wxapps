package com.beixiao.wechat.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.beixiao.dishes.domain.Dishes;
import com.beixiao.wechat.dto.WechatResponse;
import com.github.pagehelper.PageInfo;

public interface WechatProductService {
	
	/**
	 * 小程序获取产品
	 * @author wqf V1.0 2018年1月4日 上午10:45:27
	 * @param shopId
	 * @return WechatResponse<Object>
	 */
	WechatResponse<PageInfo<Dishes>> findProductByShopId(@RequestParam Map<String,Object> param);
	
}
