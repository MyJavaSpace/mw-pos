package com.pos.entity;

public class TbprintprojectgpKey {
    private Integer figroupId;

    private String fsShopGUID;

    public Integer getFigroupId() {
        return figroupId;
    }

    public void setFigroupId(Integer figroupId) {
        this.figroupId = figroupId;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}