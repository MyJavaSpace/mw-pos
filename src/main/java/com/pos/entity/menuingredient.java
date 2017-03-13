package com.pos.entity;

import java.math.BigDecimal;

public class menuingredient extends menuingredientKey {
    private String fsitemname;

    private String fsitemname2;

    private Integer fiitemgroupid;

    private String fsitemunitid;

    private BigDecimal fditemprice;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsitemname() {
        return fsitemname;
    }

    public void setFsitemname(String fsitemname) {
        this.fsitemname = fsitemname == null ? null : fsitemname.trim();
    }

    public String getFsitemname2() {
        return fsitemname2;
    }

    public void setFsitemname2(String fsitemname2) {
        this.fsitemname2 = fsitemname2 == null ? null : fsitemname2.trim();
    }

    public Integer getFiitemgroupid() {
        return fiitemgroupid;
    }

    public void setFiitemgroupid(Integer fiitemgroupid) {
        this.fiitemgroupid = fiitemgroupid;
    }

    public String getFsitemunitid() {
        return fsitemunitid;
    }

    public void setFsitemunitid(String fsitemunitid) {
        this.fsitemunitid = fsitemunitid == null ? null : fsitemunitid.trim();
    }

    public BigDecimal getFditemprice() {
        return fditemprice;
    }

    public void setFditemprice(BigDecimal fditemprice) {
        this.fditemprice = fditemprice;
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