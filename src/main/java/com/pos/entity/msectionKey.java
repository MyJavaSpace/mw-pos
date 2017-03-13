package com.pos.entity;

public class MsectionKey {
    private String fsmsectionid;

    private String fsshopguid;

    public String getFsmsectionid() {
        return fsmsectionid;
    }

    public void setFsmsectionid(String fsmsectionid) {
        this.fsmsectionid = fsmsectionid == null ? null : fsmsectionid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}