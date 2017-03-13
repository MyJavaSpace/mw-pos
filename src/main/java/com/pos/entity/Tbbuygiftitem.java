package com.pos.entity;

import java.math.BigDecimal;

public class Tbbuygiftitem extends TbbuygiftitemKey {
    private BigDecimal fdBargainPrice;

    private BigDecimal fdSaleQty;

    private BigDecimal fdSaleQty_gift;

    private Integer fiDiscountRate;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiStatus;

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

    public BigDecimal getFdSaleQty_gift() {
        return fdSaleQty_gift;
    }

    public void setFdSaleQty_gift(BigDecimal fdSaleQty_gift) {
        this.fdSaleQty_gift = fdSaleQty_gift;
    }

    public Integer getFiDiscountRate() {
        return fiDiscountRate;
    }

    public void setFiDiscountRate(Integer fiDiscountRate) {
        this.fiDiscountRate = fiDiscountRate;
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

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}