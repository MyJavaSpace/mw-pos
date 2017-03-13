package com.pos.entity;

public class creditaccountKey {
    private String fscreditaccountid;

    private String fsshopguid;

    public String getFscreditaccountid() {
        return fscreditaccountid;
    }

    public void setFscreditaccountid(String fscreditaccountid) {
        this.fscreditaccountid = fscreditaccountid == null ? null : fscreditaccountid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}