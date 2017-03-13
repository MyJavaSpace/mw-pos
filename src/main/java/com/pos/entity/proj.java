package com.pos.entity;

public class proj {
    private String fsprojid;

    private String fsprojname;

    private String fsupdateusername;

    private String fsupdatetime;

    private String fsupdateuserid;

    public String getFsprojid() {
        return fsprojid;
    }

    public void setFsprojid(String fsprojid) {
        this.fsprojid = fsprojid == null ? null : fsprojid.trim();
    }

    public String getFsprojname() {
        return fsprojname;
    }

    public void setFsprojname(String fsprojname) {
        this.fsprojname = fsprojname == null ? null : fsprojname.trim();
    }

    public String getFsupdateusername() {
        return fsupdateusername;
    }

    public void setFsupdateusername(String fsupdateusername) {
        this.fsupdateusername = fsupdateusername == null ? null : fsupdateusername.trim();
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
}