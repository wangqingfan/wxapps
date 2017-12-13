package com.beixiao.system.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginListener implements HttpSessionListener{

	private Logger logger = LoggerFactory.getLogger(LoginListener.class);
	private static Map<String,Object> sessionMap = new HashMap<String,Object>();
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("session创建");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("session销毁");
		sessionMap.remove(arg0.getSession().getId());
	}
	
	public void setSession (HttpSession session){
		sessionMap.put(session.getId(), session);
	}
	
	public void getSession (HttpSession session){
		HttpSession mapSession = (HttpSession)sessionMap.get(session.getId());
		logger.info("sessionId:"+session.getId()+",session:"+mapSession);
	}
	
}
