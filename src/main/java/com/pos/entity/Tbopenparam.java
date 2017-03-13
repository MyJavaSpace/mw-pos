package com.pos.entity;

public class Tbopenparam {
    private Integer fiId;

    private String fsMAreaId;

    private Integer fiOrderUintCd;

    private Integer fiItemCd;

    private Integer fiNumberType;

    private Integer fiSaleQty;

    private Integer fiIsGift;

    private Integer fiStatus;

    private String fsShopGUID;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public String getFsMAreaId() {
        return fsMAreaId;
    }

    public void setFsMAreaId(String fsMAreaId) {
        this.fsMAreaId = fsMAreaId == null ? null : fsMAreaId.trim();
    }

    public Integer getFiOrderUintCd() {
        return fiOrderUintCd;
    }

    public void setFiOrderUintCd(Integer fiOrderUintCd) {
        this.fiOrderUintCd = fiOrderUintCd;
    }

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public Integer getFiNumberType() {
        return fiNumberType;
    }

    public void setFiNumberType(Integer fiNumberType) {
        this.fiNumberType = fiNumberType;
    }

    public Integer getFiSaleQty() {
        return fiSaleQty;
    }

    public void setFiSaleQty(Integer fiSaleQty) {
        this.fiSaleQty = fiSaleQty;
    }

    public Integer getFiIsGift() {
        return fiIsGift;
    }

    public void setFiIsGift(Integer fiIsGift) {
        this.fiIsGift = fiIsGift;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
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