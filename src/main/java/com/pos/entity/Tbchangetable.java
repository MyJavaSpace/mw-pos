package com.pos.entity;

public class Tbchangetable {
    private String fsSellNo;

    private Integer fiTimes;

    private String fsMTableId;

    private String fsMTableId_new;

    private String fsChangeReason;

    private String fsCreateTime;

    private String fsCreateUserName;

    private String fsShopGUID;

    public String getFsSellNo() {
        return fsSellNo;
    }

    public void setFsSellNo(String fsSellNo) {
        this.fsSellNo = fsSellNo == null ? null : fsSellNo.trim();
    }

    public Integer getFiTimes() {
        return fiTimes;
    }

    public void setFiTimes(Integer fiTimes) {
        this.fiTimes = fiTimes;
    }

    public String getFsMTableId() {
        return fsMTableId;
    }

    public void setFsMTableId(String fsMTableId) {
        this.fsMTableId = fsMTableId == null ? null : fsMTableId.trim();
    }

    public String getFsMTableId_new() {
        return fsMTableId_new;
    }

    public void setFsMTableId_new(String fsMTableId_new) {
        this.fsMTableId_new = fsMTableId_new == null ? null : fsMTableId_new.trim();
    }

    public String getFsChangeReason() {
        return fsChangeReason;
    }

    public void setFsChangeReason(String fsChangeReason) {
        this.fsChangeReason = fsChangeReason == null ? null : fsChangeReason.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }

    public String getFsCreateUserName() {
        return fsCreateUserName;
    }

    public void setFsCreateUserName(String fsCreateUserName) {
        this.fsCreateUserName = fsCreateUserName == null ? null : fsCreateUserName.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}