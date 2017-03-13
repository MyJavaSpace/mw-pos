package com.pos.entity;

public class TbhostverKey {
    private String fsFileName;

    private String fsHost;

    public String getFsFileName() {
        return fsFileName;
    }

    public void setFsFileName(String fsFileName) {
        this.fsFileName = fsFileName == null ? null : fsFileName.trim();
    }

    public String getFsHost() {
        return fsHost;
    }

    public void setFsHost(String fsHost) {
        this.fsHost = fsHost == null ? null : fsHost.trim();
    }
}