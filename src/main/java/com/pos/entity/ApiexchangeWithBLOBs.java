package com.pos.entity;

public class ApiexchangeWithBLOBs extends Apiexchange {
    private String fstdata;

    private String fsrdata;

    public String getFstdata() {
        return fstdata;
    }

    public void setFstdata(String fstdata) {
        this.fstdata = fstdata == null ? null : fstdata.trim();
    }

    public String getFsrdata() {
        return fsrdata;
    }

    public void setFsrdata(String fsrdata) {
        this.fsrdata = fsrdata == null ? null : fsrdata.trim();
    }
}