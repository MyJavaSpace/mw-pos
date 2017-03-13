package com.pos.entity;

import java.math.BigDecimal;

public class Tbpaymentfullcut extends TbpaymentfullcutKey {
    private BigDecimal fdFullmoney;

    private BigDecimal fdCutmoney;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

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