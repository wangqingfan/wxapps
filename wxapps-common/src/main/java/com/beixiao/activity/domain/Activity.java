package com.beixiao.activity.domain;

import java.util.Date;

/**
 * 活动
 * @author geniusDashingFan
 * 2017年12月24日 下午3:39:28
 * 
 */
public class Activity {
    private Integer activityId;//活动主键

    private String content;//内容

    private Integer state;//状态

    private Integer createAuthorId;//创建者id

    private String createAuthorName;//创建者姓名

    private Date createTime;//创建时间

    private Date lstModTime;//最后修改时间
    
    private Integer shopId;//商店id

    /*---------vo-------------*/
    
    private String createTimeStr;
    
    private String lstModTimeStr;
    
    /**
     * 活动状态：可用
     */
    public static final Integer STATE_YES = 1;
    
    /**
     * 活动状态：不可用
     */
    public static final Integer STATE_NO = 2;
    
    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreateAuthorId() {
        return createAuthorId;
    }

    public void setCreateAuthorId(Integer createAuthorId) {
        this.createAuthorId = createAuthorId;
    }

    public String getCreateAuthorName() {
        return createAuthorName;
    }

    public void setCreateAuthorName(String createAuthorName) {
        this.createAuthorName = createAuthorName;
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