package com.beixiao.system.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.beixiao.common.util.ValidateUtil;
import com.beixiao.system.domain.AdminInfo;


/**
 * 拦截器
 * Project: wxapps-web 
 * Author: wqf V1.0 2018年1月9日	下午6:36:36
 */
public class AuthInterceptor extends HandlerInterceptorAdapter{

	private Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);
	
	private List<String> allows ;
	
	public void setAllows(List<String> allows) {
		this.allows = allows;
	}
	
	/**
	* 进入controller之前进入的拦截方法
	*/
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String reqUrl = request.getServletPath();
		for(String url : allows){
			if(reqUrl.indexOf(url)!=-1){
				return true;
			}
		}
		//需要走拦截器
		logger.info("------需要走拦截器--------");
		if(ValidateUtil.isEmpty(request.getSession().getAttribute("adminInfo"))){
			request.getRequestDispatcher("/login/mustLogin").forward(request, response);;
			return false;
		}
		return super.preHandle(request, response, handler);
	}
	
	/**
	* 拦截器返回视图时进入的拦截器
	*/
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
}
