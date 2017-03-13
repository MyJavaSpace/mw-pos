package com.pos.entity;

public class DiscountKey {
    private String fsdiscountid;

    private String fsshopguid;

    public String getFsdiscountid() {
        return fsdiscountid;
    }

    public void setFsdiscountid(String fsdiscountid) {
        this.fsdiscountid = fsdiscountid == null ? null : fsdiscountid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}