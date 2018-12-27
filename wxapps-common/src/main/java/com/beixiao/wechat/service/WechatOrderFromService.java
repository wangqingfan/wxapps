package com.beixiao.wechat.service;

import java.util.Map;

public interface WechatOrderFromService {

	/**
	 * 保存订单(返回值未定)
	 * @author wqf V1.0 2018年2月5日 下午5:05:44
	 * @param param
	 * @return Integer
	 */
	Integer saveOrderFrom (Map<String,Object> param);
}
