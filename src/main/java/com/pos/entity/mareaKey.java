package com.pos.entity;

public class MareaKey {
    private String fsmareaid;

    private String fsshopguid;

    public String getFsmareaid() {
        return fsmareaid;
    }

    public void setFsmareaid(String fsmareaid) {
        this.fsmareaid = fsmareaid == null ? null : fsmareaid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}