package com.beixiao.evaluate.domain;

import java.util.Date;

/**
 * 评分
 * Project: wxapps-common 
 * Author: wqf V1.0 2017年12月28日	下午5:23:50
 */
public class Evaluate {
    private Integer evaluateId;//评分主键

    private Integer restaurantId;//餐厅id

    private Integer evaluateLevel;//评分级别

    private String description;//评价描述

    private String attachmentUrl;//附件url

    private Integer customerId;//客户id

    private String customerName;//客户姓名

    private Integer isAnonymity;//是否匿名

    private Date createTime;//创建时间

    private Integer evaluateLabel;//评分标签

    private Integer isBest;//是否最佳

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getEvaluateLevel() {
        return evaluateLevel;
    }

    public void setEvaluateLevel(Integer evaluateLevel) {
        this.evaluateLevel = evaluateLevel;
    }

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl == null ? null : attachmentUrl.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getIsAnonymity() {
        return isAnonymity;
    }

    public void setIsAnonymity(Integer isAnonymity) {
        this.isAnonymity = isAnonymity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEvaluateLabel() {
        return evaluateLabel;
    }

    public void setEvaluateLabel(Integer evaluateLabel) {
        this.evaluateLabel = evaluateLabel;
    }

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }
}