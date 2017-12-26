package com.beixiao.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String date2String(Date date,String pattern){
		if(!ValidateUtil.isEmpty(date)){
			String result = "";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			result = sdf.format(date);
			return result;
		}
		return null;
	}
	
	public static String date2String(Date date){
		if(!ValidateUtil.isEmpty(date)){
			String result = "";
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			result = sdf.format(date);
			return result;
		}
		return null;
	}
}
