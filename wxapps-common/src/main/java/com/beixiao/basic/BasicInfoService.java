package com.beixiao.basic;

import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.common.ReturnInfo;
import com.beixiao.customercard.domain.CustomerCard;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.shop.domain.Shop;
import com.beixiao.system.domain.MiniApps;

public interface BasicInfoService {

	/**
	 * 保存
	 * @author wqf V1.0 2018年1月24日 下午4:12:01
	 * @param param
	 * @return ReturnInfo
	 */
	ReturnInfo saveBasic(MiniApps miniApps,Shop shop,BankInfo bankInfo,CustomerCard customerCard,Restaurant restaurant);
}
