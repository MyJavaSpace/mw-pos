package com.pos.entity;

public class mtablesteKey {
    private String fsmtablesteid;

    private String fsshopguid;

    public String getFsmtablesteid() {
        return fsmtablesteid;
    }

    public void setFsmtablesteid(String fsmtablesteid) {
        this.fsmtablesteid = fsmtablesteid == null ? null : fsmtablesteid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}