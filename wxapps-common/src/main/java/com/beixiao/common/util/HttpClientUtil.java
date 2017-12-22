package com.beixiao.common.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;

/**
 * httpCilentUtil工具类
 * @author geniusDashingFan
 * 2017年12月22日 上午11:26:59
 * 
 */
public class HttpClientUtil {
	
	private static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
	
	public static String post(String url,Map<String,String> map){
		String response = "";
		//创建httpclient对象
		HttpClient httpclient = new HttpClient();
		//创建post方法
		PostMethod post = new PostMethod(); 
		if(!ValidateUtil.isEmpty(map)){
			HttpMethodParams params = post.getParams();
			params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
			NameValuePair[] parametersBody = new NameValuePair[map.size()];
			int j = 0;
			for(Entry<String, String> entry:map.entrySet()){
				parametersBody[j++] = new NameValuePair(entry.getKey(),entry.getValue());
			}
			post.setRequestBody(parametersBody);
			try {
				int result = httpclient.executeMethod(post);
				response = post.getResponseBodyAsString();
				logger.info("请求地址：{}", url);
				logger.info("请求参数：{}", JSONArray.toJSONString(parametersBody));
				logger.info("响应长度：{}", result);
				logger.info("响应内容：{}", response);
			} catch (Exception e) {
				logger.error("-------post----url:"+url+"----异常--",e);
			}
		}
		return response;
	}
}
