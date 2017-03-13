package com.pos.entity;

public class BillsourceKey {
    private String fsbillsourceid;

    private String fsshopguid;

    public String getFsbillsourceid() {
        return fsbillsourceid;
    }

    public void setFsbillsourceid(String fsbillsourceid) {
        this.fsbillsourceid = fsbillsourceid == null ? null : fsbillsourceid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}