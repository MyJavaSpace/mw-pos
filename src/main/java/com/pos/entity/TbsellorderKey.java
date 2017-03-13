package com.pos.entity;

public class TbsellorderKey {
    private Integer fiOrderSeq;

    private String fsSellNo;

    private String fsShopGUID;

    public Integer getFiOrderSeq() {
        return fiOrderSeq;
    }

    public void setFiOrderSeq(Integer fiOrderSeq) {
        this.fiOrderSeq = fiOrderSeq;
    }

    public String getFsSellNo() {
        return fsSellNo;
    }

    public void setFsSellNo(String fsSellNo) {
        this.fsSellNo = fsSellNo == null ? null : fsSellNo.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}