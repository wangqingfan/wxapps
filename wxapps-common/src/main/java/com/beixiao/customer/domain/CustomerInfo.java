package com.beixiao.customer.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户类
 * @author geniusDashingFan
 * 2017年12月8日 下午12:01:32
 * 
 */
public class CustomerInfo {
    private Integer customerInfoId; //客户主键

    private Integer miniAppId;	//对应的小程序id

    private String customerName;//客户姓名

    private String mobilePhone;//手机号

    private String email;//邮件

    private String weChat;//微信

    private Integer sex;//性别

    private Integer fromChannel;//客户来源

    private BigDecimal totalConsumeMoney;//共花费

    private String livesProvince;//居住地所在省

    private String livesCity;//居住地所在市

    private String livesSubCity;//居住地所在区县

    private String livesAddress;//居住地详细地址

    private Date createTime;//创建时间

    private Date lstModTime;//修改时间

    private Integer customerCardId;//客户卡信息
    
    /**
     * 客户来源：查找
     */
    public static final Integer FROM_CHANNEL_SARCH = 1;
    
    /**
     * 客户来源：扫描
     */
    public static final Integer FROM_CHANNEL_SCAN = 2;
    
    public Integer getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(Integer customerInfoId) {
        this.customerInfoId = customerInfoId;
    }

    public Integer getMiniAppId() {
        return miniAppId;
    }

    public void setMiniAppId(Integer miniAppId) {
        this.miniAppId = miniAppId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat == null ? null : weChat.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getFromChannel() {
        return fromChannel;
    }

    public void setFromChannel(Integer fromChannel) {
        this.fromChannel = fromChannel;
    }

    public BigDecimal getTotalConsumeMoney() {
        return totalConsumeMoney;
    }

    public void setTotalConsumeMoney(BigDecimal totalConsumeMoney) {
        this.totalConsumeMoney = totalConsumeMoney;
    }

    public String getLivesProvince() {
        return livesProvince;
    }

    public void setLivesProvince(String livesProvince) {
        this.livesProvince = livesProvince == null ? null : livesProvince.trim();
    }

    public String getLivesCity() {
        return livesCity;
    }

    public void setLivesCity(String livesCity) {
        this.livesCity = livesCity == null ? null : livesCity.trim();
    }

    public String getLivesSubCity() {
        return livesSubCity;
    }

    public void setLivesSubCity(String livesSubCity) {
        this.livesSubCity = livesSubCity == null ? null : livesSubCity.trim();
    }

    public String getLivesAddress() {
        return livesAddress;
    }

    public void setLivesAddress(String livesAddress) {
        this.livesAddress = livesAddress == null ? null : livesAddress.trim();
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
    
    
	public Integer getCustomerCardId() {
		return customerCardId;
	}

	public void setCustomerCardId(Integer customerCardId) {
		this.customerCardId = customerCardId;
	}

}