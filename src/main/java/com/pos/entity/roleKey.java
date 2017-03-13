package com.pos.entity;

public class roleKey {
    private String fsroleid;

    private String fsshopguid;

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
}