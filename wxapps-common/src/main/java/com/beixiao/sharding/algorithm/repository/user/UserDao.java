package com.beixiao.sharding.algorithm.repository.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.beixiao.common.BaseDao;
import com.beixiao.sharding.algorithm.domain.user.User;


/**
 * userDao
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年12月26日	下午4:18:50
 */
public interface UserDao extends BaseDao<User>{

	/**
	 * 批量查找
	 * @author wqf V1.0 2018年12月26日 下午4:23:58
	 * @param ids
	 * @return List<User>
	 */
	List<User>findByUserIds(List<Integer> ids);
	
	/**
	 * 关联查询
	 * @author wqf V1.0 2018年12月27日 下午4:36:14
	 * @return List<Map<String,Object>>
	 */
	List<Map<String,Object>> findJoin(Integer userId);
	
	
	/**
	 * 分页
	 * @author wqf V1.0 2019年2月15日 上午10:09:19
	 * @param start
	 * @param end
	 * @return List<User>
	 */
	List<User> findByLimits(@Param("start")Integer start ,@Param("end")Integer end);
}
