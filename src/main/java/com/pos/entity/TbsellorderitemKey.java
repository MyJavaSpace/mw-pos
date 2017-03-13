package com.pos.entity;

public class TbsellorderitemKey {
    private String fsSeq;

    private String fsShopGUID;

    public String getFsSeq() {
        return fsSeq;
    }

    public void setFsSeq(String fsSeq) {
        this.fsSeq = fsSeq == null ? null : fsSeq.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}