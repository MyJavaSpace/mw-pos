package com.pos.entity;

import java.math.BigDecimal;

public class buygiftitem extends buygiftitemKey {
    private BigDecimal fdbargainprice;

    private BigDecimal fdsaleqty;

    private BigDecimal fdsaleqtyGift;

    private Integer fidiscountrate;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fistatus;

    public BigDecimal getFdbargainprice() {
        return fdbargainprice;
    }

    public void setFdbargainprice(BigDecimal fdbargainprice) {
        this.fdbargainprice = fdbargainprice;
    }

    public BigDecimal getFdsaleqty() {
        return fdsaleqty;
    }

    public void setFdsaleqty(BigDecimal fdsaleqty) {
        this.fdsaleqty = fdsaleqty;
    }

    public BigDecimal getFdsaleqtyGift() {
        return fdsaleqtyGift;
    }

    public void setFdsaleqtyGift(BigDecimal fdsaleqtyGift) {
        this.fdsaleqtyGift = fdsaleqtyGift;
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

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }
}