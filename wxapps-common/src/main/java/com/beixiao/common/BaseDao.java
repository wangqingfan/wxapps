package com.beixiao.common;

import java.util.List;

public interface BaseDao <T>{

	public abstract Integer insert(T t);
	
	public abstract Integer update(T t);
	
	public abstract T findById(Object key);
	
	public abstract List<T> findAll();
	
	public abstract Integer deleteById(Object key);
}
