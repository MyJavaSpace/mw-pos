package com.pos.entity;

public class Reupload {
    private String fsguid;

    private String fscreattime;

    private String fsshopguid;

    private Integer fistatus;

    private String fsbegintime;

    private String fsendtime;

    public String getFsguid() {
        return fsguid;
    }

    public void setFsguid(String fsguid) {
        this.fsguid = fsguid == null ? null : fsguid.trim();
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

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsbegintime() {
        return fsbegintime;
    }

    public void setFsbegintime(String fsbegintime) {
        this.fsbegintime = fsbegintime == null ? null : fsbegintime.trim();
    }

    public String getFsendtime() {
        return fsendtime;
    }

    public void setFsendtime(String fsendtime) {
        this.fsendtime = fsendtime == null ? null : fsendtime.trim();
    }
}