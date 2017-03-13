package com.pos.entity;

public class TbroleKey {
    private String fsRoleId;

    private String fsShopGUID;

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
}