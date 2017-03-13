package com.pos.entity;

public class MenuclsKey {
    private String fsmenuclsid;

    private String fsshopguid;

    public String getFsmenuclsid() {
        return fsmenuclsid;
    }

    public void setFsmenuclsid(String fsmenuclsid) {
        this.fsmenuclsid = fsmenuclsid == null ? null : fsmenuclsid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}