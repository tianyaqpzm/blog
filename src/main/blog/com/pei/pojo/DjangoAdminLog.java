package com.pei.pojo;

import java.util.Date;

public class DjangoAdminLog {
    private Integer id;

    private Date actionTime;

    private Integer userId;

    private Integer contentTypeId;

    private String objectRepr;

    private Short actionFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getObjectRepr() {
        return objectRepr;
    }

    public void setObjectRepr(String objectRepr) {
        this.objectRepr = objectRepr == null ? null : objectRepr.trim();
    }

    public Short getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(Short actionFlag) {
        this.actionFlag = actionFlag;
    }
}