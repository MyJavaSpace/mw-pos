package com.pos.entity;

public class report extends reportKey {
    private String fsreportname;

    private String fsreporttempletid;

    private String fsnote;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fireportcls;

    private Integer fistatus;

    private String fsfoodtradelist;

    public String getFsreportname() {
        return fsreportname;
    }

    public void setFsreportname(String fsreportname) {
        this.fsreportname = fsreportname == null ? null : fsreportname.trim();
    }

    public String getFsreporttempletid() {
        return fsreporttempletid;
    }

    public void setFsreporttempletid(String fsreporttempletid) {
        this.fsreporttempletid = fsreporttempletid == null ? null : fsreporttempletid.trim();
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

    public Integer getFireportcls() {
        return fireportcls;
    }

    public void setFireportcls(Integer fireportcls) {
        this.fireportcls = fireportcls;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsfoodtradelist() {
        return fsfoodtradelist;
    }

    public void setFsfoodtradelist(String fsfoodtradelist) {
        this.fsfoodtradelist = fsfoodtradelist == null ? null : fsfoodtradelist.trim();
    }
}