package com.beixiao.orderform.domain;

import java.math.BigDecimal;
import java.util.Date;

public class FoodOrder {
    private Integer foodOrderId;

    private Byte foodOrderType;

    private String dishesIds;

    private BigDecimal totalMoney;

    private Integer restaurantId;

    private Date createTime;

    private Integer deliveryAddressId;

    public Integer getFoodOrderId() {
        return foodOrderId;
    }

    public void setFoodOrderId(Integer foodOrderId) {
        this.foodOrderId = foodOrderId;
    }

    public Byte getFoodOrderType() {
        return foodOrderType;
    }

    public void setFoodOrderType(Byte foodOrderType) {
        this.foodOrderType = foodOrderType;
    }

    public String getDishesIds() {
        return dishesIds;
    }

    public void setDishesIds(String dishesIds) {
        this.dishesIds = dishesIds == null ? null : dishesIds.trim();
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeliveryAddressId() {
        return deliveryAddressId;
    }

    public void setDeliveryAddressId(Integer deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }
}