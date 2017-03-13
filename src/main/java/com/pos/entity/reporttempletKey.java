package com.pos.entity;

public class ReporttempletKey {
    private String fsreportid;

    private String fsreporttempletid;

    private String fsshopguid;

    public String getFsreportid() {
        return fsreportid;
    }

    public void setFsreportid(String fsreportid) {
        this.fsreportid = fsreportid == null ? null : fsreportid.trim();
    }

    public String getFsreporttempletid() {
        return fsreporttempletid;
    }

    public void setFsreporttempletid(String fsreporttempletid) {
        this.fsreporttempletid = fsreporttempletid == null ? null : fsreporttempletid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}