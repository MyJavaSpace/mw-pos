package com.pos.entity;

public class TbpublishKey {
    private Long fiId;

    private Long fiSoftId;

    private String fsVersion;

    public Long getFiId() {
        return fiId;
    }

    public void setFiId(Long fiId) {
        this.fiId = fiId;
    }

    public Long getFiSoftId() {
        return fiSoftId;
    }

    public void setFiSoftId(Long fiSoftId) {
        this.fiSoftId = fiSoftId;
    }

    public String getFsVersion() {
        return fsVersion;
    }

    public void setFsVersion(String fsVersion) {
        this.fsVersion = fsVersion == null ? null : fsVersion.trim();
    }
}