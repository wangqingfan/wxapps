package com.beixiao.system.domain;

import java.util.Date;

/**
 * 内部人员
 * @author geniusDashingFan
 * 2017年12月13日 下午4:50:00
 * 
 */
public class AdminInfo {
    private Integer adminId;//成员id

    private String userName;//用户名

    private String adminCode;//工号

    private String password;//密码

    private Date createTime;//创建时间

    private Byte adminState;//人员状态

    private String mobilePhone;//手机号

    private String email;//邮箱

    private String adminIdCode;//身份证号

    private Date lstMdfTime;//最后修改时间
    
    private Integer miniAppId;//所属程序 0代表北潇自己员工

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode == null ? null : adminCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getAdminState() {
        return adminState;
    }

    public void setAdminState(Byte adminState) {
        this.adminState = adminState;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAdminIdCode() {
        return adminIdCode;
    }

    public void setAdminIdCode(String adminIdCode) {
        this.adminIdCode = adminIdCode == null ? null : adminIdCode.trim();
    }

    public Date getLstMdfTime() {
        return lstMdfTime;
    }

    public void setLstMdfTime(Date lstMdfTime) {
        this.lstMdfTime = lstMdfTime;
    }

	public Integer getMiniAppId() {
		return miniAppId;
	}

	public void setMiniAppId(Integer miniAppId) {
		this.miniAppId = miniAppId;
	}
    
    
}