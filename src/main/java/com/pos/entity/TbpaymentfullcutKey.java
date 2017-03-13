package com.pos.entity;

public class TbpaymentfullcutKey {
    private String fsPaymentId;

    private String fsShopGUID;

    public String getFsPaymentId() {
        return fsPaymentId;
    }

    public void setFsPaymentId(String fsPaymentId) {
        this.fsPaymentId = fsPaymentId == null ? null : fsPaymentId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}