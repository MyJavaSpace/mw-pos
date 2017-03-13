package com.pos.entity;

public class userdiscountKey {
    private String fsdiscountid;

    private String fsshopguid;

    private String fsuserid;

    public String getFsdiscountid() {
        return fsdiscountid;
    }

    public void setFsdiscountid(String fsdiscountid) {
        this.fsdiscountid = fsdiscountid == null ? null : fsdiscountid.trim();
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