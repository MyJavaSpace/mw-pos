package com.pos.entity;

public class menuingredientgp extends menuingredientgpKey {
    private String fsgroupname;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsgroupname() {
        return fsgroupname;
    }

    public void setFsgroupname(String fsgroupname) {
        this.fsgroupname = fsgroupname == null ? null : fsgroupname.trim();
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