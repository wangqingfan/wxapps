package com.beixiao.dishes.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 菜品表
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月3日	上午11:28:11
 */

public class Dishes {
    private Integer dishesId; //主键

    private Integer restaurantId;//餐厅id

    private Integer attachmentId;//附件id

    private String attachmentUrl;//附件url

    private String dishesName;//菜品名称

    private Date createTime;//创建时间

    private Date lstModTime;//最后修改时间

    private Integer dishesState;//菜品状态

    private String description;//菜品描述

    private BigDecimal sellPrice;//售价

    private Integer dishesType;//菜品类型

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl == null ? null : attachmentUrl.trim();
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
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

    public Integer getDishesState() {
        return dishesState;
    }

    public void setDishesState(Integer dishesState) {
        this.dishesState = dishesState;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getDishesType() {
        return dishesType;
    }

    public void setDishesType(Integer dishesType) {
        this.dishesType = dishesType;
    }
}