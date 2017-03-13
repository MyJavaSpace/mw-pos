package com.pos.entity;

public class Tbproj {
    private String fsProjId;

    private String fsProjName;

    private String fsUpdateUserName;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    public String getFsProjId() {
        return fsProjId;
    }

    public void setFsProjId(String fsProjId) {
        this.fsProjId = fsProjId == null ? null : fsProjId.trim();
    }

    public String getFsProjName() {
        return fsProjName;
    }

    public void setFsProjName(String fsProjName) {
        this.fsProjName = fsProjName == null ? null : fsProjName.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }
}