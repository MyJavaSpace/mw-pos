package com.pos.entity;

public class ReportKey {
    private String fsreportid;

    private String fsshopguid;

    public String getFsreportid() {
        return fsreportid;
    }

    public void setFsreportid(String fsreportid) {
        this.fsreportid = fsreportid == null ? null : fsreportid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}