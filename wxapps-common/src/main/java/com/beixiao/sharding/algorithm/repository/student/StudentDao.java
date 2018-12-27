package com.beixiao.sharding.algorithm.repository.student;

import java.util.List;

import com.beixiao.common.BaseDao;
import com.beixiao.sharding.algorithm.domain.student.Student;


/**
 * studentDao
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年12月26日	下午4:19:56
 */
public interface StudentDao extends BaseDao<Student>{

	/**
	 * 批量查找
	 * @author wqf V1.0 2018年12月26日 下午4:23:58
	 * @param ids
	 * @return List<User>
	 */
	List<Student>findByStudentIds(List<Integer> ids);
}
