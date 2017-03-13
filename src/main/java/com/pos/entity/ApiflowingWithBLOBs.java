package com.pos.entity;

public class ApiflowingWithBLOBs extends Apiflowing {
    private String fstdata;

    private String fserror;

    private String fsrdata;

    public String getFstdata() {
        return fstdata;
    }

    public void setFstdata(String fstdata) {
        this.fstdata = fstdata == null ? null : fstdata.trim();
    }

    public String getFserror() {
        return fserror;
    }

    public void setFserror(String fserror) {
        this.fserror = fserror == null ? null : fserror.trim();
    }

    public String getFsrdata() {
        return fsrdata;
    }

    public void setFsrdata(String fsrdata) {
        this.fsrdata = fsrdata == null ? null : fsrdata.trim();
    }
}