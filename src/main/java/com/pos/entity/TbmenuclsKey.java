package com.pos.entity;

public class TbmenuclsKey {
    private String fsMenuClsId;

    private String fsShopGUID;

    public String getFsMenuClsId() {
        return fsMenuClsId;
    }

    public void setFsMenuClsId(String fsMenuClsId) {
        this.fsMenuClsId = fsMenuClsId == null ? null : fsMenuClsId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}