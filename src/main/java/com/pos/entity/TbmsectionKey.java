package com.pos.entity;

public class TbmsectionKey {
    private String fsMSectionId;

    private String fsShopGUID;

    public String getFsMSectionId() {
        return fsMSectionId;
    }

    public void setFsMSectionId(String fsMSectionId) {
        this.fsMSectionId = fsMSectionId == null ? null : fsMSectionId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}