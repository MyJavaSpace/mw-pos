package com.pos.entity;

public class TbbuygiftitemKey {
    private Integer fiItemCd;

    private Integer fiOrderUintCd;

    private String fsBargainId;

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

    public String getFsBargainId() {
        return fsBargainId;
    }

    public void setFsBargainId(String fsBargainId) {
        this.fsBargainId = fsBargainId == null ? null : fsBargainId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}