package com.pos.entity;

public class askgpKey {
    private String fsaskgpid;

    private String fsshopguid;

    public String getFsaskgpid() {
        return fsaskgpid;
    }

    public void setFsaskgpid(String fsaskgpid) {
        this.fsaskgpid = fsaskgpid == null ? null : fsaskgpid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}