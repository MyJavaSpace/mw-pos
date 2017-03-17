package com.pos.entity;

import com.pos.base.BaseEntity;

public class AddrKey extends BaseEntity {
    private String fscityid;

    private String fsdistrictid;

    private String fsprovinceid;

    public String getFscityid() {
        return fscityid;
    }

    public void setFscityid(String fscityid) {
        this.fscityid = fscityid == null ? null : fscityid.trim();
    }

    public String getFsdistrictid() {
        return fsdistrictid;
    }

    public void setFsdistrictid(String fsdistrictid) {
        this.fsdistrictid = fsdistrictid == null ? null : fsdistrictid.trim();
    }

    public String getFsprovinceid() {
        return fsprovinceid;
    }

    public void setFsprovinceid(String fsprovinceid) {
        this.fsprovinceid = fsprovinceid == null ? null : fsprovinceid.trim();
    }
}