package com.pos.entity;

public class PublishKey {
    private Long fiid;

    private Long fisoftid;

    private String fsversion;

    public Long getFiid() {
        return fiid;
    }

    public void setFiid(Long fiid) {
        this.fiid = fiid;
    }

    public Long getFisoftid() {
        return fisoftid;
    }

    public void setFisoftid(Long fisoftid) {
        this.fisoftid = fisoftid;
    }

    public String getFsversion() {
        return fsversion;
    }

    public void setFsversion(String fsversion) {
        this.fsversion = fsversion == null ? null : fsversion.trim();
    }
}