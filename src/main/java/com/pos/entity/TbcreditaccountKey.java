package com.pos.entity;

public class TbcreditaccountKey {
    private String fsCreditAccountId;

    private String fsShopGUID;

    public String getFsCreditAccountId() {
        return fsCreditAccountId;
    }

    public void setFsCreditAccountId(String fsCreditAccountId) {
        this.fsCreditAccountId = fsCreditAccountId == null ? null : fsCreditAccountId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}