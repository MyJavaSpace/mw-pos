package com.pos.entity;

public class Apiinfo {
    private String fsapiurl;

    private String fsapiid;

    private String fsdescribe;

    public String getFsapiurl() {
        return fsapiurl;
    }

    public void setFsapiurl(String fsapiurl) {
        this.fsapiurl = fsapiurl == null ? null : fsapiurl.trim();
    }

    public String getFsapiid() {
        return fsapiid;
    }

    public void setFsapiid(String fsapiid) {
        this.fsapiid = fsapiid == null ? null : fsapiid.trim();
    }

    public String getFsdescribe() {
        return fsdescribe;
    }

    public void setFsdescribe(String fsdescribe) {
        this.fsdescribe = fsdescribe == null ? null : fsdescribe.trim();
    }
}