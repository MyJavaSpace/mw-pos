package com.pos.entity;

public class Filever {
    private String fsfilename;

    private String fsver;

    private String fsdir;

    private String fsnote;

    public String getFsfilename() {
        return fsfilename;
    }

    public void setFsfilename(String fsfilename) {
        this.fsfilename = fsfilename == null ? null : fsfilename.trim();
    }

    public String getFsver() {
        return fsver;
    }

    public void setFsver(String fsver) {
        this.fsver = fsver == null ? null : fsver.trim();
    }

    public String getFsdir() {
        return fsdir;
    }

    public void setFsdir(String fsdir) {
        this.fsdir = fsdir == null ? null : fsdir.trim();
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }
}