package com.pos.entity;

public class expcls extends expclsKey {
    private String fsexpclsname;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fidatakind;

    private Integer fisortorder;

    public String getFsexpclsname() {
        return fsexpclsname;
    }

    public void setFsexpclsname(String fsexpclsname) {
        this.fsexpclsname = fsexpclsname == null ? null : fsexpclsname.trim();
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

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }
}