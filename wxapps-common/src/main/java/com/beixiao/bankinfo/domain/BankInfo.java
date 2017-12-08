package com.beixiao.bankinfo.domain;

/**
 * 银行信息
 * @author geniusDashingFan
 * 2017年12月8日 下午3:37:58
 * 
 */
public class BankInfo {
    private Integer bankId;//银行id

    private String bankName;//银行名字

    private String countryId;//国家名字

    private String provinceId;//省名

    private String pCityId;//上级城市

    private String cityId;//城市

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getpCityId() {
        return pCityId;
    }

    public void setpCityId(String pCityId) {
        this.pCityId = pCityId == null ? null : pCityId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }
}