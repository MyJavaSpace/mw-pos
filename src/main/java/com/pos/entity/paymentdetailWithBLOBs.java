package com.pos.entity;

public class paymentdetailWithBLOBs extends paymentdetail {
    private String fsshopname;

    private String fsmanageshopid;

    private String fssourcename;

    private String fsdesc;

    private String fsbanktype;

    public String getFsshopname() {
        return fsshopname;
    }

    public void setFsshopname(String fsshopname) {
        this.fsshopname = fsshopname == null ? null : fsshopname.trim();
    }

    public String getFsmanageshopid() {
        return fsmanageshopid;
    }

    public void setFsmanageshopid(String fsmanageshopid) {
        this.fsmanageshopid = fsmanageshopid == null ? null : fsmanageshopid.trim();
    }

    public String getFssourcename() {
        return fssourcename;
    }

    public void setFssourcename(String fssourcename) {
        this.fssourcename = fssourcename == null ? null : fssourcename.trim();
    }

    public String getFsdesc() {
        return fsdesc;
    }

    public void setFsdesc(String fsdesc) {
        this.fsdesc = fsdesc == null ? null : fsdesc.trim();
    }

    public String getFsbanktype() {
        return fsbanktype;
    }

    public void setFsbanktype(String fsbanktype) {
        this.fsbanktype = fsbanktype == null ? null : fsbanktype.trim();
    }
}