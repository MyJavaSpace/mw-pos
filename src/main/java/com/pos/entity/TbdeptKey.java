package com.pos.entity;

public class TbdeptKey {
    private String fsDeptId;

    private String fsShopGUID;

    public String getFsDeptId() {
        return fsDeptId;
    }

    public void setFsDeptId(String fsDeptId) {
        this.fsDeptId = fsDeptId == null ? null : fsDeptId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}