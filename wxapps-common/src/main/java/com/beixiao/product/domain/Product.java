package com.beixiao.product.domain;

import java.util.Date;

/**
 * 产品
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月3日	上午11:33:40
 */
public class Product {
    private Integer productId;//产品主键

    private String productName;//产品名称

    private Integer createUserId;//创建人id

    private Date createTime;//创建时间
    
    /**
     * 产品类型：菜品
     */
    public static final Integer PRODUCT_ID_DISHES = 1;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
}