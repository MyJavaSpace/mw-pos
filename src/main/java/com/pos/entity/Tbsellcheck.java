package com.pos.entity;

import java.math.BigDecimal;

public class Tbsellcheck extends TbsellcheckKey {
    private String fsCheckTime;

    private String fsShiftId;

    private BigDecimal fdReceAmt;

    private BigDecimal fdRealAmt;

    private BigDecimal fdInvoiceAmt;

    private Integer fiStatus;

    private String fsNote;

    private Integer fiCheckTimes;

    private Integer fiPrintTimes;

    private String fsVerifyUserId;

    private String fsVerifyTime;

    private String fsHostId;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsVerifyUserName;

    private String fsDataSrckind;

    private String fsSrcVerno;

    private String fsshiftname;

    private Integer lver;

    public String getFsCheckTime() {
        return fsCheckTime;
    }

    public void setFsCheckTime(String fsCheckTime) {
        this.fsCheckTime = fsCheckTime == null ? null : fsCheckTime.trim();
    }

    public String getFsShiftId() {
        return fsShiftId;
    }

    public void setFsShiftId(String fsShiftId) {
        this.fsShiftId = fsShiftId == null ? null : fsShiftId.trim();
    }

    public BigDecimal getFdReceAmt() {
        return fdReceAmt;
    }

    public void setFdReceAmt(BigDecimal fdReceAmt) {
        this.fdReceAmt = fdReceAmt;
    }

    public BigDecimal getFdRealAmt() {
        return fdRealAmt;
    }

    public void setFdRealAmt(BigDecimal fdRealAmt) {
        this.fdRealAmt = fdRealAmt;
    }

    public BigDecimal getFdInvoiceAmt() {
        return fdInvoiceAmt;
    }

    public void setFdInvoiceAmt(BigDecimal fdInvoiceAmt) {
        this.fdInvoiceAmt = fdInvoiceAmt;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public Integer getFiCheckTimes() {
        return fiCheckTimes;
    }

    public void setFiCheckTimes(Integer fiCheckTimes) {
        this.fiCheckTimes = fiCheckTimes;
    }

    public Integer getFiPrintTimes() {
        return fiPrintTimes;
    }

    public void setFiPrintTimes(Integer fiPrintTimes) {
        this.fiPrintTimes = fiPrintTimes;
    }

    public String getFsVerifyUserId() {
        return fsVerifyUserId;
    }

    public void setFsVerifyUserId(String fsVerifyUserId) {
        this.fsVerifyUserId = fsVerifyUserId == null ? null : fsVerifyUserId.trim();
    }

    public String getFsVerifyTime() {
        return fsVerifyTime;
    }

    public void setFsVerifyTime(String fsVerifyTime) {
        this.fsVerifyTime = fsVerifyTime == null ? null : fsVerifyTime.trim();
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

    public String getFsVerifyUserName() {
        return fsVerifyUserName;
    }

    public void setFsVerifyUserName(String fsVerifyUserName) {
        this.fsVerifyUserName = fsVerifyUserName == null ? null : fsVerifyUserName.trim();
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

    public String getFsshiftname() {
        return fsshiftname;
    }

    public void setFsshiftname(String fsshiftname) {
        this.fsshiftname = fsshiftname == null ? null : fsshiftname.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}