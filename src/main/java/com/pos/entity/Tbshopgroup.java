package com.pos.entity;

public class Tbshopgroup {
    private Integer fiShopGroupId;

    private String fsShopGroupName;

    private String fsShopGroupKind;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiSortOrder;

    public Integer getFiShopGroupId() {
        return fiShopGroupId;
    }

    public void setFiShopGroupId(Integer fiShopGroupId) {
        this.fiShopGroupId = fiShopGroupId;
    }

    public String getFsShopGroupName() {
        return fsShopGroupName;
    }

    public void setFsShopGroupName(String fsShopGroupName) {
        this.fsShopGroupName = fsShopGroupName == null ? null : fsShopGroupName.trim();
    }

    public String getFsShopGroupKind() {
        return fsShopGroupKind;
    }

    public void setFsShopGroupKind(String fsShopGroupKind) {
        this.fsShopGroupKind = fsShopGroupKind == null ? null : fsShopGroupKind.trim();
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

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }
}