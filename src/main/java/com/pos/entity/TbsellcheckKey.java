package com.pos.entity;

public class TbsellcheckKey {
    private String fsCheckBillNo;

    private String fsSellNo;

    private String fsShopGUID;

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