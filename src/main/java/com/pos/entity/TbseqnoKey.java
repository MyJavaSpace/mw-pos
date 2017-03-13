package com.pos.entity;

public class TbseqnoKey {
    private String fsCls;

    private String fsShopGUID;

    public String getFsCls() {
        return fsCls;
    }

    public void setFsCls(String fsCls) {
        this.fsCls = fsCls == null ? null : fsCls.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}