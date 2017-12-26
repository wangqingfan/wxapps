package com.beixiao.shop.repository;

import com.beixiao.common.BaseDao;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.dto.BasicInfo;

public interface ShopDao extends BaseDao<Shop> {
	
	/**
	 * 获取基本信息
	 * @author wqf V1.0 2017年12月25日 下午5:10:00
	 * @param miniAppId
	 * @return BasicInfo
	 */
	BasicInfo findBasicInfoByAppId(Integer miniAppId);
}