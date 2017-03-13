package com.pos.entity;

public class Hostver extends HostverKey {
    private String fsver;

    private String fsdatetime;

    public String getFsver() {
        return fsver;
    }

    public void setFsver(String fsver) {
        this.fsver = fsver == null ? null : fsver.trim();
    }

    public String getFsdatetime() {
        return fsdatetime;
    }

    public void setFsdatetime(String fsdatetime) {
        this.fsdatetime = fsdatetime == null ? null : fsdatetime.trim();
    }
}