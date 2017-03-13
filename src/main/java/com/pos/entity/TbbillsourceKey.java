package com.pos.entity;

public class TbbillsourceKey {
    private String fsBillSourceId;

    private String fsShopGUID;

    public String getFsBillSourceId() {
        return fsBillSourceId;
    }

    public void setFsBillSourceId(String fsBillSourceId) {
        this.fsBillSourceId = fsBillSourceId == null ? null : fsBillSourceId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}