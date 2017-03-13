package com.pos.entity;

public class TbmtablesteKey {
    private String fsMTableSteId;

    private String fsShopGUID;

    public String getFsMTableSteId() {
        return fsMTableSteId;
    }

    public void setFsMTableSteId(String fsMTableSteId) {
        this.fsMTableSteId = fsMTableSteId == null ? null : fsMTableSteId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}