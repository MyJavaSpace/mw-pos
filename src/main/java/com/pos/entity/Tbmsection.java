package com.pos.entity;

public class Tbmsection extends TbmsectionKey {
    private String fsMSectionName;

    private String fsBeginTime;

    private String fsEndTime;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsMSectionName() {
        return fsMSectionName;
    }

    public void setFsMSectionName(String fsMSectionName) {
        this.fsMSectionName = fsMSectionName == null ? null : fsMSectionName.trim();
    }

    public String getFsBeginTime() {
        return fsBeginTime;
    }

    public void setFsBeginTime(String fsBeginTime) {
        this.fsBeginTime = fsBeginTime == null ? null : fsBeginTime.trim();
    }

    public String getFsEndTime() {
        return fsEndTime;
    }

    public void setFsEndTime(String fsEndTime) {
        this.fsEndTime = fsEndTime == null ? null : fsEndTime.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
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

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }
}