package com.beixiao.bankcard.domain;

import java.util.Date;

/**
 * 银行卡
 * @author geniusDashingFan
 * 2017年12月8日 下午3:36:30
 * 
 */
public class BankCard {
    private Integer bankCardId;//银行卡主键

    private Integer bankId;//银行id

    private Integer cardType;//卡类型

    private String cardCode;//卡号

    private String cardCustomerName;//开户名

    private Date createTime;//创建时间

    private Date lstMdfTime;//最后修改时间

    private String mobilePhone;//预留手机号

    private Integer bindCard;//卡状态

    private Date bindCardTime;//绑卡时间
    
    /**
     * 卡片类型：信用卡
     */
    public static final Integer CARD_TYPE_CREDIT = 1;
    /**
     * 卡片类型：储蓄卡
     */
    public static final Integer CARD_TYPE_SAVING = 2;
    /**
     * 绑卡状态：已绑定
     */
    public static final Integer BIND_CARD_YES = 1;
    /**
     * 绑卡状态：解绑
     */
    public static final Integer BIND_CARD_NO = 2;
    
    

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Integer getBindCard() {
        return bindCard;
    }

    public void setBindCard(Integer bindCard) {
        this.bindCard = bindCard;
    }

    public Date getBindCardTime() {
        return bindCardTime;
    }

    public void setBindCardTime(Date bindCardTime) {
        this.bindCardTime = bindCardTime;
    }
}