package com.pos.entity;

public class Tbmenuitemsetside extends TbmenuitemsetsideKey {
    private String fsSetFoodName;

    private String fsSetFoodName2;

    private Integer fiSetFoodQty;

    private Integer fiIsRequired;

    private Integer fiSortOrder;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiSetFoodType;

    public String getFsSetFoodName() {
        return fsSetFoodName;
    }

    public void setFsSetFoodName(String fsSetFoodName) {
        this.fsSetFoodName = fsSetFoodName == null ? null : fsSetFoodName.trim();
    }

    public String getFsSetFoodName2() {
        return fsSetFoodName2;
    }

    public void setFsSetFoodName2(String fsSetFoodName2) {
        this.fsSetFoodName2 = fsSetFoodName2 == null ? null : fsSetFoodName2.trim();
    }

    public Integer getFiSetFoodQty() {
        return fiSetFoodQty;
    }

    public void setFiSetFoodQty(Integer fiSetFoodQty) {
        this.fiSetFoodQty = fiSetFoodQty;
    }

    public Integer getFiIsRequired() {
        return fiIsRequired;
    }

    public void setFiIsRequired(Integer fiIsRequired) {
        this.fiIsRequired = fiIsRequired;
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
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

    public Integer getFiSetFoodType() {
        return fiSetFoodType;
    }

    public void setFiSetFoodType(Integer fiSetFoodType) {
        this.fiSetFoodType = fiSetFoodType;
    }
}