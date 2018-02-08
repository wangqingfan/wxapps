package com.beixiao.activity.service;

import com.beixiao.activity.domain.Activity;

public interface ActivityService {

	/**
	 * 插入
	 * @author wqf V1.0 2018年2月7日 下午3:52:15
	 * @param activity
	 * @return Integer
	 */
	Integer insert(Activity activity);
	
	/**
	 * 删除全部
	 * @author wqf V1.0 2018年2月7日 下午6:30:59
	 * @param shopId
	 * @return Integer
	 */
	Integer deleteAll(Integer shopId);
	
	/**
	 * 根据shopId更新
	 * @author wqf V1.0 2018年2月8日 上午9:54:09
	 * @param activity
	 * @return Integer
	 */
	Integer updateByShopId(Activity activity);
	
	
	/**
	 * 更新
	 * @author wqf V1.0 2018年2月8日 上午11:10:09
	 * @param activity
	 * @return Integer
	 */
	Integer update(Activity activity);
}
