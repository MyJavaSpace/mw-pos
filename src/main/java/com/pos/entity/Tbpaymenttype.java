package com.pos.entity;

public class Tbpaymenttype extends TbpaymenttypeKey {
    private String fsPaymentTypeName;

    private String fsNote;

    private Integer fiStatus;

    private Integer fiDataKind;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsPaymentTypeName() {
        return fsPaymentTypeName;
    }

    public void setFsPaymentTypeName(String fsPaymentTypeName) {
        this.fsPaymentTypeName = fsPaymentTypeName == null ? null : fsPaymentTypeName.trim();
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