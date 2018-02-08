package com.beixiao.deliveryaddress.domain;

public class DeliveryAddress {
    private Integer deliveryAddressId;

    private String deliveryProvince;

    private String deliveryCity;

    private String deliverySubCity;

    private String deliveryAddress;

    private Byte deliveryState;

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

    public Byte getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(Byte deliveryState) {
        this.deliveryState = deliveryState;
    }
}