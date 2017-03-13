package com.pos.entity;

public class DiscountitemKey {
    private Integer fiitemcd;

    private Integer fiorderuintcd;

    private String fsdiscountid;

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
}