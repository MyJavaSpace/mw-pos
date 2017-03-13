package com.pos.entity;

public class CusttypeKey {
    private String fscompanyguid;

    private String fscusttypeid;

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
    }

    public String getFscusttypeid() {
        return fscusttypeid;
    }

    public void setFscusttypeid(String fscusttypeid) {
        this.fscusttypeid = fscusttypeid == null ? null : fscusttypeid.trim();
    }
}