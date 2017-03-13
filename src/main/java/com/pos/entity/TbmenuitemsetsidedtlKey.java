package com.pos.entity;

public class TbmenuitemsetsidedtlKey {
    private Integer fiItemCd;

    private Integer fiItemCd_M;

    private Integer fiOrderUintCd;

    private Integer fiSetFoodCd;

    private String fsShopGUID;

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public Integer getFiItemCd_M() {
        return fiItemCd_M;
    }

    public void setFiItemCd_M(Integer fiItemCd_M) {
        this.fiItemCd_M = fiItemCd_M;
    }

    public Integer getFiOrderUintCd() {
        return fiOrderUintCd;
    }

    public void setFiOrderUintCd(Integer fiOrderUintCd) {
        this.fiOrderUintCd = fiOrderUintCd;
    }

    public Integer getFiSetFoodCd() {
        return fiSetFoodCd;
    }

    public void setFiSetFoodCd(Integer fiSetFoodCd) {
        this.fiSetFoodCd = fiSetFoodCd;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}