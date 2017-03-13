package com.pos.entity;

public class userKey {
    private String fsshopguid;

    private String fsstaffid;

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFsstaffid() {
        return fsstaffid;
    }

    public void setFsstaffid(String fsstaffid) {
        this.fsstaffid = fsstaffid == null ? null : fsstaffid.trim();
    }
}