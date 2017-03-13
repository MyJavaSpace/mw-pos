package com.pos.entity;

public class sellorderKey {
    private Integer fiorderseq;

    private String fssellno;

    private String fsshopguid;

    public Integer getFiorderseq() {
        return fiorderseq;
    }

    public void setFiorderseq(Integer fiorderseq) {
        this.fiorderseq = fiorderseq;
    }

    public String getFssellno() {
        return fssellno;
    }

    public void setFssellno(String fssellno) {
        this.fssellno = fssellno == null ? null : fssellno.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}