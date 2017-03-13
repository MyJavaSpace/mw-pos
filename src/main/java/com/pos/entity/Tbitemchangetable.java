package com.pos.entity;

import java.math.BigDecimal;

public class Tbitemchangetable {
    private String fsSellNo;

    private String fsMTableId;

    private String fsSeq;

    private Long fiItemCd;

    private String fsItemId;

    private String fsItemName;

    private BigDecimal fdChangeQty;

    private String fsChangeReason;

    private String fsSellNo_new;

    private String fsMTableId_new;

    private String fsCreateTime;

    private String fsCreateUserName;

    private String fsShopGUID;

    public String getFsSellNo() {
        return fsSellNo;
    }

    public void setFsSellNo(String fsSellNo) {
        this.fsSellNo = fsSellNo == null ? null : fsSellNo.trim();
    }

    public String getFsMTableId() {
        return fsMTableId;
    }

    public void setFsMTableId(String fsMTableId) {
        this.fsMTableId = fsMTableId == null ? null : fsMTableId.trim();
    }

    public String getFsSeq() {
        return fsSeq;
    }

    public void setFsSeq(String fsSeq) {
        this.fsSeq = fsSeq == null ? null : fsSeq.trim();
    }

    public Long getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Long fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public String getFsItemId() {
        return fsItemId;
    }

    public void setFsItemId(String fsItemId) {
        this.fsItemId = fsItemId == null ? null : fsItemId.trim();
    }

    public String getFsItemName() {
        return fsItemName;
    }

    public void setFsItemName(String fsItemName) {
        this.fsItemName = fsItemName == null ? null : fsItemName.trim();
    }

    public BigDecimal getFdChangeQty() {
        return fdChangeQty;
    }

    public void setFdChangeQty(BigDecimal fdChangeQty) {
        this.fdChangeQty = fdChangeQty;
    }

    public String getFsChangeReason() {
        return fsChangeReason;
    }

    public void setFsChangeReason(String fsChangeReason) {
        this.fsChangeReason = fsChangeReason == null ? null : fsChangeReason.trim();
    }

    public String getFsSellNo_new() {
        return fsSellNo_new;
    }

    public void setFsSellNo_new(String fsSellNo_new) {
        this.fsSellNo_new = fsSellNo_new == null ? null : fsSellNo_new.trim();
    }

    public String getFsMTableId_new() {
        return fsMTableId_new;
    }

    public void setFsMTableId_new(String fsMTableId_new) {
        this.fsMTableId_new = fsMTableId_new == null ? null : fsMTableId_new.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }

    public String getFsCreateUserName() {
        return fsCreateUserName;
    }

    public void setFsCreateUserName(String fsCreateUserName) {
        this.fsCreateUserName = fsCreateUserName == null ? null : fsCreateUserName.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}