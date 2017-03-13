package com.pos.entity;

public class SellhurryitemKey {
    private Integer fihurryseq;

    private String fssellno;

    private String fsshopguid;

    private String fssourceseq;

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

    public String getFssourceseq() {
        return fssourceseq;
    }

    public void setFssourceseq(String fssourceseq) {
        this.fssourceseq = fssourceseq == null ? null : fssourceseq.trim();
    }
}