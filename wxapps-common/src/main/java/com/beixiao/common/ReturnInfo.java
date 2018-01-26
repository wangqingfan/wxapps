package com.beixiao.common;

import com.beixiao.common.util.ValidateUtil;

public class ReturnInfo {

	private String code;
	
	private String msg;
	
	private Object obj;

	public static final String CODE_SUCCESS = "success";
	public static final String CODE_ERROR = "error";
	
	private ReturnInfo(){}
	
	public static ReturnInfo toPostReturn (String code,String msg){
		ReturnInfo r = new ReturnInfo();
		if(!ValidateUtil.isEmpty(code)){
			r.setCode(code);
		}
		if(!ValidateUtil.isEmpty(msg)){
			r.setMsg(msg);
		}
		return r;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
