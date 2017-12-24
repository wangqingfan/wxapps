package com.beixiao.restaurant.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 餐厅
 * @author geniusDashingFan
 * 2017年12月24日 下午3:04:59
 * 
 */
public class Restaurant {
    private Integer restaurantId; //主键

    private BigDecimal leastConsume;//起送金额

    private String deliveryDistance;//配送距离

    private Date beginBussinsessTime;//开始营业时间

    private Date endBussinsessTime;//结束营业时间

    private Integer bussinessState;//商户状态

    private String announcement;//公告

    private Date createTime;//创建时间

    private Date lstModTime;//修改时间

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public BigDecimal getLeastConsume() {
        return leastConsume;
    }

    public void setLeastConsume(BigDecimal leastConsume) {
        this.leastConsume = leastConsume;
    }

    public String getDeliveryDistance() {
        return deliveryDistance;
    }

    public void setDeliveryDistance(String deliveryDistance) {
        this.deliveryDistance = deliveryDistance == null ? null : deliveryDistance.trim();
    }

    public Date getBeginBussinsessTime() {
        return beginBussinsessTime;
    }

    public void setBeginBussinsessTime(Date beginBussinsessTime) {
        this.beginBussinsessTime = beginBussinsessTime;
    }

    public Date getEndBussinsessTime() {
        return endBussinsessTime;
    }

    public void setEndBussinsessTime(Date endBussinsessTime) {
        this.endBussinsessTime = endBussinsessTime;
    }

    public Integer getBussinessState() {
        return bussinessState;
    }

    public void setBussinessState(Integer bussinessState) {
        this.bussinessState = bussinessState;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement == null ? null : announcement.trim();
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
}