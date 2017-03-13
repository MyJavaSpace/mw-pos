package com.pos.entity;

public class Wordhouse extends WordhouseKey {
    private String fsfielditem;

    private String fsword;

    private Integer fisortorder;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fistatus;

    public String getFsfielditem() {
        return fsfielditem;
    }

    public void setFsfielditem(String fsfielditem) {
        this.fsfielditem = fsfielditem == null ? null : fsfielditem.trim();
    }

    public String getFsword() {
        return fsword;
    }

    public void setFsword(String fsword) {
        this.fsword = fsword == null ? null : fsword.trim();
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
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