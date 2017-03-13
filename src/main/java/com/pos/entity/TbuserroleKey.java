package com.pos.entity;

public class TbuserroleKey {
    private String fsRoleId;

    private String fsShopGUID;

    private String fsUserId;

    public String getFsRoleId() {
        return fsRoleId;
    }

    public void setFsRoleId(String fsRoleId) {
        this.fsRoleId = fsRoleId == null ? null : fsRoleId.trim();
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