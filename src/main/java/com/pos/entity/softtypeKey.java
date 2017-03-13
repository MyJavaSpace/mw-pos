package com.pos.entity;

public class SofttypeKey {
    private Long fiid;

    private String fsname;

    public Long getFiid() {
        return fiid;
    }

    public void setFiid(Long fiid) {
        this.fiid = fiid;
    }

    public String getFsname() {
        return fsname;
    }

    public void setFsname(String fsname) {
        this.fsname = fsname == null ? null : fsname.trim();
    }
}