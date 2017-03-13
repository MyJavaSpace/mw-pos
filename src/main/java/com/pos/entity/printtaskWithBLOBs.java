package com.pos.entity;

public class PrinttaskWithBLOBs extends Printtask {
    private String fsprndata;

    private String fsprndata2;

    public String getFsprndata() {
        return fsprndata;
    }

    public void setFsprndata(String fsprndata) {
        this.fsprndata = fsprndata == null ? null : fsprndata.trim();
    }

    public String getFsprndata2() {
        return fsprndata2;
    }

    public void setFsprndata2(String fsprndata2) {
        this.fsprndata2 = fsprndata2 == null ? null : fsprndata2.trim();
    }
}