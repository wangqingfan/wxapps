package com.beixiao.deliveryaddress.domain;


/**
 * 收货地址
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年2月22日	上午9:47:51
 */
public class DeliveryAddress {
    private Integer deliveryAddressId;//收货地址id

    private String deliveryProvince;//所在省

    private String deliveryCity;//市

    private String deliverySubCity;//区县

    private String deliveryAddress;//详细地址

    private Integer deliveryState;//收货地址状态

    public Integer getDeliveryAddressId() {
        return deliveryAddressId;
    }

    public void setDeliveryAddressId(Integer deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }

    public String getDeliveryProvince() {
        return deliveryProvince;
    }

    public void setDeliveryProvince(String deliveryProvince) {
        this.deliveryProvince = deliveryProvince == null ? null : deliveryProvince.trim();
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity == null ? null : deliveryCity.trim();
    }

    public String getDeliverySubCity() {
        return deliverySubCity;
    }

    public void setDeliverySubCity(String deliverySubCity) {
        this.deliverySubCity = deliverySubCity == null ? null : deliverySubCity.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public Integer getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(Integer deliveryState) {
        this.deliveryState = deliveryState;
    }
}