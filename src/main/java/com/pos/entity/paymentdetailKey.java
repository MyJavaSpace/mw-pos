package com.pos.entity;

public class paymentdetailKey {
    private String fsorderid;

    private String fsshopid;

    public String getFsorderid() {
        return fsorderid;
    }

    public void setFsorderid(String fsorderid) {
        this.fsorderid = fsorderid == null ? null : fsorderid.trim();
    }

    public String getFsshopid() {
        return fsshopid;
    }

    public void setFsshopid(String fsshopid) {
        this.fsshopid = fsshopid == null ? null : fsshopid.trim();
    }
}