package com.beixiao.sharding.algorithm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beixiao.sharding.algorithm.domain.student.Student;
import com.beixiao.sharding.algorithm.repository.student.StudentDao;
import com.beixiao.sharding.algorithm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentDao studentDao;
	
	@Override
	public boolean insert(Student student) {
		return studentDao.insert(student)==1 ? true : false;
	}
}
