package com.pos.entity;

public class VipdiscountKey {
    private String fsshopguid;

    private String fsviplvlid;

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFsviplvlid() {
        return fsviplvlid;
    }

    public void setFsviplvlid(String fsviplvlid) {
        this.fsviplvlid = fsviplvlid == null ? null : fsviplvlid.trim();
    }
}