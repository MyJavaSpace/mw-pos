package com.pos.entity;

import java.math.BigDecimal;

public class Tbsellreceive extends TbsellreceiveKey {
    private String fsPaymentId;

    private BigDecimal fdForeignMoney;

    private BigDecimal fdExchangeRate;

    private BigDecimal fdPayMoney;

    private BigDecimal fdReceMoney;

    private Integer fiIsCalcPaid;

    private Integer fiIsCalcInvoice;

    private String fsNote;

    private String fsHostId;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiStatus;

    private String fsDataSrckind;

    private String fsSrcVerno;

    private String fspaymentname;

    private String fsbackup0;

    private String fsbackup1;

    private String fsbackup2;

    private Integer lver;

    private String fsMiscno;

    public String getFsPaymentId() {
        return fsPaymentId;
    }

    public void setFsPaymentId(String fsPaymentId) {
        this.fsPaymentId = fsPaymentId == null ? null : fsPaymentId.trim();
    }

    public BigDecimal getFdForeignMoney() {
        return fdForeignMoney;
    }

    public void setFdForeignMoney(BigDecimal fdForeignMoney) {
        this.fdForeignMoney = fdForeignMoney;
    }

    public BigDecimal getFdExchangeRate() {
        return fdExchangeRate;
    }

    public void setFdExchangeRate(BigDecimal fdExchangeRate) {
        this.fdExchangeRate = fdExchangeRate;
    }

    public BigDecimal getFdPayMoney() {
        return fdPayMoney;
    }

    public void setFdPayMoney(BigDecimal fdPayMoney) {
        this.fdPayMoney = fdPayMoney;
    }

    public BigDecimal getFdReceMoney() {
        return fdReceMoney;
    }

    public void setFdReceMoney(BigDecimal fdReceMoney) {
        this.fdReceMoney = fdReceMoney;
    }

    public Integer getFiIsCalcPaid() {
        return fiIsCalcPaid;
    }

    public void setFiIsCalcPaid(Integer fiIsCalcPaid) {
        this.fiIsCalcPaid = fiIsCalcPaid;
    }

    public Integer getFiIsCalcInvoice() {
        return fiIsCalcInvoice;
    }

    public void setFiIsCalcInvoice(Integer fiIsCalcInvoice) {
        this.fiIsCalcInvoice = fiIsCalcInvoice;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public String getFsHostId() {
        return fsHostId;
    }

    public void setFsHostId(String fsHostId) {
        this.fsHostId = fsHostId == null ? null : fsHostId.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }

    public String getFsCreateUserId() {
        return fsCreateUserId;
    }

    public void setFsCreateUserId(String fsCreateUserId) {
        this.fsCreateUserId = fsCreateUserId == null ? null : fsCreateUserId.trim();
    }

    public String getFsCreateUserName() {
        return fsCreateUserName;
    }

    public void setFsCreateUserName(String fsCreateUserName) {
        this.fsCreateUserName = fsCreateUserName == null ? null : fsCreateUserName.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsDataSrckind() {
        return fsDataSrckind;
    }

    public void setFsDataSrckind(String fsDataSrckind) {
        this.fsDataSrckind = fsDataSrckind == null ? null : fsDataSrckind.trim();
    }

    public String getFsSrcVerno() {
        return fsSrcVerno;
    }

    public void setFsSrcVerno(String fsSrcVerno) {
        this.fsSrcVerno = fsSrcVerno == null ? null : fsSrcVerno.trim();
    }

    public String getFspaymentname() {
        return fspaymentname;
    }

    public void setFspaymentname(String fspaymentname) {
        this.fspaymentname = fspaymentname == null ? null : fspaymentname.trim();
    }

    public String getFsbackup0() {
        return fsbackup0;
    }

    public void setFsbackup0(String fsbackup0) {
        this.fsbackup0 = fsbackup0 == null ? null : fsbackup0.trim();
    }

    public String getFsbackup1() {
        return fsbackup1;
    }

    public void setFsbackup1(String fsbackup1) {
        this.fsbackup1 = fsbackup1 == null ? null : fsbackup1.trim();
    }

    public String getFsbackup2() {
        return fsbackup2;
    }

    public void setFsbackup2(String fsbackup2) {
        this.fsbackup2 = fsbackup2 == null ? null : fsbackup2.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }

    public String getFsMiscno() {
        return fsMiscno;
    }

    public void setFsMiscno(String fsMiscno) {
        this.fsMiscno = fsMiscno == null ? null : fsMiscno.trim();
    }
}