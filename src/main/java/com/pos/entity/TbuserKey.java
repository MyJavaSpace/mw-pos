package com.pos.entity;

public class TbuserKey {
    private String fsShopGUID;

    private String fsStaffId;

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsStaffId() {
        return fsStaffId;
    }

    public void setFsStaffId(String fsStaffId) {
        this.fsStaffId = fsStaffId == null ? null : fsStaffId.trim();
    }
}