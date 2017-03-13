package com.pos.entity;

public class Tbwebmenugroup {
    private Integer fiId;

    private Integer fiGroupID;

    private String fsMenuGroupName;

    private Integer fiSort;

    private String fsFoodTradeId;

    private Integer fiShopKind;

    private String fsOnclick;

    private String fsMenuControlID;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public Integer getFiGroupID() {
        return fiGroupID;
    }

    public void setFiGroupID(Integer fiGroupID) {
        this.fiGroupID = fiGroupID;
    }

    public String getFsMenuGroupName() {
        return fsMenuGroupName;
    }

    public void setFsMenuGroupName(String fsMenuGroupName) {
        this.fsMenuGroupName = fsMenuGroupName == null ? null : fsMenuGroupName.trim();
    }

    public Integer getFiSort() {
        return fiSort;
    }

    public void setFiSort(Integer fiSort) {
        this.fiSort = fiSort;
    }

    public String getFsFoodTradeId() {
        return fsFoodTradeId;
    }

    public void setFsFoodTradeId(String fsFoodTradeId) {
        this.fsFoodTradeId = fsFoodTradeId == null ? null : fsFoodTradeId.trim();
    }

    public Integer getFiShopKind() {
        return fiShopKind;
    }

    public void setFiShopKind(Integer fiShopKind) {
        this.fiShopKind = fiShopKind;
    }

    public String getFsOnclick() {
        return fsOnclick;
    }

    public void setFsOnclick(String fsOnclick) {
        this.fsOnclick = fsOnclick == null ? null : fsOnclick.trim();
    }

    public String getFsMenuControlID() {
        return fsMenuControlID;
    }

    public void setFsMenuControlID(String fsMenuControlID) {
        this.fsMenuControlID = fsMenuControlID == null ? null : fsMenuControlID.trim();
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
}