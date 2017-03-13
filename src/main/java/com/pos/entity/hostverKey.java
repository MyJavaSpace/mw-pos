package com.pos.entity;

public class hostverKey {
    private String fsfilename;

    private String fshost;

    public String getFsfilename() {
        return fsfilename;
    }

    public void setFsfilename(String fsfilename) {
        this.fsfilename = fsfilename == null ? null : fsfilename.trim();
    }

    public String getFshost() {
        return fshost;
    }

    public void setFshost(String fshost) {
        this.fshost = fshost == null ? null : fshost.trim();
    }
}