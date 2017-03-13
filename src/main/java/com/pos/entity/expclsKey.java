package com.pos.entity;

public class expclsKey {
    private String fsexpclsid;

    private String fsshopguid;

    public String getFsexpclsid() {
        return fsexpclsid;
    }

    public void setFsexpclsid(String fsexpclsid) {
        this.fsexpclsid = fsexpclsid == null ? null : fsexpclsid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}