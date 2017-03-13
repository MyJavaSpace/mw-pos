package com.pos.entity;

public class Tbfeedback {
    private Integer fiId;

    private String fsTheme;

    private Integer fiType;

    private String fsContact;

    private String fsCellphoneCt;

    private String fsEmail;

    private String fsContent;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsShopGUID;

    private String fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public String getFsTheme() {
        return fsTheme;
    }

    public void setFsTheme(String fsTheme) {
        this.fsTheme = fsTheme == null ? null : fsTheme.trim();
    }

    public Integer getFiType() {
        return fiType;
    }

    public void setFiType(Integer fiType) {
        this.fiType = fiType;
    }

    public String getFsContact() {
        return fsContact;
    }

    public void setFsContact(String fsContact) {
        this.fsContact = fsContact == null ? null : fsContact.trim();
    }

    public String getFsCellphoneCt() {
        return fsCellphoneCt;
    }

    public void setFsCellphoneCt(String fsCellphoneCt) {
        this.fsCellphoneCt = fsCellphoneCt == null ? null : fsCellphoneCt.trim();
    }

    public String getFsEmail() {
        return fsEmail;
    }

    public void setFsEmail(String fsEmail) {
        this.fsEmail = fsEmail == null ? null : fsEmail.trim();
    }

    public String getFsContent() {
        return fsContent;
    }

    public void setFsContent(String fsContent) {
        this.fsContent = fsContent == null ? null : fsContent.trim();
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

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(String fiStatus) {
        this.fiStatus = fiStatus == null ? null : fiStatus.trim();
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