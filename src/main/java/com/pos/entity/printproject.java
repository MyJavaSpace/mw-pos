package com.pos.entity;

public class Printproject {
    private Integer fiid;

    private Integer figroupid;

    private String fsdeptid;

    private String fsmareaid;

    private Integer fistatus;

    private String fsshopguid;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public Integer getFiid() {
        return fiid;
    }

    public void setFiid(Integer fiid) {
        this.fiid = fiid;
    }

    public Integer getFigroupid() {
        return figroupid;
    }

    public void setFigroupid(Integer figroupid) {
        this.figroupid = figroupid;
    }

    public String getFsdeptid() {
        return fsdeptid;
    }

    public void setFsdeptid(String fsdeptid) {
        this.fsdeptid = fsdeptid == null ? null : fsdeptid.trim();
    }

    public String getFsmareaid() {
        return fsmareaid;
    }

    public void setFsmareaid(String fsmareaid) {
        this.fsmareaid = fsmareaid == null ? null : fsmareaid.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
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