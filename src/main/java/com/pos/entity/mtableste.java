package com.pos.entity;

public class Mtableste extends MtablesteKey {
    private String fsmtablestename;

    private String fscolor;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsmtablestename() {
        return fsmtablestename;
    }

    public void setFsmtablestename(String fsmtablestename) {
        this.fsmtablestename = fsmtablestename == null ? null : fsmtablestename.trim();
    }

    public String getFscolor() {
        return fscolor;
    }

    public void setFscolor(String fscolor) {
        this.fscolor = fscolor == null ? null : fscolor.trim();
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