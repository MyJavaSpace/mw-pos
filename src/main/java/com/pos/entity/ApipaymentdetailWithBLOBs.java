package com.pos.entity;

public class ApipaymentdetailWithBLOBs extends Apipaymentdetail {
    private String fsshopname;

    private String fscompanyguid;

    private String fssourcename;

    private String fsdesc;

    private String fsbanktype;

    public String getFsshopname() {
        return fsshopname;
    }

    public void setFsshopname(String fsshopname) {
        this.fsshopname = fsshopname == null ? null : fsshopname.trim();
    }

    public String getFscompanyguid() {
        return fscompanyguid;
    }

    public void setFscompanyguid(String fscompanyguid) {
        this.fscompanyguid = fscompanyguid == null ? null : fscompanyguid.trim();
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