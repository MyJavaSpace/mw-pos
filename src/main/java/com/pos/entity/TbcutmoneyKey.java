package com.pos.entity;

public class TbcutmoneyKey {
    private String fsBargainId;

    private String fsShopGUID;

    public String getFsBargainId() {
        return fsBargainId;
    }

    public void setFsBargainId(String fsBargainId) {
        this.fsBargainId = fsBargainId == null ? null : fsBargainId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}