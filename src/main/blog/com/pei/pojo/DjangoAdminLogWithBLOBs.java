package com.pei.pojo;

public class DjangoAdminLogWithBLOBs extends DjangoAdminLog {
    private String objectId;

    private String changeMessage;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getChangeMessage() {
        return changeMessage;
    }

    public void setChangeMessage(String changeMessage) {
        this.changeMessage = changeMessage == null ? null : changeMessage.trim();
    }
}