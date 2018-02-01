package com.beixiao.attachment.domain;

import java.util.Date;


/**
 * 附件
 * Project: wxapps-common 
 * Author: wqf V1.0 2017年12月26日	下午6:27:04
 */
public class Attachment {
    private Integer attachmentId;//附件id

    private String fileName;//附件名称

    private Integer attachmentType;//附件类型，用于区分哪种附件

    private String fileType;//文件类型.jpg等等

    private String pathInfo;//路径

    private Date createTime;//创建时间

    private String attachmentTitle;//附件：描述这是什么

    private String state;//附件状态

    private Integer adminid;//上传人

    private String href;//附件url

    private Integer width;//图片宽

    private Integer height;//图片高

    private Integer shopId;//商户id
    
    /*--------------------------------VO-------------------------------*/
    private String[] ids;
    
    private String createTimeStr;//创建时间字符
    
    /**
     * 附件状态：未删除
     */
    public static final String STATE_YES = "01";
    
    /**
     * 附件状态：已删除
     */
    public static final String STATE_NO = "02";
    
    /**
     * 附件类型：店铺头像
     */
    public static final Integer ATTACHMET_TYPE_SHOP_HEAD_PORTRAIT = 1;
    /**
     * 附件类型：店铺介绍
     */
    public static final Integer ATTACHMET_TYPE_SHOP_ENVIRONMENT = 2;
    
    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(Integer attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo == null ? null : pathInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAttachmentTitle() {
        return attachmentTitle;
    }

    public void setAttachmentTitle(String attachmentTitle) {
        this.attachmentTitle = attachmentTitle == null ? null : attachmentTitle.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	
}