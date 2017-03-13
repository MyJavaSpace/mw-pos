package com.pos.entity;

public class reportconfiguration extends reportconfigurationKey {
    private String fsconfigurationname;

    private String fsconfigurationvalue;

    private String fsfoodtradeid;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsconfigurationname() {
        return fsconfigurationname;
    }

    public void setFsconfigurationname(String fsconfigurationname) {
        this.fsconfigurationname = fsconfigurationname == null ? null : fsconfigurationname.trim();
    }

    public String getFsconfigurationvalue() {
        return fsconfigurationvalue;
    }

    public void setFsconfigurationvalue(String fsconfigurationvalue) {
        this.fsconfigurationvalue = fsconfigurationvalue == null ? null : fsconfigurationvalue.trim();
    }

    public String getFsfoodtradeid() {
        return fsfoodtradeid;
    }

    public void setFsfoodtradeid(String fsfoodtradeid) {
        this.fsfoodtradeid = fsfoodtradeid == null ? null : fsfoodtradeid.trim();
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