package com.pos.entity;

public class TbparamvalueKey {
    private String fsParamId;

    private String fsShopGUID;

    public String getFsParamId() {
        return fsParamId;
    }

    public void setFsParamId(String fsParamId) {
        this.fsParamId = fsParamId == null ? null : fsParamId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}