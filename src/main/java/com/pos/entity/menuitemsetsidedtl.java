package com.pos.entity;

import java.math.BigDecimal;

public class Menuitemsetsidedtl extends MenuitemsetsidedtlKey {
    private BigDecimal fdbargainprice;

    private BigDecimal fdsaleqty;

    private Integer fidefault;

    private Integer fisortorder;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private BigDecimal fdincrease;

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

    public Integer getFidefault() {
        return fidefault;
    }

    public void setFidefault(Integer fidefault) {
        this.fidefault = fidefault;
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
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

    public BigDecimal getFdincrease() {
        return fdincrease;
    }

    public void setFdincrease(BigDecimal fdincrease) {
        this.fdincrease = fdincrease;
    }
}