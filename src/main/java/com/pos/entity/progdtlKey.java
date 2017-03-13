package com.pos.entity;

public class ProgdtlKey {
    private String fsprogdtlid;

    private String fsprogid;

    public String getFsprogdtlid() {
        return fsprogdtlid;
    }

    public void setFsprogdtlid(String fsprogdtlid) {
        this.fsprogdtlid = fsprogdtlid == null ? null : fsprogdtlid.trim();
    }

    public String getFsprogid() {
        return fsprogid;
    }

    public void setFsprogid(String fsprogid) {
        this.fsprogid = fsprogid == null ? null : fsprogid.trim();
    }
}