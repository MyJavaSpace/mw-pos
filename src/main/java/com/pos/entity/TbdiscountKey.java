package com.pos.entity;

public class TbdiscountKey {
    private String fsDiscountId;

    private String fsShopGUID;

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
}