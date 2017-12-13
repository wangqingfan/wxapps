package com.beixiao.system.repository;

import com.beixiao.common.BaseDao;
import com.beixiao.system.domain.AdminInfo;

/**
 * 内部人员Dao
 * @author geniusDashingFan
 * 2017年12月13日 下午4:54:18
 * 
 */
public interface AdminInfoDao extends BaseDao<AdminInfo>{

	/**
	 * 通过工号查找
	 * @author geniusDashingFan
	 * 2017年12月13日 下午5:08:23
	 * 
	 */
	AdminInfo findByAdminCode(String adminCode);
}