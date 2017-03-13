package com.pos.entity;

public class TbexpclsKey {
    private String fsExpClsId;

    private String fsShopGUID;

    public String getFsExpClsId() {
        return fsExpClsId;
    }

    public void setFsExpClsId(String fsExpClsId) {
        this.fsExpClsId = fsExpClsId == null ? null : fsExpClsId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}