package com.pos.entity;

public class menuitemsetsideKey {
    private Integer fiitemcdM;

    private Integer fisetfoodcd;

    private String fsshopguid;

    public Integer getFiitemcdM() {
        return fiitemcdM;
    }

    public void setFiitemcdM(Integer fiitemcdM) {
        this.fiitemcdM = fiitemcdM;
    }

    public Integer getFisetfoodcd() {
        return fisetfoodcd;
    }

    public void setFisetfoodcd(Integer fisetfoodcd) {
        this.fisetfoodcd = fisetfoodcd;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}