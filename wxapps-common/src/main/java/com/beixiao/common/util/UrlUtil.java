package com.beixiao.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * url工具类
 * @author geniusDashingFan
 * 2017年12月22日 下午3:50:48
 * 
 */
public class UrlUtil {
	
	private static Logger logger = LoggerFactory.getLogger(UrlUtil.class);
	
	public static String sendPost (String url,Map<String,String> paramMap){
		PrintWriter pw = null;
		BufferedReader bf = null;
		String result = "";
		String param = "";
		for(Entry<String, String> entry:paramMap.entrySet()){
			param += entry.getKey() + "=" + entry.getValue() + "&";
		}
		try {
			 URL realUrl = new URL(url);
			 //打开url的连接
			 URLConnection urlConnection = realUrl.openConnection();
			 //设置通用请求属性
			 urlConnection.setRequestProperty("accept", "*/*");
			 urlConnection.setRequestProperty("connection", "Keep-Alive");
			 urlConnection.setRequestProperty("Accept-Charset", "utf-8");
			 urlConnection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			 //post请求的参数
			 urlConnection.setDoOutput(true);
			 urlConnection.setDoInput(true);
			 //获取url对象的输出流
			 pw = new PrintWriter(urlConnection.getOutputStream());
			 //发送请求参数
			 pw.print(param);
			 //flush输出流
			 pw.flush();
			 //获取输入流
			 bf = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
			 String line ;
			 while((line=bf.readLine()) != null){
				 result += line;
			 }
		} catch (Exception e) {
			logger.error("------sendPost----url:"+url+"---发生错误:",e);
		}finally{
			try {
				if(pw != null){
					pw.close();
				}
				if(bf != null){
					bf.close();
				}
			} catch (Exception e2) {
				logger.error("------sendPost----url:"+url+"-关闭流--发生错误:",e2);
			}
		}
		return result;
	}
}
