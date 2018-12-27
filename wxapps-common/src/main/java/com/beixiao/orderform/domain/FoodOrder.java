package com.beixiao.orderform.domain;

import java.math.BigDecimal;
import java.util.Date;

public class FoodOrder {
    private Integer foodOrderId;//主键

    private Integer foodOrderType;//订单类型

    private String dishesIds;//菜品ids

    private BigDecimal totalMoney;//总金额

    private Integer restaurantId;//餐厅id

    private Date createTime;//创建时间

    private Integer deliveryAddressId;//送货地址id
    
    private Integer foodOrderState;//食物订单状态

    /**
     * 订单状态：可用
     */
    public static final Integer STATE_YES = 1;
    
    /**
     * 订单状态：过期
     */
    public static final Integer STATE_NO = 2;
    
    /**
     * 订单类型：店内
     */
    public static final Integer TYPE_SHOP = 1;
    
    public Integer getFoodOrderId() {
        return foodOrderId;
    }

    public void setFoodOrderId(Integer foodOrderId) {
        this.foodOrderId = foodOrderId;
    }

    public Integer getFoodOrderType() {
        return foodOrderType;
    }

    public void setFoodOrderType(Integer foodOrderType) {
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

	public Integer getFoodOrderState() {
		return foodOrderState;
	}

	public void setFoodOrderState(Integer foodOrderState) {
		this.foodOrderState = foodOrderState;
	}
    
}