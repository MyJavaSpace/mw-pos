package com.pos.entity;

public class MtableKey {
    private String fsmtableid;

    private String fsshopguid;

    public String getFsmtableid() {
        return fsmtableid;
    }

    public void setFsmtableid(String fsmtableid) {
        this.fsmtableid = fsmtableid == null ? null : fsmtableid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}