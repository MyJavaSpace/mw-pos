package com.pos.entity;

public class TbapplicationKey {
    private String fsProgId;

    private String fsProjId;

    public String getFsProgId() {
        return fsProgId;
    }

    public void setFsProgId(String fsProgId) {
        this.fsProgId = fsProgId == null ? null : fsProgId.trim();
    }

    public String getFsProjId() {
        return fsProjId;
    }

    public void setFsProjId(String fsProjId) {
        this.fsProjId = fsProjId == null ? null : fsProjId.trim();
    }
}