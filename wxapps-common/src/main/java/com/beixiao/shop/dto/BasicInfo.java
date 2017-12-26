package com.beixiao.shop.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.beixiao.activity.domain.Activity;
import com.beixiao.restaurant.domain.Restaurant;

/**
 * 基本信息，包括商店、餐厅、活动、公告等
 * Project: wxapps-common 
 * Author: wqf V1.0 2017年12月25日	上午10:57:01
 */
public class BasicInfo {

	private Integer shopId;//商户主键

    private Integer miniAppId;//小程序id

    private String cutomerName;//商户负责人姓名

    private String idCode;//身份证号

    private Integer clientCardId;//客户银行卡id

    private String shopProvince;//商户所在省

    private String shopCity;//商户所在市

    private String shopSubCity;//商户所在区县

    private String shopAddress;//商户所在详细地址

    private String shopTelphone;//商户电话

    private String CreateTime;//商户创建时间

    private String LstModTime;//商户最后修改时间

    private Integer shopState;//商铺状态

    private BigDecimal totalDealMoney;//累计成交金额
    
    private Integer accountId ;//账户id
    
    private Integer shopType;//商户类型
    
    private Restaurant restaurant;//餐厅
    
    private List<Activity> activity;//活动

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getMiniAppId() {
		return miniAppId;
	}

	public void setMiniAppId(Integer miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public Integer getClientCardId() {
		return clientCardId;
	}

	public void setClientCardId(Integer clientCardId) {
		this.clientCardId = clientCardId;
	}

	public String getShopProvince() {
		return shopProvince;
	}

	public void setShopProvince(String shopProvince) {
		this.shopProvince = shopProvince;
	}

	public String getShopCity() {
		return shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopSubCity() {
		return shopSubCity;
	}

	public void setShopSubCity(String shopSubCity) {
		this.shopSubCity = shopSubCity;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopTelphone() {
		return shopTelphone;
	}

	public void setShopTelphone(String shopTelphone) {
		this.shopTelphone = shopTelphone;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getLstModTime() {
		return LstModTime;
	}

	public void setLstModTime(String lstModTime) {
		LstModTime = lstModTime;
	}

	public Integer getShopState() {
		return shopState;
	}

	public void setShopState(Integer shopState) {
		this.shopState = shopState;
	}

	public BigDecimal getTotalDealMoney() {
		return totalDealMoney;
	}

	public void setTotalDealMoney(BigDecimal totalDealMoney) {
		this.totalDealMoney = totalDealMoney;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getShopType() {
		return shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

    
}
