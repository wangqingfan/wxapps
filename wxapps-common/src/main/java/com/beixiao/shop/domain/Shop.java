package com.beixiao.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商户实体
 * @author geniusDashingFan
 * 2017年12月8日 下午12:05:05
 * 
 */
public class Shop {
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

    private Date createTime;//创建时间

    private Date lstModTime;//最后修改时间

    private Integer shopState;//商铺状态

    private BigDecimal totalDealMoney;//累计成交金额
    
    private Integer accountId ;//账户id
    
    private Integer shopType;//商户类型
    
    private Integer productId;//产品主键
    
    private String shopName;//商店名称
    //---------------------------vo--------------------------
    
    private String createTimeStr;
    
    private String lstModTimeStr;
    
    /**
     * 商铺状态：已续约
     */
    public static final Integer SHOP_STATE_YES = 1;
    
    /**
     * 商铺状态：未续约
     */
    public static final Integer SHOP_STATE_NO = 2;
    
    /**
     * 商铺类型：餐厅
     */
    public static final Integer SHOP_TYPE_RESTAURANT = 1; 
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
        this.cutomerName = cutomerName == null ? null : cutomerName.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
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
        this.shopProvince = shopProvince == null ? null : shopProvince.trim();
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity == null ? null : shopCity.trim();
    }

    public String getShopSubCity() {
        return shopSubCity;
    }

    public void setShopSubCity(String shopSubCity) {
        this.shopSubCity = shopSubCity == null ? null : shopSubCity.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopTelphone() {
        return shopTelphone;
    }

    public void setShopTelphone(String shopTelphone) {
        this.shopTelphone = shopTelphone == null ? null : shopTelphone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLstModTime() {
        return lstModTime;
    }

    public void setLstModTime(Date lstModTime) {
        this.lstModTime = lstModTime;
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

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	
}