package com.pos.entity;

public class Tbusermenuitemrole extends TbusermenuitemroleKey {
    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsUpdateUserId;

    private String fsUpdateTime;

    private String fsUpdateUserName;

    private Integer fiStatus;

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }

    public String getFsCreateUserId() {
        return fsCreateUserId;
    }

    public void setFsCreateUserId(String fsCreateUserId) {
        this.fsCreateUserId = fsCreateUserId == null ? null : fsCreateUserId.trim();
    }

    public String getFsCreateUserName() {
        return fsCreateUserName;
    }

    public void setFsCreateUserName(String fsCreateUserName) {
        this.fsCreateUserName = fsCreateUserName == null ? null : fsCreateUserName.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}