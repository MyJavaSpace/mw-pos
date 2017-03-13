package com.pos.entity;

public class Tbpublish extends TbpublishKey {
    private String fsUpContent;

    private Integer fiPublishChannel;

    private String fsFileName;

    private String fsFileUrl;

    private Integer fiStatus;

    private String fsCheckCode;

    private String fsNote;

    private Integer fiPublishType;

    private String fsShopJosn;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsCreateTime;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiUpdateType;

    public String getFsUpContent() {
        return fsUpContent;
    }

    public void setFsUpContent(String fsUpContent) {
        this.fsUpContent = fsUpContent == null ? null : fsUpContent.trim();
    }

    public Integer getFiPublishChannel() {
        return fiPublishChannel;
    }

    public void setFiPublishChannel(Integer fiPublishChannel) {
        this.fiPublishChannel = fiPublishChannel;
    }

    public String getFsFileName() {
        return fsFileName;
    }

    public void setFsFileName(String fsFileName) {
        this.fsFileName = fsFileName == null ? null : fsFileName.trim();
    }

    public String getFsFileUrl() {
        return fsFileUrl;
    }

    public void setFsFileUrl(String fsFileUrl) {
        this.fsFileUrl = fsFileUrl == null ? null : fsFileUrl.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsCheckCode() {
        return fsCheckCode;
    }

    public void setFsCheckCode(String fsCheckCode) {
        this.fsCheckCode = fsCheckCode == null ? null : fsCheckCode.trim();
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public Integer getFiPublishType() {
        return fiPublishType;
    }

    public void setFiPublishType(Integer fiPublishType) {
        this.fiPublishType = fiPublishType;
    }

    public String getFsShopJosn() {
        return fsShopJosn;
    }

    public void setFsShopJosn(String fsShopJosn) {
        this.fsShopJosn = fsShopJosn == null ? null : fsShopJosn.trim();
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

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
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

    public Integer getFiUpdateType() {
        return fiUpdateType;
    }

    public void setFiUpdateType(Integer fiUpdateType) {
        this.fiUpdateType = fiUpdateType;
    }
}