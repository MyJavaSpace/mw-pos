package com.pos.entity;

public class UsermenuitemroleKey {
    private Integer fiitemcd;

    private Integer fiorderuintcd;

    private Integer fitype;

    private String fsshopguid;

    private String fsuserid;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
    }

    public Integer getFitype() {
        return fitype;
    }

    public void setFitype(Integer fitype) {
        this.fitype = fitype;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFsuserid() {
        return fsuserid;
    }

    public void setFsuserid(String fsuserid) {
        this.fsuserid = fsuserid == null ? null : fsuserid.trim();
    }
}