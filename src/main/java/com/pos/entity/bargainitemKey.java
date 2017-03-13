package com.pos.entity;

public class BargainitemKey {
    private Integer fiitemcd;

    private Integer fiorderuintcd;

    private String fsbargainid;

    private String fsshopguid;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
    }

    public String getFsbargainid() {
        return fsbargainid;
    }

    public void setFsbargainid(String fsbargainid) {
        this.fsbargainid = fsbargainid == null ? null : fsbargainid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}