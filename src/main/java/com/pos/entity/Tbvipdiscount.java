package com.pos.entity;

public class Tbvipdiscount extends TbvipdiscountKey {
    private Integer fiDiscountType;

    private String fsDiscountId;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiDiscountType() {
        return fiDiscountType;
    }

    public void setFiDiscountType(Integer fiDiscountType) {
        this.fiDiscountType = fiDiscountType;
    }

    public String getFsDiscountId() {
        return fsDiscountId;
    }

    public void setFsDiscountId(String fsDiscountId) {
        this.fsDiscountId = fsDiscountId == null ? null : fsDiscountId.trim();
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