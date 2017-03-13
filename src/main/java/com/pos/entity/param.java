package com.pos.entity;

public class param {
    private String fsparamid;

    private String fsparamname;

    private String fsnote;

    private String fsupdatetime;

    private Integer fiparamcls;

    private String fsfoodtradelist;

    public String getFsparamid() {
        return fsparamid;
    }

    public void setFsparamid(String fsparamid) {
        this.fsparamid = fsparamid == null ? null : fsparamid.trim();
    }

    public String getFsparamname() {
        return fsparamname;
    }

    public void setFsparamname(String fsparamname) {
        this.fsparamname = fsparamname == null ? null : fsparamname.trim();
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public Integer getFiparamcls() {
        return fiparamcls;
    }

    public void setFiparamcls(Integer fiparamcls) {
        this.fiparamcls = fiparamcls;
    }

    public String getFsfoodtradelist() {
        return fsfoodtradelist;
    }

    public void setFsfoodtradelist(String fsfoodtradelist) {
        this.fsfoodtradelist = fsfoodtradelist == null ? null : fsfoodtradelist.trim();
    }
}