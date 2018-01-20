package com.beixiao.system.domain;

public class SubCity {
    private Integer subCityId;

    private String subCityName;

    private Integer cityId;

    public Integer getSubCityId() {
        return subCityId;
    }

    public void setSubCityId(Integer subCityId) {
        this.subCityId = subCityId;
    }

    public String getSubCityName() {
        return subCityName;
    }

    public void setSubCityName(String subCityName) {
        this.subCityName = subCityName == null ? null : subCityName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}