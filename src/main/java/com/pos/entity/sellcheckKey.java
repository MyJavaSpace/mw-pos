package com.pos.entity;

public class sellcheckKey {
    private String fscheckbillno;

    private String fssellno;

    private String fsshopguid;

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