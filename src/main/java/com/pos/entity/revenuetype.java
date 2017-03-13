package com.pos.entity;

public class Revenuetype extends RevenuetypeKey {
    private String fsrevenuetypename;

    private Integer fistatus;

    private Integer fidatakind;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fisortorder;

    public String getFsrevenuetypename() {
        return fsrevenuetypename;
    }

    public void setFsrevenuetypename(String fsrevenuetypename) {
        this.fsrevenuetypename = fsrevenuetypename == null ? null : fsrevenuetypename.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
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

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }
}