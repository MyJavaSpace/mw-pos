package com.pos.entity;

public class CookbookKey {
    private String fsshopguid;

    private String fscookid;

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFscookid() {
        return fscookid;
    }

    public void setFscookid(String fscookid) {
        this.fscookid = fscookid == null ? null : fscookid.trim();
    }
}