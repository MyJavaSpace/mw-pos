package com.pos.entity;

public class tableinfoKey {
    private String fskind;

    private String fstableid;

    private String fstablename;

    public String getFskind() {
        return fskind;
    }

    public void setFskind(String fskind) {
        this.fskind = fskind == null ? null : fskind.trim();
    }

    public String getFstableid() {
        return fstableid;
    }

    public void setFstableid(String fstableid) {
        this.fstableid = fstableid == null ? null : fstableid.trim();
    }

    public String getFstablename() {
        return fstablename;
    }

    public void setFstablename(String fstablename) {
        this.fstablename = fstablename == null ? null : fstablename.trim();
    }
}