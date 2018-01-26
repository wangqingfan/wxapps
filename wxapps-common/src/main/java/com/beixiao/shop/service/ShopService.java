package com.beixiao.shop.service;

import java.util.List;
import java.util.Map;

import com.beixiao.common.PageAble;
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
	
	/**
	 * 分页查询
	 * @author wqf V1.0 2018年1月8日 下午6:13:17
	 * @param map
	 * @return List<shop>
	 */
	PageAble<Shop> findAllPage(Map<String,Object> map);
	
	/**
	 * 插入
	 * @author wqf V1.0 2018年1月24日 下午6:31:00
	 * @param shop
	 * @return Integer
	 */
	Integer insert(Shop shop);
}
