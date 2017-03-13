package com.pos.entity;

public class TbcookbookKey {
    private String fsShopGUID;

    private String fscookid;

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFscookid() {
        return fscookid;
    }

    public void setFscookid(String fscookid) {
        this.fscookid = fscookid == null ? null : fscookid.trim();
    }
}