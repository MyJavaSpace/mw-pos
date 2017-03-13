package com.pos.entity;

public class Tbrevenuetype extends TbrevenuetypeKey {
    private String fsRevenueTypeName;

    private Integer fiStatus;

    private Integer fiDataKind;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiSortOrder;

    public String getFsRevenueTypeName() {
        return fsRevenueTypeName;
    }

    public void setFsRevenueTypeName(String fsRevenueTypeName) {
        this.fsRevenueTypeName = fsRevenueTypeName == null ? null : fsRevenueTypeName.trim();
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

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }
}