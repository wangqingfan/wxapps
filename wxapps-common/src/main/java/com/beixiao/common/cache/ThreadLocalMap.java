package com.beixiao.common.cache;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 线程私有化变量，用于controller像service传递值
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年2月7日	下午4:14:37
 */
public class ThreadLocalMap {
	
	private static Logger logger = LoggerFactory.getLogger(ThreadLocalMap.class);
	
	public final static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<Map<String,Object>>(){
		/**
		* 只会在thradLocal调用get的时候调用一次，但是当调用了thradlLocal.remove();在调用也会调用此方法一次，通常来讲只调用一次
		*/
		@Override
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>();
		}
	};
	
	private ThreadLocalMap(){};
	
	/**
	 * 获取map
	 * @author wqf V1.0 2018年2月7日 下午4:16:00
	 * @return Map<String,Object>
	 */
	public static Map<String,Object> getContextMap(){
		return threadLocal.get();
	}
	
	/**
	 * 清空
	 * @author wqf V1.0 2018年2月7日 下午4:16:29 void
	 */
	public static void reset(){
		logger.info("getContextMap is clear");
		getContextMap().clear();
	}
	
	
	/**
	 * put
	 * @author wqf V1.0 2018年2月7日 下午4:22:23
	 * @param key
	 * @param value void
	 */
	public static void put(String key,Object value){
		getContextMap().put(key, value);
	}
	
	/**
	 * get
	 * @author wqf V1.0 2018年2月7日 下午4:22:59
	 * @param key
	 * @return Object
	 */
	public static Object get(String key){
		return getContextMap().get(key);
	}
	
	/**
	 * 删除某个key
	 * @author wqf V1.0 2018年2月7日 下午4:23:36
	 * @param key void
	 */
	public static void remove(String key){
		getContextMap().remove(key);
	}
	
	public static void remove(){
		logger.info("getContextMap is remove");
		threadLocal.remove();
	}
}
