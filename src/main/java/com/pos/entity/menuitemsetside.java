package com.pos.entity;

public class Menuitemsetside extends MenuitemsetsideKey {
    private String fssetfoodname;

    private String fssetfoodname2;

    private Integer fisetfoodqty;

    private Integer fiisrequired;

    private Integer fisortorder;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fisetfoodtype;

    public String getFssetfoodname() {
        return fssetfoodname;
    }

    public void setFssetfoodname(String fssetfoodname) {
        this.fssetfoodname = fssetfoodname == null ? null : fssetfoodname.trim();
    }

    public String getFssetfoodname2() {
        return fssetfoodname2;
    }

    public void setFssetfoodname2(String fssetfoodname2) {
        this.fssetfoodname2 = fssetfoodname2 == null ? null : fssetfoodname2.trim();
    }

    public Integer getFisetfoodqty() {
        return fisetfoodqty;
    }

    public void setFisetfoodqty(Integer fisetfoodqty) {
        this.fisetfoodqty = fisetfoodqty;
    }

    public Integer getFiisrequired() {
        return fiisrequired;
    }

    public void setFiisrequired(Integer fiisrequired) {
        this.fiisrequired = fiisrequired;
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

    public Integer getFisetfoodtype() {
        return fisetfoodtype;
    }

    public void setFisetfoodtype(Integer fisetfoodtype) {
        this.fisetfoodtype = fisetfoodtype;
    }
}