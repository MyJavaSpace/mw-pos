package com.pos.entity;

import java.math.BigDecimal;

public class Cookbook extends CookbookKey {
    private String fscookname;

    private BigDecimal fdpricerange;

    private Integer fidecround;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFscookname() {
        return fscookname;
    }

    public void setFscookname(String fscookname) {
        this.fscookname = fscookname == null ? null : fscookname.trim();
    }

    public BigDecimal getFdpricerange() {
        return fdpricerange;
    }

    public void setFdpricerange(BigDecimal fdpricerange) {
        this.fdpricerange = fdpricerange;
    }

    public Integer getFidecround() {
        return fidecround;
    }

    public void setFidecround(Integer fidecround) {
        this.fidecround = fidecround;
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
}