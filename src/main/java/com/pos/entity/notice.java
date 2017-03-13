package com.pos.entity;

public class notice {
    private Integer id;

    private String fstitle;

    private String fscontent;

    private Integer fitype;

    private Integer fistatus;

    private String fscreatuser;

    private String fscreattime;

    private String fsshopguid;

    private String fsupdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFstitle() {
        return fstitle;
    }

    public void setFstitle(String fstitle) {
        this.fstitle = fstitle == null ? null : fstitle.trim();
    }

    public String getFscontent() {
        return fscontent;
    }

    public void setFscontent(String fscontent) {
        this.fscontent = fscontent == null ? null : fscontent.trim();
    }

    public Integer getFitype() {
        return fitype;
    }

    public void setFitype(Integer fitype) {
        this.fitype = fitype;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFscreatuser() {
        return fscreatuser;
    }

    public void setFscreatuser(String fscreatuser) {
        this.fscreatuser = fscreatuser == null ? null : fscreatuser.trim();
    }

    public String getFscreattime() {
        return fscreattime;
    }

    public void setFscreattime(String fscreattime) {
        this.fscreattime = fscreattime == null ? null : fscreattime.trim();
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
}