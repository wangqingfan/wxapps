package com.beixiao.common.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadPropertiesUtil {

	public static Map<String,Object> configMap = new HashMap<String, Object>();
	
	public static Map<String,Object> loadProperties (String filename) throws Exception{
		if(!configMap.containsKey(filename)){
			Properties prop = new Properties();
			InputStream ip = ReadPropertiesUtil.class.getResourceAsStream("/"+filename);
			prop.load(ip);
			ip.close();
			configMap.put(filename, prop);
		}
		return configMap;
	}
	
	public static String getValue(String fileName,String key) throws Exception{
		String value = null;
		if(ValidateUtil.isEmpty(configMap) || configMap.get(fileName) == null){
			//没有则需要重新加载
			loadProperties(fileName);
			Properties prop = (Properties)configMap.get(fileName);
			value = (String)prop.get(key);
		}else{
			Properties prop = (Properties)configMap.get(fileName);
			value = (String)prop.get(key);
		}
		
		return value;
	}
}
