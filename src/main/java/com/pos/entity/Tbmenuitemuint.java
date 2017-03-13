package com.pos.entity;

import java.math.BigDecimal;

public class Tbmenuitemuint {
    private Integer fiOrderUintCd;

    private Integer fiItemCd;

    private String fsOrderUint;

    private BigDecimal fdSalePrice;

    private BigDecimal fdVIPPrice;

    private BigDecimal fdInvQty;

    private Integer fiStatus;

    private Integer fiDefault;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsShopGUID;

    private BigDecimal fdCostPrice;

    public Integer getFiOrderUintCd() {
        return fiOrderUintCd;
    }

    public void setFiOrderUintCd(Integer fiOrderUintCd) {
        this.fiOrderUintCd = fiOrderUintCd;
    }

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public String getFsOrderUint() {
        return fsOrderUint;
    }

    public void setFsOrderUint(String fsOrderUint) {
        this.fsOrderUint = fsOrderUint == null ? null : fsOrderUint.trim();
    }

    public BigDecimal getFdSalePrice() {
        return fdSalePrice;
    }

    public void setFdSalePrice(BigDecimal fdSalePrice) {
        this.fdSalePrice = fdSalePrice;
    }

    public BigDecimal getFdVIPPrice() {
        return fdVIPPrice;
    }

    public void setFdVIPPrice(BigDecimal fdVIPPrice) {
        this.fdVIPPrice = fdVIPPrice;
    }

    public BigDecimal getFdInvQty() {
        return fdInvQty;
    }

    public void setFdInvQty(BigDecimal fdInvQty) {
        this.fdInvQty = fdInvQty;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public Integer getFiDefault() {
        return fiDefault;
    }

    public void setFiDefault(Integer fiDefault) {
        this.fiDefault = fiDefault;
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

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public BigDecimal getFdCostPrice() {
        return fdCostPrice;
    }

    public void setFdCostPrice(BigDecimal fdCostPrice) {
        this.fdCostPrice = fdCostPrice;
    }
}