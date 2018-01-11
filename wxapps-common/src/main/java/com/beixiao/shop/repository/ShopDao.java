package com.beixiao.shop.repository;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * 分页查询
	 * @author wqf V1.0 2018年1月8日 下午6:13:17
	 * @param map
	 * @return List<shop>
	 */
	List<Shop> findAllPage(Map<String,Object> map);
}