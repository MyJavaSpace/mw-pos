package com.pos.entity;

public class shopgroupdtlKey {
    private Integer fishopgroupid;

    private String fscompanyguid;

    private String fsshopguid;

    public Integer getFishopgroupid() {
        return fishopgroupid;
    }

    public void setFishopgroupid(Integer fishopgroupid) {
        this.fishopgroupid = fishopgroupid;
    }

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
}