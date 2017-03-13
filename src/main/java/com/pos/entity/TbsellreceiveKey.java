package com.pos.entity;

public class TbsellreceiveKey {
    private Integer fiPaymentType;

    private Integer fiSeq;

    private String fsCheckBillNo;

    private String fsSellNo;

    private String fsShopGUID;

    public Integer getFiPaymentType() {
        return fiPaymentType;
    }

    public void setFiPaymentType(Integer fiPaymentType) {
        this.fiPaymentType = fiPaymentType;
    }

    public Integer getFiSeq() {
        return fiSeq;
    }

    public void setFiSeq(Integer fiSeq) {
        this.fiSeq = fiSeq;
    }

    public String getFsCheckBillNo() {
        return fsCheckBillNo;
    }

    public void setFsCheckBillNo(String fsCheckBillNo) {
        this.fsCheckBillNo = fsCheckBillNo == null ? null : fsCheckBillNo.trim();
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