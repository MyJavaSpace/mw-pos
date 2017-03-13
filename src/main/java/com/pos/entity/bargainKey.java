package com.pos.entity;

public class BargainKey {
    private String fsbargainid;

    private String fsshopguid;

    public String getFsbargainid() {
        return fsbargainid;
    }

    public void setFsbargainid(String fsbargainid) {
        this.fsbargainid = fsbargainid == null ? null : fsbargainid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}