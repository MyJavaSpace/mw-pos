package com.pos.entity;

public class menuitemsetsidedtlKey {
    private Integer fiitemcd;

    private Integer fiitemcdM;

    private Integer fiorderuintcd;

    private Integer fisetfoodcd;

    private String fsshopguid;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFiitemcdM() {
        return fiitemcdM;
    }

    public void setFiitemcdM(Integer fiitemcdM) {
        this.fiitemcdM = fiitemcdM;
    }

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
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