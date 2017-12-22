package com.beixiao.common.util;

public class Properties {

	public static final String PROPERTIES_INTERFACE = "interface.properties";
	
	public static final String WECHAT_LOGIN = "wechat_login";
	
	/**
	 * 获取配置文件信息
	 * @author geniusDashingFan
	 * 2017年12月22日 下午5:51:03
	 * 
	 */
	public static String getValue (String fileName ,String key) throws Exception{
		if(ValidateUtil.isEmpty(fileName) || ValidateUtil.isEmpty(key)){
			return null;
		}
		return ReadPropertiesUtil.getValue(fileName, key);
	}
}
