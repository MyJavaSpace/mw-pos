package com.pos.entity;

public class HostKey {
    private String fshostid;

    private String fsshopguid;

    public String getFshostid() {
        return fshostid;
    }

    public void setFshostid(String fshostid) {
        this.fshostid = fshostid == null ? null : fshostid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}