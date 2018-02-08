package com.beixiao.activity.repository;

import com.beixiao.activity.domain.Activity;
import com.beixiao.common.BaseDao;

public interface ActivityDao extends BaseDao<Activity>{
	
	/**
	 * 删除全部
	 * @author wqf V1.0 2018年2月7日 下午6:29:13
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
}