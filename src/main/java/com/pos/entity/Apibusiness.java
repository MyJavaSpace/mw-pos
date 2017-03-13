package com.pos.entity;

public class Apibusiness {
    private String fsbusinessno;

    private String fsname;

    private String fsdescribe;

    private String fstoken;

    private Integer fitest;

    private String fshost;

    private String fsseed;

    private Integer fitimestamp;

    public String getFsbusinessno() {
        return fsbusinessno;
    }

    public void setFsbusinessno(String fsbusinessno) {
        this.fsbusinessno = fsbusinessno == null ? null : fsbusinessno.trim();
    }

    public String getFsname() {
        return fsname;
    }

    public void setFsname(String fsname) {
        this.fsname = fsname == null ? null : fsname.trim();
    }

    public String getFsdescribe() {
        return fsdescribe;
    }

    public void setFsdescribe(String fsdescribe) {
        this.fsdescribe = fsdescribe == null ? null : fsdescribe.trim();
    }

    public String getFstoken() {
        return fstoken;
    }

    public void setFstoken(String fstoken) {
        this.fstoken = fstoken == null ? null : fstoken.trim();
    }

    public Integer getFitest() {
        return fitest;
    }

    public void setFitest(Integer fitest) {
        this.fitest = fitest;
    }

    public String getFshost() {
        return fshost;
    }

    public void setFshost(String fshost) {
        this.fshost = fshost == null ? null : fshost.trim();
    }

    public String getFsseed() {
        return fsseed;
    }

    public void setFsseed(String fsseed) {
        this.fsseed = fsseed == null ? null : fsseed.trim();
    }

    public Integer getFitimestamp() {
        return fitimestamp;
    }

    public void setFitimestamp(Integer fitimestamp) {
        this.fitimestamp = fitimestamp;
    }
}