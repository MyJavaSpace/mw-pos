package com.pos.entity;

import java.math.BigDecimal;

public class Tbcutmoney extends TbcutmoneyKey {
    private BigDecimal fdFullmoney;

    private BigDecimal fdCutmoney;

    private Integer fiDiscountRate;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsPaymentId;

    private Integer fiStatus;

    public BigDecimal getFdFullmoney() {
        return fdFullmoney;
    }

    public void setFdFullmoney(BigDecimal fdFullmoney) {
        this.fdFullmoney = fdFullmoney;
    }

    public BigDecimal getFdCutmoney() {
        return fdCutmoney;
    }

    public void setFdCutmoney(BigDecimal fdCutmoney) {
        this.fdCutmoney = fdCutmoney;
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

    public String getFsPaymentId() {
        return fsPaymentId;
    }

    public void setFsPaymentId(String fsPaymentId) {
        this.fsPaymentId = fsPaymentId == null ? null : fsPaymentId.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}