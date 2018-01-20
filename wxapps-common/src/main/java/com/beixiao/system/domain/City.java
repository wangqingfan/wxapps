package com.beixiao.system.domain;

/**
 * 城市
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月20日	下午2:45:41
 */
public class City {
    private Integer cityId;

    private String cityName;

    private Integer provinceId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}