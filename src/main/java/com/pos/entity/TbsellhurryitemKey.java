package com.pos.entity;

public class TbsellhurryitemKey {
    private Integer fiHurrySeq;

    private String fsSellNo;

    private String fsShopGUID;

    private String fsSourceSeq;

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

    public String getFsSourceSeq() {
        return fsSourceSeq;
    }

    public void setFsSourceSeq(String fsSourceSeq) {
        this.fsSourceSeq = fsSourceSeq == null ? null : fsSourceSeq.trim();
    }
}