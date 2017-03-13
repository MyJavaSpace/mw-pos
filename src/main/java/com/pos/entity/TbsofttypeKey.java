package com.pos.entity;

public class TbsofttypeKey {
    private Long fiId;

    private String fsName;

    public Long getFiId() {
        return fiId;
    }

    public void setFiId(Long fiId) {
        this.fiId = fiId;
    }

    public String getFsName() {
        return fsName;
    }

    public void setFsName(String fsName) {
        this.fsName = fsName == null ? null : fsName.trim();
    }
}