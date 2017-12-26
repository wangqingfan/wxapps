package com.beixiao.common.util;

import java.util.List;
import java.util.Map;

/**
 * 校验类
 * @author geniusDashingFan
 * 2017年12月22日 上午11:31:34
 * 
 */
public class ValidateUtil {

	public static boolean isEmpty(List<?> list){
		if(list == null || list.size()==0){
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(Map<?,?> map){
		if(map == null || map.size()==0){
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(String str){
		if(str == null || "".equals(str)){
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(Object obj){
		if(obj == null){
			return true;
		}
		return false;
	}
}
