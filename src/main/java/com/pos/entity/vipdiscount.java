package com.pos.entity;

public class Vipdiscount extends VipdiscountKey {
    private Integer fidiscounttype;

    private String fsdiscountid;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public Integer getFidiscounttype() {
        return fidiscounttype;
    }

    public void setFidiscounttype(Integer fidiscounttype) {
        this.fidiscounttype = fidiscounttype;
    }

    public String getFsdiscountid() {
        return fsdiscountid;
    }

    public void setFsdiscountid(String fsdiscountid) {
        this.fsdiscountid = fsdiscountid == null ? null : fsdiscountid.trim();
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