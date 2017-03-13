package com.pos.entity;

public class Apishopinfo {
    private String fsshopguid;

    private String fstoken;

    private Integer fitimestamp;

    private String fsshopname;

    private String fsseed;

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFstoken() {
        return fstoken;
    }

    public void setFstoken(String fstoken) {
        this.fstoken = fstoken == null ? null : fstoken.trim();
    }

    public Integer getFitimestamp() {
        return fitimestamp;
    }

    public void setFitimestamp(Integer fitimestamp) {
        this.fitimestamp = fitimestamp;
    }

    public String getFsshopname() {
        return fsshopname;
    }

    public void setFsshopname(String fsshopname) {
        this.fsshopname = fsshopname == null ? null : fsshopname.trim();
    }

    public String getFsseed() {
        return fsseed;
    }

    public void setFsseed(String fsseed) {
        this.fsseed = fsseed == null ? null : fsseed.trim();
    }
}