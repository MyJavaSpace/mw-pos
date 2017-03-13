package com.pos.entity;

public class ReportconfigurationKey {
    private String fsconfigurationid;

    private String fsshopguid;

    public String getFsconfigurationid() {
        return fsconfigurationid;
    }

    public void setFsconfigurationid(String fsconfigurationid) {
        this.fsconfigurationid = fsconfigurationid == null ? null : fsconfigurationid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}