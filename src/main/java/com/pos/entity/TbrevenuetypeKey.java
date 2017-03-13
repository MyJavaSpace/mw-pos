package com.pos.entity;

public class TbrevenuetypeKey {
    private String fsRevenueTypeId;

    private String fsShopGUID;

    public String getFsRevenueTypeId() {
        return fsRevenueTypeId;
    }

    public void setFsRevenueTypeId(String fsRevenueTypeId) {
        this.fsRevenueTypeId = fsRevenueTypeId == null ? null : fsRevenueTypeId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}