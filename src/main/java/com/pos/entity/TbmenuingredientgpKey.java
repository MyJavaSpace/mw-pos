package com.pos.entity;

public class TbmenuingredientgpKey {
    private Integer fiItemGroupId;

    private String fsShopGUID;

    public Integer getFiItemGroupId() {
        return fiItemGroupId;
    }

    public void setFiItemGroupId(Integer fiItemGroupId) {
        this.fiItemGroupId = fiItemGroupId;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}