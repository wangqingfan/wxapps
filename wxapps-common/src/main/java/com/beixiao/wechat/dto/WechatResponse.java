package com.beixiao.wechat.dto;

import com.cooperate.framework.utils.runtime.CommonResult;

public class WechatResponse<B> extends CommonResult<B>{

	/**
	 * UID避免反序列化时报错
	 */
	private static final long serialVersionUID = 6201378234876555585L;
	
	public static final String SUCCESS_CODE = "success";
	
	public static final String EXCEPTION_CODE = "service.exception";
	
	public static final String PARAM_INCOMPLETE_CODE = "param.Incomplete";
	
	public static final String BAD_RESQUEST_CODE = "bad.resquest";
	
	public static final String USER_DATA_ERROR_CODE = "user.data.error";
	
	public static final String SERVICE_DATA_ERROR_CODE = "service.data.error";

	
	public WechatResponse(String resultCode){
		super.resultCode = resultCode; 
	}
	
	public WechatResponse(String resultCode, String message) {
		super.resultCode = resultCode;
		super.resultCodeMsg = message;
	}
	
	public WechatResponse(String resultCode, B b) {
		super(resultCode, b);
	}
	
	public WechatResponse(String resultCode, String message, B b) {
		super(resultCode, message, b);
	}
	
	@Override
	public boolean isSuccess() {
		if(this.resultCode.equals(SUCCESS_CODE)){
			return true;
		}
		return false;
	}
	
}
