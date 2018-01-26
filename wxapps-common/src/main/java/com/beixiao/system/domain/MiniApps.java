package com.beixiao.system.domain;

import java.util.Date;

/**
 * APP实体类
 * @author geniusDashingFan
 * 2017年12月8日 下午12:09:42
 * 
 */
public class MiniApps {
    private Integer miniAppId;//app主键

    private Date createTime;//创建时间

    private String appId;//微信端appID

    private String appSecret;//微信端app密码

    private Integer appState;//APP状态
    
    /**
     * APP状态：可用
     */
    public static final Integer APP_STATE_YES = 1;
    /**
     * APP状态：不可用
     */
    public static final Integer APP_STATE_NO = 2;

    public Integer getMiniAppId() {
        return miniAppId;
    }

    public void setMiniAppId(Integer miniAppId) {
        this.miniAppId = miniAppId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public Integer getAppState() {
        return appState;
    }

    public void setAppState(Integer appState) {
        this.appState = appState;
    }
}