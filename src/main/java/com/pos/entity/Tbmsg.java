package com.pos.entity;

public class Tbmsg {
    private Integer fiMsgNo;

    private Integer fiMsgKind;

    private String fsMsg;

    private String fsSender;

    private String fsMTableId;

    private String fsMTableName;

    private String fsSellNo;

    private String fsReceiver;

    private Integer fiStatus;

    private String fsReadTime;

    private String fsReadUserName;

    private String fsShopGUID;

    private String fsCreateTime;

    public Integer getFiMsgNo() {
        return fiMsgNo;
    }

    public void setFiMsgNo(Integer fiMsgNo) {
        this.fiMsgNo = fiMsgNo;
    }

    public Integer getFiMsgKind() {
        return fiMsgKind;
    }

    public void setFiMsgKind(Integer fiMsgKind) {
        this.fiMsgKind = fiMsgKind;
    }

    public String getFsMsg() {
        return fsMsg;
    }

    public void setFsMsg(String fsMsg) {
        this.fsMsg = fsMsg == null ? null : fsMsg.trim();
    }

    public String getFsSender() {
        return fsSender;
    }

    public void setFsSender(String fsSender) {
        this.fsSender = fsSender == null ? null : fsSender.trim();
    }

    public String getFsMTableId() {
        return fsMTableId;
    }

    public void setFsMTableId(String fsMTableId) {
        this.fsMTableId = fsMTableId == null ? null : fsMTableId.trim();
    }

    public String getFsMTableName() {
        return fsMTableName;
    }

    public void setFsMTableName(String fsMTableName) {
        this.fsMTableName = fsMTableName == null ? null : fsMTableName.trim();
    }

    public String getFsSellNo() {
        return fsSellNo;
    }

    public void setFsSellNo(String fsSellNo) {
        this.fsSellNo = fsSellNo == null ? null : fsSellNo.trim();
    }

    public String getFsReceiver() {
        return fsReceiver;
    }

    public void setFsReceiver(String fsReceiver) {
        this.fsReceiver = fsReceiver == null ? null : fsReceiver.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsReadTime() {
        return fsReadTime;
    }

    public void setFsReadTime(String fsReadTime) {
        this.fsReadTime = fsReadTime == null ? null : fsReadTime.trim();
    }

    public String getFsReadUserName() {
        return fsReadUserName;
    }

    public void setFsReadUserName(String fsReadUserName) {
        this.fsReadUserName = fsReadUserName == null ? null : fsReadUserName.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }
}