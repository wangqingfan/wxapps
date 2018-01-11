package com.beixiao.common;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class PageAble<T> {

	private Integer code;
	private String msg;
	private Long count;
	private List<T> data;
	//这不是一个泛型方法，只是用了泛型实参，代表所有类的父类
	public PageAble(PageInfo<T> pageInfo){
		this.count = pageInfo.getTotal();
		this.data = pageInfo.getList();
		this.code = CODE_SUCCESS;
		this.msg = "";
	}
	
	public static final Integer CODE_SUCCESS = 0;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
