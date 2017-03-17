package com.pos.entity;

public class Addr extends AddrKey {
    private String fsprovincename;

    private String fscityname;

    private String fsdistrictname;

    private String fspostal;

    private static final long serialVersionUID = 1L;

    public String getFsprovincename() {
        return fsprovincename;
    }

    public void setFsprovincename(String fsprovincename) {
        this.fsprovincename = fsprovincename == null ? null : fsprovincename.trim();
    }

    public String getFscityname() {
        return fscityname;
    }

    public void setFscityname(String fscityname) {
        this.fscityname = fscityname == null ? null : fscityname.trim();
    }

    public String getFsdistrictname() {
        return fsdistrictname;
    }

    public void setFsdistrictname(String fsdistrictname) {
        this.fsdistrictname = fsdistrictname == null ? null : fsdistrictname.trim();
    }

    public String getFspostal() {
        return fspostal;
    }

    public void setFspostal(String fspostal) {
        this.fspostal = fspostal == null ? null : fspostal.trim();
    }
}