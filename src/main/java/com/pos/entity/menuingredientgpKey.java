package com.pos.entity;

public class menuingredientgpKey {
    private Integer fiitemgroupid;

    private String fsshopguid;

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