package com.pos.entity;

public class Tbreupload {
    private String fsGuid;

    private String fsCreatTime;

    private String fsShopGuid;

    private Integer fiStatus;

    private String fsBeginTime;

    private String fsEndTime;

    public String getFsGuid() {
        return fsGuid;
    }

    public void setFsGuid(String fsGuid) {
        this.fsGuid = fsGuid == null ? null : fsGuid.trim();
    }

    public String getFsCreatTime() {
        return fsCreatTime;
    }

    public void setFsCreatTime(String fsCreatTime) {
        this.fsCreatTime = fsCreatTime == null ? null : fsCreatTime.trim();
    }

    public String getFsShopGuid() {
        return fsShopGuid;
    }

    public void setFsShopGuid(String fsShopGuid) {
        this.fsShopGuid = fsShopGuid == null ? null : fsShopGuid.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
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
}