package com.pos.entity;

public class Tbuser extends TbuserKey {
    private String fsUserName;

    private String fsDeptId;

    private String fsCellphone;

    private String fsPID;

    private Integer fiStatus;

    private String fsUserId;

    private String fsPwd;

    private String fsAuthCode;

    private Integer fiIsSales;

    private String fsNote;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsUpdateUserId;

    private String fsUpdateTime;

    private String fsUpdateUserName;

    private String fsCompanyGUID;

    private Integer fiIsDiscount;

    private Integer fiIsRetreatFood;

    private Integer fiIsGift;

    private String fsICCardCode;

    public String getFsUserName() {
        return fsUserName;
    }

    public void setFsUserName(String fsUserName) {
        this.fsUserName = fsUserName == null ? null : fsUserName.trim();
    }

    public String getFsDeptId() {
        return fsDeptId;
    }

    public void setFsDeptId(String fsDeptId) {
        this.fsDeptId = fsDeptId == null ? null : fsDeptId.trim();
    }

    public String getFsCellphone() {
        return fsCellphone;
    }

    public void setFsCellphone(String fsCellphone) {
        this.fsCellphone = fsCellphone == null ? null : fsCellphone.trim();
    }

    public String getFsPID() {
        return fsPID;
    }

    public void setFsPID(String fsPID) {
        this.fsPID = fsPID == null ? null : fsPID.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsUserId() {
        return fsUserId;
    }

    public void setFsUserId(String fsUserId) {
        this.fsUserId = fsUserId == null ? null : fsUserId.trim();
    }

    public String getFsPwd() {
        return fsPwd;
    }

    public void setFsPwd(String fsPwd) {
        this.fsPwd = fsPwd == null ? null : fsPwd.trim();
    }

    public String getFsAuthCode() {
        return fsAuthCode;
    }

    public void setFsAuthCode(String fsAuthCode) {
        this.fsAuthCode = fsAuthCode == null ? null : fsAuthCode.trim();
    }

    public Integer getFiIsSales() {
        return fiIsSales;
    }

    public void setFiIsSales(Integer fiIsSales) {
        this.fiIsSales = fiIsSales;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
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

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public Integer getFiIsDiscount() {
        return fiIsDiscount;
    }

    public void setFiIsDiscount(Integer fiIsDiscount) {
        this.fiIsDiscount = fiIsDiscount;
    }

    public Integer getFiIsRetreatFood() {
        return fiIsRetreatFood;
    }

    public void setFiIsRetreatFood(Integer fiIsRetreatFood) {
        this.fiIsRetreatFood = fiIsRetreatFood;
    }

    public Integer getFiIsGift() {
        return fiIsGift;
    }

    public void setFiIsGift(Integer fiIsGift) {
        this.fiIsGift = fiIsGift;
    }

    public String getFsICCardCode() {
        return fsICCardCode;
    }

    public void setFsICCardCode(String fsICCardCode) {
        this.fsICCardCode = fsICCardCode == null ? null : fsICCardCode.trim();
    }
}