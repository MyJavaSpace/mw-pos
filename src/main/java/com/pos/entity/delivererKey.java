package com.pos.entity;

public class DelivererKey {
    private String fsdelivererid;

    private String fsshopguid;

    public String getFsdelivererid() {
        return fsdelivererid;
    }

    public void setFsdelivererid(String fsdelivererid) {
        this.fsdelivererid = fsdelivererid == null ? null : fsdelivererid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}