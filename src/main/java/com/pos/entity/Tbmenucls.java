package com.pos.entity;

public class Tbmenucls extends TbmenuclsKey {
    private String fsMenuClsName;

    private String fsMenuClsFullName;

    private String fsExpClsId;

    private String fsRevenueTypeId;

    private Integer fiMenuClsKind;

    private Integer fiSortOrder;

    private Integer fiStatus;

    private Integer fiDataKind;

    private Integer fiLevel;

    private Integer fiDtlLvl;

    private String fsMenuClsId_P;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsMenuClsName() {
        return fsMenuClsName;
    }

    public void setFsMenuClsName(String fsMenuClsName) {
        this.fsMenuClsName = fsMenuClsName == null ? null : fsMenuClsName.trim();
    }

    public String getFsMenuClsFullName() {
        return fsMenuClsFullName;
    }

    public void setFsMenuClsFullName(String fsMenuClsFullName) {
        this.fsMenuClsFullName = fsMenuClsFullName == null ? null : fsMenuClsFullName.trim();
    }

    public String getFsExpClsId() {
        return fsExpClsId;
    }

    public void setFsExpClsId(String fsExpClsId) {
        this.fsExpClsId = fsExpClsId == null ? null : fsExpClsId.trim();
    }

    public String getFsRevenueTypeId() {
        return fsRevenueTypeId;
    }

    public void setFsRevenueTypeId(String fsRevenueTypeId) {
        this.fsRevenueTypeId = fsRevenueTypeId == null ? null : fsRevenueTypeId.trim();
    }

    public Integer getFiMenuClsKind() {
        return fiMenuClsKind;
    }

    public void setFiMenuClsKind(Integer fiMenuClsKind) {
        this.fiMenuClsKind = fiMenuClsKind;
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public Integer getFiDataKind() {
        return fiDataKind;
    }

    public void setFiDataKind(Integer fiDataKind) {
        this.fiDataKind = fiDataKind;
    }

    public Integer getFiLevel() {
        return fiLevel;
    }

    public void setFiLevel(Integer fiLevel) {
        this.fiLevel = fiLevel;
    }

    public Integer getFiDtlLvl() {
        return fiDtlLvl;
    }

    public void setFiDtlLvl(Integer fiDtlLvl) {
        this.fiDtlLvl = fiDtlLvl;
    }

    public String getFsMenuClsId_P() {
        return fsMenuClsId_P;
    }

    public void setFsMenuClsId_P(String fsMenuClsId_P) {
        this.fsMenuClsId_P = fsMenuClsId_P == null ? null : fsMenuClsId_P.trim();
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