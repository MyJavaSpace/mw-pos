package com.pos.entity;

public class SellorderitemKey {
    private String fsseq;

    private String fsshopguid;

    public String getFsseq() {
        return fsseq;
    }

    public void setFsseq(String fsseq) {
        this.fsseq = fsseq == null ? null : fsseq.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}