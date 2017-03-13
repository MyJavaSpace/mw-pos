package com.pos.entity;

public class Tbhostver extends TbhostverKey {
    private String fsVer;

    private String fsDateTime;

    public String getFsVer() {
        return fsVer;
    }

    public void setFsVer(String fsVer) {
        this.fsVer = fsVer == null ? null : fsVer.trim();
    }

    public String getFsDateTime() {
        return fsDateTime;
    }

    public void setFsDateTime(String fsDateTime) {
        this.fsDateTime = fsDateTime == null ? null : fsDateTime.trim();
    }
}