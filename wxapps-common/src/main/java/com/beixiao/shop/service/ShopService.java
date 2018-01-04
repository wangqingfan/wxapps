package com.beixiao.shop.service;

import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.dto.BasicInfo;

public interface ShopService {
	
	/**
	 * 获取基本信息
	 * @author wqf V1.0 2017年12月25日 下午5:10:00
	 * @param miniAppId
	 * @return BasicInfo
	 */
	BasicInfo findBasicInfoByAppId(Integer miniAppId);
	
	/**
	 * 通过id查找
	 * @author wqf V1.0 2018年1月4日 上午10:33:27
	 * @param shopId
	 * @return Shop
	 */
	Shop findById(Integer shopId);
	
}
