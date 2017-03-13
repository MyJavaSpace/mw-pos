package com.pos.entity;

public class Tbprinter extends TbprinterKey {
    private String fsPrinterName;

    private String fsIP;

    private Integer fiIsMakePrn;

    private Integer fiTimeOut;

    private Integer fiRetry;

    private Integer fiTaskCount;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsCommandType;

    private Integer fiPrinterCls;

    private String fsStr1;

    private Integer fiInt1;

    private Integer fiPaperSize;

    private Integer fiPrinterStatus;

    private String fsBakPrinterName;

    public String getFsPrinterName() {
        return fsPrinterName;
    }

    public void setFsPrinterName(String fsPrinterName) {
        this.fsPrinterName = fsPrinterName == null ? null : fsPrinterName.trim();
    }

    public String getFsIP() {
        return fsIP;
    }

    public void setFsIP(String fsIP) {
        this.fsIP = fsIP == null ? null : fsIP.trim();
    }

    public Integer getFiIsMakePrn() {
        return fiIsMakePrn;
    }

    public void setFiIsMakePrn(Integer fiIsMakePrn) {
        this.fiIsMakePrn = fiIsMakePrn;
    }

    public Integer getFiTimeOut() {
        return fiTimeOut;
    }

    public void setFiTimeOut(Integer fiTimeOut) {
        this.fiTimeOut = fiTimeOut;
    }

    public Integer getFiRetry() {
        return fiRetry;
    }

    public void setFiRetry(Integer fiRetry) {
        this.fiRetry = fiRetry;
    }

    public Integer getFiTaskCount() {
        return fiTaskCount;
    }

    public void setFiTaskCount(Integer fiTaskCount) {
        this.fiTaskCount = fiTaskCount;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
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

    public String getFsCommandType() {
        return fsCommandType;
    }

    public void setFsCommandType(String fsCommandType) {
        this.fsCommandType = fsCommandType == null ? null : fsCommandType.trim();
    }

    public Integer getFiPrinterCls() {
        return fiPrinterCls;
    }

    public void setFiPrinterCls(Integer fiPrinterCls) {
        this.fiPrinterCls = fiPrinterCls;
    }

    public String getFsStr1() {
        return fsStr1;
    }

    public void setFsStr1(String fsStr1) {
        this.fsStr1 = fsStr1 == null ? null : fsStr1.trim();
    }

    public Integer getFiInt1() {
        return fiInt1;
    }

    public void setFiInt1(Integer fiInt1) {
        this.fiInt1 = fiInt1;
    }

    public Integer getFiPaperSize() {
        return fiPaperSize;
    }

    public void setFiPaperSize(Integer fiPaperSize) {
        this.fiPaperSize = fiPaperSize;
    }

    public Integer getFiPrinterStatus() {
        return fiPrinterStatus;
    }

    public void setFiPrinterStatus(Integer fiPrinterStatus) {
        this.fiPrinterStatus = fiPrinterStatus;
    }

    public String getFsBakPrinterName() {
        return fsBakPrinterName;
    }

    public void setFsBakPrinterName(String fsBakPrinterName) {
        this.fsBakPrinterName = fsBakPrinterName == null ? null : fsBakPrinterName.trim();
    }
}