package com.pos.entity;

import java.math.BigDecimal;

public class Tbmenuitemsetsidedtl extends TbmenuitemsetsidedtlKey {
    private BigDecimal fdBargainPrice;

    private BigDecimal fdSaleQty;

    private Integer fiDefault;

    private Integer fiSortOrder;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private BigDecimal fdIncrease;

    public BigDecimal getFdBargainPrice() {
        return fdBargainPrice;
    }

    public void setFdBargainPrice(BigDecimal fdBargainPrice) {
        this.fdBargainPrice = fdBargainPrice;
    }

    public BigDecimal getFdSaleQty() {
        return fdSaleQty;
    }

    public void setFdSaleQty(BigDecimal fdSaleQty) {
        this.fdSaleQty = fdSaleQty;
    }

    public Integer getFiDefault() {
        return fiDefault;
    }

    public void setFiDefault(Integer fiDefault) {
        this.fiDefault = fiDefault;
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

    public BigDecimal getFdIncrease() {
        return fdIncrease;
    }

    public void setFdIncrease(BigDecimal fdIncrease) {
        this.fdIncrease = fdIncrease;
    }
}