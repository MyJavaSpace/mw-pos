package com.pos.entity;

public class ApibusinesslistKey {
    private String fsapibusinessno;

    private String fsapiurl;

    public String getFsapibusinessno() {
        return fsapibusinessno;
    }

    public void setFsapibusinessno(String fsapibusinessno) {
        this.fsapibusinessno = fsapibusinessno == null ? null : fsapibusinessno.trim();
    }

    public String getFsapiurl() {
        return fsapiurl;
    }

    public void setFsapiurl(String fsapiurl) {
        this.fsapiurl = fsapiurl == null ? null : fsapiurl.trim();
    }
}