package com.pos.entity;

public class Tbhost extends TbhostKey {
    private String fsHostDesc;

    private String fsEncryption;

    private String fsPrinterName;

    private Integer fiHostCls;

    private Integer fiLanguage;

    private String fsNote;

    private Integer fiStatus;

    private Integer fiDataKind;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsHostDesc() {
        return fsHostDesc;
    }

    public void setFsHostDesc(String fsHostDesc) {
        this.fsHostDesc = fsHostDesc == null ? null : fsHostDesc.trim();
    }

    public String getFsEncryption() {
        return fsEncryption;
    }

    public void setFsEncryption(String fsEncryption) {
        this.fsEncryption = fsEncryption == null ? null : fsEncryption.trim();
    }

    public String getFsPrinterName() {
        return fsPrinterName;
    }

    public void setFsPrinterName(String fsPrinterName) {
        this.fsPrinterName = fsPrinterName == null ? null : fsPrinterName.trim();
    }

    public Integer getFiHostCls() {
        return fiHostCls;
    }

    public void setFiHostCls(Integer fiHostCls) {
        this.fiHostCls = fiHostCls;
    }

    public Integer getFiLanguage() {
        return fiLanguage;
    }

    public void setFiLanguage(Integer fiLanguage) {
        this.fiLanguage = fiLanguage;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public Integer getFiDataKind() {
        return fiDataKind;
    }

    public void setFiDataKind(Integer fiDataKind) {
        this.fiDataKind = fiDataKind;
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
}