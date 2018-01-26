package com.beixiao.basic.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beixiao.bankinfo.domain.BankInfo;
import com.beixiao.bankinfo.service.BankInfoService;
import com.beixiao.basic.BasicInfoService;
import com.beixiao.common.ReturnInfo;
import com.beixiao.common.util.ValidateUtil;
import com.beixiao.customercard.domain.CustomerCard;
import com.beixiao.customercard.service.CustomerCardService;
import com.beixiao.product.domain.Product;
import com.beixiao.restaurant.domain.Restaurant;
import com.beixiao.restaurant.service.RestaurantService;
import com.beixiao.shop.domain.Shop;
import com.beixiao.shop.service.ShopService;
import com.beixiao.system.domain.MiniApps;
import com.beixiao.system.service.MiniAppsService;

@Service
public class BasicInfoServiceImpl implements BasicInfoService{

	@Resource
	private MiniAppsService miniAppsService;
	@Resource
	private ShopService shopService;
	@Resource
	private BankInfoService bankInfoService;
	@Resource
	private CustomerCardService customerCardService;
	@Resource
	private RestaurantService restaurantService;
	
	@Override
	@Transactional(readOnly=false,rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public ReturnInfo saveBasic(MiniApps miniApps,Shop shop,BankInfo bankInfo,CustomerCard customerCard,Restaurant restaurant) {
		//小程序
		miniApps.setCreateTime(new Date());
		miniApps.setAppState(MiniApps.APP_STATE_YES);
		miniAppsService.insert(miniApps);
		//银行信息
		bankInfo.setCountry(BankInfo.COUNTRY_CHINA);
		bankInfoService.insert(bankInfo);
		//客户卡信息
		customerCard.setBankId(bankInfo.getBankId());
		customerCard.setCreateTime(new Date());
		customerCard.setLstMdfTime(new Date());
		customerCard.setBindCard(CustomerCard.BIND_CARD_YES);//绑卡
		customerCardService.insert(customerCard);
		//商户信息
		shop.setCreateTime(new Date());
		shop.setLstModTime(new Date());
		shop.setMiniAppId(miniApps.getMiniAppId());
		shop.setClientCardId(customerCard.getCustomerCardId());
		if(shop.getShopType() == Shop.SHOP_TYPE_RESTAURANT){
			//餐厅，设置产品为菜品
			shop.setProductId(Product.PRODUCT_ID_DISHES);
		}
		shopService.insert(shop);
		//餐厅
		if(!ValidateUtil.isEmpty(restaurant)){
			restaurant.setCreateTime(new Date());
			restaurant.setLstModTime(new Date());
			restaurant.setBussinessState(Restaurant.BUSS_STATE_YES);
			restaurant.setShopId(shop.getShopId());
			restaurantService.insert(restaurant);
		}
		return ReturnInfo.toPostReturn(ReturnInfo.CODE_SUCCESS, null);
	}
}
