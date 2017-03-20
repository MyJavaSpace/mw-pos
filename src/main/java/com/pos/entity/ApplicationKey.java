package com.pos.entity;

import com.pos.base.BaseEntity;

public class ApplicationKey extends BaseEntity {
    private String fsprogid;

    private String fsprojid;

    public String getFsprogid() {
        return fsprogid;
    }

    public void setFsprogid(String fsprogid) {
        this.fsprogid = fsprogid == null ? null : fsprogid.trim();
    }

    public String getFsprojid() {
        return fsprojid;
    }

    public void setFsprojid(String fsprojid) {
        this.fsprojid = fsprojid == null ? null : fsprojid.trim();
    }
}