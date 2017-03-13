package com.pos.entity;

public class MtableclsKey {
    private String fsmtableclsid;

    private String fsshopguid;

    public String getFsmtableclsid() {
        return fsmtableclsid;
    }

    public void setFsmtableclsid(String fsmtableclsid) {
        this.fsmtableclsid = fsmtableclsid == null ? null : fsmtableclsid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}