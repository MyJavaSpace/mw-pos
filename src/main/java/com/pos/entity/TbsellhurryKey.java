package com.pos.entity;

public class TbsellhurryKey {
    private Integer fiHurrySeq;

    private String fsSellNo;

    private String fsShopGUID;

    public Integer getFiHurrySeq() {
        return fiHurrySeq;
    }

    public void setFiHurrySeq(Integer fiHurrySeq) {
        this.fiHurrySeq = fiHurrySeq;
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