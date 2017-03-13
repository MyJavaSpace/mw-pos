package com.pos.entity;

public class ViplvlKey {
    private String fscompanyguid;

    private String fsviplvlid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFsviplvlid() {
        return fsviplvlid;
    }

    public void setFsviplvlid(String fsviplvlid) {
        this.fsviplvlid = fsviplvlid == null ? null : fsviplvlid.trim();
    }
}