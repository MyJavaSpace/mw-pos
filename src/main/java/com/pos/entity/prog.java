package com.pos.entity;

public class Prog {
    private String fsprogid;

    private String fsprogname;

    private Integer fisortorder;

    private String fsprogdesc;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fsproglvl;

    private String fsfoodtradelist;

    public String getFsprogid() {
        return fsprogid;
    }

    public void setFsprogid(String fsprogid) {
        this.fsprogid = fsprogid == null ? null : fsprogid.trim();
    }

    public String getFsprogname() {
        return fsprogname;
    }

    public void setFsprogname(String fsprogname) {
        this.fsprogname = fsprogname == null ? null : fsprogname.trim();
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }

    public String getFsprogdesc() {
        return fsprogdesc;
    }

    public void setFsprogdesc(String fsprogdesc) {
        this.fsprogdesc = fsprogdesc == null ? null : fsprogdesc.trim();
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

    public String getFsproglvl() {
        return fsproglvl;
    }

    public void setFsproglvl(String fsproglvl) {
        this.fsproglvl = fsproglvl == null ? null : fsproglvl.trim();
    }

    public String getFsfoodtradelist() {
        return fsfoodtradelist;
    }

    public void setFsfoodtradelist(String fsfoodtradelist) {
        this.fsfoodtradelist = fsfoodtradelist == null ? null : fsfoodtradelist.trim();
    }
}