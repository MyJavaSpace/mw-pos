package com.pos.entity;

public class PaymentKey {
    private String fspaymentid;

    private String fsshopguid;

    public String getFspaymentid() {
        return fspaymentid;
    }

    public void setFspaymentid(String fspaymentid) {
        this.fspaymentid = fspaymentid == null ? null : fspaymentid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}