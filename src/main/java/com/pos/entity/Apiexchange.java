package com.pos.entity;

public class Apiexchange {
    private String fsid;

    private String fsshopguid;

    private String fscreatetime;

    private String fsupdatetime;

    private Integer fistate;

    private String fsaction;

    private String fserror;

    public String getFsid() {
        return fsid;
    }

    public void setFsid(String fsid) {
        this.fsid = fsid == null ? null : fsid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public Integer getFistate() {
        return fistate;
    }

    public void setFistate(Integer fistate) {
        this.fistate = fistate;
    }

    public String getFsaction() {
        return fsaction;
    }

    public void setFsaction(String fsaction) {
        this.fsaction = fsaction == null ? null : fsaction.trim();
    }

    public String getFserror() {
        return fserror;
    }

    public void setFserror(String fserror) {
        this.fserror = fserror == null ? null : fserror.trim();
    }
}