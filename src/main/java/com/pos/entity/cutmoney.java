package com.pos.entity;

import java.math.BigDecimal;

public class cutmoney extends cutmoneyKey {
    private BigDecimal fdfullmoney;

    private BigDecimal fdcutmoney;

    private Integer fidiscountrate;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fspaymentid;

    private Integer fistatus;

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

    public Integer getFidiscountrate() {
        return fidiscountrate;
    }

    public void setFidiscountrate(Integer fidiscountrate) {
        this.fidiscountrate = fidiscountrate;
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

    public String getFspaymentid() {
        return fspaymentid;
    }

    public void setFspaymentid(String fspaymentid) {
        this.fspaymentid = fspaymentid == null ? null : fspaymentid.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }
}