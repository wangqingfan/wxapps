package com.beixiao.customercard.domain;

import java.util.Date;

/**
 * 客户卡信息
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月19日	上午10:58:02
 */
public class CustomerCard {
    private Integer customerCardId;//主键

    private Integer bankId;//银行id

    private Integer cardType;//卡类型

    private String cardCode;//卡号

    private String cardCustomerName;//开户人姓名

    private Date createTime;//创建时间

    private Date lstMdfTime;//最后修改时间

    private Integer bindCard;//绑卡状态

    private String mobilephone;//银行预留手机号

    public Integer getCustomerCardId() {
        return customerCardId;
    }

    public void setCustomerCardId(Integer customerCardId) {
        this.customerCardId = customerCardId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getCardCustomerName() {
        return cardCustomerName;
    }

    public void setCardCustomerName(String cardCustomerName) {
        this.cardCustomerName = cardCustomerName == null ? null : cardCustomerName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLstMdfTime() {
        return lstMdfTime;
    }

    public void setLstMdfTime(Date lstMdfTime) {
        this.lstMdfTime = lstMdfTime;
    }

    public Integer getBindCard() {
        return bindCard;
    }

    public void setBindCard(Integer bindCard) {
        this.bindCard = bindCard;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }
}