package com.pos.entity;

public class SellorderitemWithBLOBs extends Sellorderitem {
    private String fsdeptid;

    private String fsnote;

    public String getFsdeptid() {
        return fsdeptid;
    }

    public void setFsdeptid(String fsdeptid) {
        this.fsdeptid = fsdeptid == null ? null : fsdeptid.trim();
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }
}