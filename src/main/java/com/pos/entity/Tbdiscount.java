package com.pos.entity;

import java.math.BigDecimal;

public class Tbdiscount extends TbdiscountKey {
    private String fsDiscountName;

    private Integer fiDiscountRate;

    private Integer fiIsVIPUse;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiDataKind;

    private Integer fiVIPId;

    private Integer fiCouponId;

    private BigDecimal fdDDV;

    private Integer fiDiscReason;

    private Integer fiIsEffectiveDate;

    private String fsStarDate;

    private String fsEndDate;

    public String getFsDiscountName() {
        return fsDiscountName;
    }

    public void setFsDiscountName(String fsDiscountName) {
        this.fsDiscountName = fsDiscountName == null ? null : fsDiscountName.trim();
    }

    public Integer getFiDiscountRate() {
        return fiDiscountRate;
    }

    public void setFiDiscountRate(Integer fiDiscountRate) {
        this.fiDiscountRate = fiDiscountRate;
    }

    public Integer getFiIsVIPUse() {
        return fiIsVIPUse;
    }

    public void setFiIsVIPUse(Integer fiIsVIPUse) {
        this.fiIsVIPUse = fiIsVIPUse;
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

    public Integer getFiDataKind() {
        return fiDataKind;
    }

    public void setFiDataKind(Integer fiDataKind) {
        this.fiDataKind = fiDataKind;
    }

    public Integer getFiVIPId() {
        return fiVIPId;
    }

    public void setFiVIPId(Integer fiVIPId) {
        this.fiVIPId = fiVIPId;
    }

    public Integer getFiCouponId() {
        return fiCouponId;
    }

    public void setFiCouponId(Integer fiCouponId) {
        this.fiCouponId = fiCouponId;
    }

    public BigDecimal getFdDDV() {
        return fdDDV;
    }

    public void setFdDDV(BigDecimal fdDDV) {
        this.fdDDV = fdDDV;
    }

    public Integer getFiDiscReason() {
        return fiDiscReason;
    }

    public void setFiDiscReason(Integer fiDiscReason) {
        this.fiDiscReason = fiDiscReason;
    }

    public Integer getFiIsEffectiveDate() {
        return fiIsEffectiveDate;
    }

    public void setFiIsEffectiveDate(Integer fiIsEffectiveDate) {
        this.fiIsEffectiveDate = fiIsEffectiveDate;
    }

    public String getFsStarDate() {
        return fsStarDate;
    }

    public void setFsStarDate(String fsStarDate) {
        this.fsStarDate = fsStarDate == null ? null : fsStarDate.trim();
    }

    public String getFsEndDate() {
        return fsEndDate;
    }

    public void setFsEndDate(String fsEndDate) {
        this.fsEndDate = fsEndDate == null ? null : fsEndDate.trim();
    }
}