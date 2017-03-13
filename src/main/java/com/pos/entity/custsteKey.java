package com.pos.entity;

public class custsteKey {
    private String fscompanyguid;

    private String fscuststeid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFscuststeid() {
        return fscuststeid;
    }

    public void setFscuststeid(String fscuststeid) {
        this.fscuststeid = fscuststeid == null ? null : fscuststeid.trim();
    }
}