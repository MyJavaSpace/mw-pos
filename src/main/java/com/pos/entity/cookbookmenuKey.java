package com.pos.entity;

public class CookbookmenuKey {
    private Integer fiorderuintcd;

    private String fsshopguid;

    private String fscookid;

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFscookid() {
        return fscookid;
    }

    public void setFscookid(String fscookid) {
        this.fscookid = fscookid == null ? null : fscookid.trim();
    }
}