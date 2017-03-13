package com.pos.entity;

public class ShiftKey {
    private String fsshiftid;

    private String fsshopguid;

    public String getFsshiftid() {
        return fsshiftid;
    }

    public void setFsshiftid(String fsshiftid) {
        this.fsshiftid = fsshiftid == null ? null : fsshiftid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}