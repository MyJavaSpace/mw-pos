package com.pos.entity;

public class AuthoritydtlKey {
    private String fsprogdtlid;

    private String fsprogid;

    private String fsprojid;

    private String fsroleid;

    private String fsshopguid;

    public String getFsprogdtlid() {
        return fsprogdtlid;
    }

    public void setFsprogdtlid(String fsprogdtlid) {
        this.fsprogdtlid = fsprogdtlid == null ? null : fsprogdtlid.trim();
    }

    public String getFsprogid() {
        return fsprogid;
    }

    public void setFsprogid(String fsprogid) {
        this.fsprogid = fsprogid == null ? null : fsprogid.trim();
    }

    public String getFsprojid() {
        return fsprojid;
    }

    public void setFsprojid(String fsprojid) {
        this.fsprojid = fsprojid == null ? null : fsprojid.trim();
    }

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