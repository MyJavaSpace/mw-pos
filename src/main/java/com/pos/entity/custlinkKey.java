package com.pos.entity;

public class custlinkKey {
    private String fscustguid;

    private String fslinkcustguid;

    public String getFscustguid() {
        return fscustguid;
    }

    public void setFscustguid(String fscustguid) {
        this.fscustguid = fscustguid == null ? null : fscustguid.trim();
    }

    public String getFslinkcustguid() {
        return fslinkcustguid;
    }

    public void setFslinkcustguid(String fslinkcustguid) {
        this.fslinkcustguid = fslinkcustguid == null ? null : fslinkcustguid.trim();
    }
}