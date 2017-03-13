package com.pos.entity;

public class custsurKey {
    private String fscompanyguid;

    private String fscustsurid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFscustsurid() {
        return fscustsurid;
    }

    public void setFscustsurid(String fscustsurid) {
        this.fscustsurid = fscustsurid == null ? null : fscustsurid.trim();
    }
}