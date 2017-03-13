package com.pos.entity;

public class seqnoKey {
    private String fscls;

    private String fsshopguid;

    public String getFscls() {
        return fscls;
    }

    public void setFscls(String fscls) {
        this.fscls = fscls == null ? null : fscls.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}