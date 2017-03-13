package com.pos.entity;

public class TbdelivererKey {
    private String fsDelivererId;

    private String fsShopGUID;

    public String getFsDelivererId() {
        return fsDelivererId;
    }

    public void setFsDelivererId(String fsDelivererId) {
        this.fsDelivererId = fsDelivererId == null ? null : fsDelivererId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}