package com.pos.entity;

public class sellreceiveKey {
    private Integer fipaymenttype;

    private Integer fiseq;

    private String fscheckbillno;

    private String fssellno;

    private String fsshopguid;

    public Integer getFipaymenttype() {
        return fipaymenttype;
    }

    public void setFipaymenttype(Integer fipaymenttype) {
        this.fipaymenttype = fipaymenttype;
    }

    public Integer getFiseq() {
        return fiseq;
    }

    public void setFiseq(Integer fiseq) {
        this.fiseq = fiseq;
    }

    public String getFscheckbillno() {
        return fscheckbillno;
    }

    public void setFscheckbillno(String fscheckbillno) {
        this.fscheckbillno = fscheckbillno == null ? null : fscheckbillno.trim();
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