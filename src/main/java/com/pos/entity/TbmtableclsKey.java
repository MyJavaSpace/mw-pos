package com.pos.entity;

public class TbmtableclsKey {
    private String fsMTableClsId;

    private String fsShopGUID;

    public String getFsMTableClsId() {
        return fsMTableClsId;
    }

    public void setFsMTableClsId(String fsMTableClsId) {
        this.fsMTableClsId = fsMTableClsId == null ? null : fsMTableClsId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}