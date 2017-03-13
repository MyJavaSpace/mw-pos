package com.pos.entity;

public class TbprinterKey {
    private Integer fiID;

    private String fsShopGUID;

    public Integer getFiID() {
        return fiID;
    }

    public void setFiID(Integer fiID) {
        this.fiID = fiID;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}