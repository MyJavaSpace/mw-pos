package com.pos.entity;

public class TbmtableKey {
    private String fsMTableId;

    private String fsShopGUID;

    public String getFsMTableId() {
        return fsMTableId;
    }

    public void setFsMTableId(String fsMTableId) {
        this.fsMTableId = fsMTableId == null ? null : fsMTableId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}