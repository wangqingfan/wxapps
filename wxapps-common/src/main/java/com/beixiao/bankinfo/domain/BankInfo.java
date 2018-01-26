package com.beixiao.bankinfo.domain;

/**
 * 银行bean
 * Project: wxapps-common 
 * Author: wqf V1.0 2018年1月19日	上午10:55:50
 */
public class BankInfo {
    private Integer bankId;//主键

    private String bankName;//银行名称

    private Integer pBankId;//上级银行id

    private String country;//银行所属国家

    private String province;//银行所在省

    private String city;//银行所在市

    private String street;//银行所在区

    private String bankNo;//银行编码
    
    private String bankAddress;//银行详细信息

    
    /**
     * 国家：中国
     * @author wqf V1.0 2018年1月25日 上午10:05:57
     * @return Integer
     */
    public static final String COUNTRY_CHINA = "中国";
    
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

    public Integer getpBankId() {
        return pBankId;
    }

    public void setpBankId(Integer pBankId) {
        this.pBankId = pBankId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
    
}