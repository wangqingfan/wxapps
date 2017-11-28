package com.beixiao.system.domain;

import java.util.Date;

public class AnrongShareInfo {
	
    private Integer anrongShareId;

    private Integer auditingInfoId;

    private String idCode;

    private String customerName;

    private String loanId;

    private Byte isShareContract;

    private Byte isShareOverdue;

    private Date createTime;

    public Integer getAnrongShareId() {
        return anrongShareId;
    }

    public void setAnrongShareId(Integer anrongShareId) {
        this.anrongShareId = anrongShareId;
    }

    public Integer getAuditingInfoId() {
        return auditingInfoId;
    }

    public void setAuditingInfoId(Integer auditingInfoId) {
        this.auditingInfoId = auditingInfoId;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public Byte getIsShareContract() {
        return isShareContract;
    }

    public void setIsShareContract(Byte isShareContract) {
        this.isShareContract = isShareContract;
    }

    public Byte getIsShareOverdue() {
        return isShareOverdue;
    }

    public void setIsShareOverdue(Byte isShareOverdue) {
        this.isShareOverdue = isShareOverdue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}