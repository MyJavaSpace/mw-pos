package com.pos.entity;

public class Tbbargain extends TbbargainKey {
    private String fsBargainName;

    private String fsBeginTime;

    private String fsEndTime;

    private String fsMSectionIdList;

    private Integer fiPlanType;

    private String fsPlanTypeValue;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiBargainCls;

    private String fsNotusableDate;

    private Integer fiUpdateType;

    private String fsCustomStartTime;

    private String fsCustomEndTime;

    public String getFsBargainName() {
        return fsBargainName;
    }

    public void setFsBargainName(String fsBargainName) {
        this.fsBargainName = fsBargainName == null ? null : fsBargainName.trim();
    }

    public String getFsBeginTime() {
        return fsBeginTime;
    }

    public void setFsBeginTime(String fsBeginTime) {
        this.fsBeginTime = fsBeginTime == null ? null : fsBeginTime.trim();
    }

    public String getFsEndTime() {
        return fsEndTime;
    }

    public void setFsEndTime(String fsEndTime) {
        this.fsEndTime = fsEndTime == null ? null : fsEndTime.trim();
    }

    public String getFsMSectionIdList() {
        return fsMSectionIdList;
    }

    public void setFsMSectionIdList(String fsMSectionIdList) {
        this.fsMSectionIdList = fsMSectionIdList == null ? null : fsMSectionIdList.trim();
    }

    public Integer getFiPlanType() {
        return fiPlanType;
    }

    public void setFiPlanType(Integer fiPlanType) {
        this.fiPlanType = fiPlanType;
    }

    public String getFsPlanTypeValue() {
        return fsPlanTypeValue;
    }

    public void setFsPlanTypeValue(String fsPlanTypeValue) {
        this.fsPlanTypeValue = fsPlanTypeValue == null ? null : fsPlanTypeValue.trim();
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

    public Integer getFiBargainCls() {
        return fiBargainCls;
    }

    public void setFiBargainCls(Integer fiBargainCls) {
        this.fiBargainCls = fiBargainCls;
    }

    public String getFsNotusableDate() {
        return fsNotusableDate;
    }

    public void setFsNotusableDate(String fsNotusableDate) {
        this.fsNotusableDate = fsNotusableDate == null ? null : fsNotusableDate.trim();
    }

    public Integer getFiUpdateType() {
        return fiUpdateType;
    }

    public void setFiUpdateType(Integer fiUpdateType) {
        this.fiUpdateType = fiUpdateType;
    }

    public String getFsCustomStartTime() {
        return fsCustomStartTime;
    }

    public void setFsCustomStartTime(String fsCustomStartTime) {
        this.fsCustomStartTime = fsCustomStartTime == null ? null : fsCustomStartTime.trim();
    }

    public String getFsCustomEndTime() {
        return fsCustomEndTime;
    }

    public void setFsCustomEndTime(String fsCustomEndTime) {
        this.fsCustomEndTime = fsCustomEndTime == null ? null : fsCustomEndTime.trim();
    }
}