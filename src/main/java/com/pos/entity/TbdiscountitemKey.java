package com.pos.entity;

public class TbdiscountitemKey {
    private Integer fiItemCd;

    private Integer fiOrderUintCd;

    private String fsDiscountId;

    private String fsShopGUID;

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public Integer getFiOrderUintCd() {
        return fiOrderUintCd;
    }

    public void setFiOrderUintCd(Integer fiOrderUintCd) {
        this.fiOrderUintCd = fiOrderUintCd;
    }

    public String getFsDiscountId() {
        return fsDiscountId;
    }

    public void setFsDiscountId(String fsDiscountId) {
        this.fsDiscountId = fsDiscountId == null ? null : fsDiscountId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}