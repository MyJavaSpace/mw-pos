package com.pos.entity;

public class TbuserdiscountKey {
    private String fsDiscountId;

    private String fsShopGUID;

    private String fsUserId;

    public String getFsDiscountId() {
        return fsDiscountId;
    }

    public void setFsDiscountId(String fsDiscountId) {
        this.fsDiscountId = fsDiscountId == null ? null : fsDiscountId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsUserId() {
        return fsUserId;
    }

    public void setFsUserId(String fsUserId) {
        this.fsUserId = fsUserId == null ? null : fsUserId.trim();
    }
}