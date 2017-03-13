package com.pos.entity;

import java.math.BigDecimal;

public class Tbmenuingredient extends TbmenuingredientKey {
    private String fsItemName;

    private String fsItemName2;

    private Integer fiItemGroupId;

    private String fsItemUnitId;

    private BigDecimal fdItemPrice;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsItemName() {
        return fsItemName;
    }

    public void setFsItemName(String fsItemName) {
        this.fsItemName = fsItemName == null ? null : fsItemName.trim();
    }

    public String getFsItemName2() {
        return fsItemName2;
    }

    public void setFsItemName2(String fsItemName2) {
        this.fsItemName2 = fsItemName2 == null ? null : fsItemName2.trim();
    }

    public Integer getFiItemGroupId() {
        return fiItemGroupId;
    }

    public void setFiItemGroupId(Integer fiItemGroupId) {
        this.fiItemGroupId = fiItemGroupId;
    }

    public String getFsItemUnitId() {
        return fsItemUnitId;
    }

    public void setFsItemUnitId(String fsItemUnitId) {
        this.fsItemUnitId = fsItemUnitId == null ? null : fsItemUnitId.trim();
    }

    public BigDecimal getFdItemPrice() {
        return fdItemPrice;
    }

    public void setFdItemPrice(BigDecimal fdItemPrice) {
        this.fdItemPrice = fdItemPrice;
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