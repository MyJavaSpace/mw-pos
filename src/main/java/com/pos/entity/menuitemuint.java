package com.pos.entity;

import java.math.BigDecimal;

public class menuitemuint {
    private Integer fiorderuintcd;

    private Integer fiitemcd;

    private String fsorderuint;

    private BigDecimal fdsaleprice;

    private BigDecimal fdvipprice;

    private BigDecimal fdinvqty;

    private Integer fistatus;

    private Integer fidefault;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fsshopguid;

    private BigDecimal fdcostprice;

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
    }

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public String getFsorderuint() {
        return fsorderuint;
    }

    public void setFsorderuint(String fsorderuint) {
        this.fsorderuint = fsorderuint == null ? null : fsorderuint.trim();
    }

    public BigDecimal getFdsaleprice() {
        return fdsaleprice;
    }

    public void setFdsaleprice(BigDecimal fdsaleprice) {
        this.fdsaleprice = fdsaleprice;
    }

    public BigDecimal getFdvipprice() {
        return fdvipprice;
    }

    public void setFdvipprice(BigDecimal fdvipprice) {
        this.fdvipprice = fdvipprice;
    }

    public BigDecimal getFdinvqty() {
        return fdinvqty;
    }

    public void setFdinvqty(BigDecimal fdinvqty) {
        this.fdinvqty = fdinvqty;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public Integer getFidefault() {
        return fidefault;
    }

    public void setFidefault(Integer fidefault) {
        this.fidefault = fidefault;
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

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public BigDecimal getFdcostprice() {
        return fdcostprice;
    }

    public void setFdcostprice(BigDecimal fdcostprice) {
        this.fdcostprice = fdcostprice;
    }
}