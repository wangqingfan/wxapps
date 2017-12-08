package com.beixiao.account.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户表
 * @author geniusDashingFan
 * 2017年12月8日 下午3:28:14
 * 
 */
public class Account {
    private Integer accountId;//账户主键

    private Integer accountType;//账户类型

    private BigDecimal allCash;//累计充值金额

    private BigDecimal availablelCash;//可用余额

    private Date createTime;//创建时间

    private Integer accountState;//账户状态

    private Date lastMdfTime;//最后修改时间
    
    /**
     * 账户类型: 商户
     */
    public static final Integer ACCOUNT_TYPE_SHOP = 1;
    /**
     * 账户类型: 客户
     */
    public static final Integer ACCOUNT_TYPE_CUSTOMER = 2;
    
    /**
     * 账户状态: 可用
     */
    public static final Integer ACCOUNT_STATE_YES = 1;
    /**
     * 账户状态: 不可用
     */
    public static final Integer ACCOUNT_STATE_NO = 2;

    
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getAllCash() {
        return allCash;
    }

    public void setAllCash(BigDecimal allCash) {
        this.allCash = allCash;
    }

    public BigDecimal getAvailablelCash() {
        return availablelCash;
    }

    public void setAvailablelCash(BigDecimal availablelCash) {
        this.availablelCash = availablelCash;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }

    public Date getLastMdfTime() {
        return lastMdfTime;
    }

    public void setLastMdfTime(Date lastMdfTime) {
        this.lastMdfTime = lastMdfTime;
    }
}