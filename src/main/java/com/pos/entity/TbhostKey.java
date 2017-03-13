package com.pos.entity;

public class TbhostKey {
    private String fsHostId;

    private String fsShopGUID;

    public String getFsHostId() {
        return fsHostId;
    }

    public void setFsHostId(String fsHostId) {
        this.fsHostId = fsHostId == null ? null : fsHostId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}