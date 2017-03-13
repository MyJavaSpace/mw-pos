package com.pos.entity;

public class usershopauthorityKey {
    private String fscompanyguid;

    private String fsshopguid;

    private String fsuserid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFsuserid() {
        return fsuserid;
    }

    public void setFsuserid(String fsuserid) {
        this.fsuserid = fsuserid == null ? null : fsuserid.trim();
    }
}