package com.pos.entity;

public class webmenugroup {
    private Integer fiid;

    private Integer figroupid;

    private String fsmenugroupname;

    private Integer fisort;

    private String fsfoodtradeid;

    private Integer fishopkind;

    private String fsonclick;

    private String fsmenucontrolid;

    private Integer fistatus;

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

    public String getFsmenugroupname() {
        return fsmenugroupname;
    }

    public void setFsmenugroupname(String fsmenugroupname) {
        this.fsmenugroupname = fsmenugroupname == null ? null : fsmenugroupname.trim();
    }

    public Integer getFisort() {
        return fisort;
    }

    public void setFisort(Integer fisort) {
        this.fisort = fisort;
    }

    public String getFsfoodtradeid() {
        return fsfoodtradeid;
    }

    public void setFsfoodtradeid(String fsfoodtradeid) {
        this.fsfoodtradeid = fsfoodtradeid == null ? null : fsfoodtradeid.trim();
    }

    public Integer getFishopkind() {
        return fishopkind;
    }

    public void setFishopkind(Integer fishopkind) {
        this.fishopkind = fishopkind;
    }

    public String getFsonclick() {
        return fsonclick;
    }

    public void setFsonclick(String fsonclick) {
        this.fsonclick = fsonclick == null ? null : fsonclick.trim();
    }

    public String getFsmenucontrolid() {
        return fsmenucontrolid;
    }

    public void setFsmenucontrolid(String fsmenucontrolid) {
        this.fsmenucontrolid = fsmenucontrolid == null ? null : fsmenucontrolid.trim();
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