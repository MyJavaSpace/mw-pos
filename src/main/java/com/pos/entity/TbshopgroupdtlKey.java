package com.pos.entity;

public class TbshopgroupdtlKey {
    private Integer fiShopGroupId;

    private String fsCompanyGUID;

    private String fsShopGUID;

    public Integer getFiShopGroupId() {
        return fiShopGroupId;
    }

    public void setFiShopGroupId(Integer fiShopGroupId) {
        this.fiShopGroupId = fiShopGroupId;
    }

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}