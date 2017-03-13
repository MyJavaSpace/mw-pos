package com.pos.entity;

public class MenuingredgprelKey {
    private Integer fiitemcd;

    private Integer fiitemgroupid;

    private String fsshopguid;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFiitemgroupid() {
        return fiitemgroupid;
    }

    public void setFiitemgroupid(Integer fiitemgroupid) {
        this.fiitemgroupid = fiitemgroupid;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}