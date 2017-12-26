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

    private String beginBussinessTime;//开始营业时间

    private String endBussinessTime;//结束营业时间

    private Integer bussinessState;//商户状态

    private String announcement;//公告

    private Date createTime;//创建时间

    private Date lstModTime;//修改时间
    
    private Integer shopId;//商店id

    
    /*---------vo-------------*/
    
    private String createTimeStr;
    
    private String lstModTimeStr;
    
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

    public String getBeginBussinessTime() {
		return beginBussinessTime;
	}

	public void setBeginBussinessTime(String beginBussinessTime) {
		this.beginBussinessTime = beginBussinessTime;
	}

	public String getEndBussinessTime() {
		return endBussinessTime;
	}

	public void setEndBussinessTime(String endBussinessTime) {
		this.endBussinessTime = endBussinessTime;
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

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getLstModTimeStr() {
		return lstModTimeStr;
	}

	public void setLstModTimeStr(String lstModTimeStr) {
		this.lstModTimeStr = lstModTimeStr;
	}
    
}