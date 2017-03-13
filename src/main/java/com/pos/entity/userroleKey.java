package com.pos.entity;

public class userroleKey {
    private String fsroleid;

    private String fsshopguid;

    private String fsuserid;

    public String getFsroleid() {
        return fsroleid;
    }

    public void setFsroleid(String fsroleid) {
        this.fsroleid = fsroleid == null ? null : fsroleid.trim();
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