package com.pos.entity;

public class TbpaymenttypeKey {
    private String fsPaymentTypeId;

    private String fsShopGUID;

    public String getFsPaymentTypeId() {
        return fsPaymentTypeId;
    }

    public void setFsPaymentTypeId(String fsPaymentTypeId) {
        this.fsPaymentTypeId = fsPaymentTypeId == null ? null : fsPaymentTypeId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}