package com.pos.entity;

public class TbuserauthdataKey {
    private String fsDataKind;

    private String fsShopGUID;

    private String fsUserId;

    private String fsValue;

    public String getFsDataKind() {
        return fsDataKind;
    }

    public void setFsDataKind(String fsDataKind) {
        this.fsDataKind = fsDataKind == null ? null : fsDataKind.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsUserId() {
        return fsUserId;
    }

    public void setFsUserId(String fsUserId) {
        this.fsUserId = fsUserId == null ? null : fsUserId.trim();
    }

    public String getFsValue() {
        return fsValue;
    }

    public void setFsValue(String fsValue) {
        this.fsValue = fsValue == null ? null : fsValue.trim();
    }
}