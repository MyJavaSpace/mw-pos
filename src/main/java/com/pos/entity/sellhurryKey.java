package com.pos.entity;

public class sellhurryKey {
    private Integer fihurryseq;

    private String fssellno;

    private String fsshopguid;

    public Integer getFihurryseq() {
        return fihurryseq;
    }

    public void setFihurryseq(Integer fihurryseq) {
        this.fihurryseq = fihurryseq;
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