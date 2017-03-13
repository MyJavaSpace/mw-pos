package com.pos.entity;

public class TradeKey {
    private String fscompanyguid;

    private String fstradeid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFstradeid() {
        return fstradeid;
    }

    public void setFstradeid(String fstradeid) {
        this.fstradeid = fstradeid == null ? null : fstradeid.trim();
    }
}