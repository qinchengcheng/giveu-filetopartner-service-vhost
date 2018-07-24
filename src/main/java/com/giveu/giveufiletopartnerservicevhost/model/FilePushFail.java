package com.giveu.giveufiletopartnerservicevhost.model;

import java.math.BigDecimal;
import java.util.Date;

public class FilePushFail {
    private BigDecimal id;

    private BigDecimal contractNo;

    private Long idCredit;

    private String creditModel;

    private String recordType;

    private String creditType;

    private BigDecimal times;

    private Short status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getContractNo() {
        return contractNo;
    }

    public void setContractNo(BigDecimal contractNo) {
        this.contractNo = contractNo;
    }

    public Long getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Long idCredit) {
        this.idCredit = idCredit;
    }

    public String getCreditModel() {
        return creditModel;
    }

    public void setCreditModel(String creditModel) {
        this.creditModel = creditModel == null ? null : creditModel.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }

    public BigDecimal getTimes() {
        return times;
    }

    public void setTimes(BigDecimal times) {
        this.times = times;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}