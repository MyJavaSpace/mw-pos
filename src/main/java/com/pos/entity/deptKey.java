package com.pos.entity;

public class deptKey {
    private String fsdeptid;

    private String fsshopguid;

    public String getFsdeptid() {
        return fsdeptid;
    }

    public void setFsdeptid(String fsdeptid) {
        this.fsdeptid = fsdeptid == null ? null : fsdeptid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}