package com.pos.entity;

import java.math.BigDecimal;

public class paymentfullcut extends paymentfullcutKey {
    private BigDecimal fdfullmoney;

    private BigDecimal fdcutmoney;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public BigDecimal getFdfullmoney() {
        return fdfullmoney;
    }

    public void setFdfullmoney(BigDecimal fdfullmoney) {
        this.fdfullmoney = fdfullmoney;
    }

    public BigDecimal getFdcutmoney() {
        return fdcutmoney;
    }

    public void setFdcutmoney(BigDecimal fdcutmoney) {
        this.fdcutmoney = fdcutmoney;
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public String getFsupdateuserid() {
        return fsupdateuserid;
    }

    public void setFsupdateuserid(String fsupdateuserid) {
        this.fsupdateuserid = fsupdateuserid == null ? null : fsupdateuserid.trim();
    }

    public String getFsupdateusername() {
        return fsupdateusername;
    }

    public void setFsupdateusername(String fsupdateusername) {
        this.fsupdateusername = fsupdateusername == null ? null : fsupdateusername.trim();
    }
}