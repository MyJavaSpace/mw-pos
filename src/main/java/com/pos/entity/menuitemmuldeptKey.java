package com.pos.entity;

public class menuitemmuldeptKey {
    private Integer fimuldeptcd;

    private String fsshopguid;

    public Integer getFimuldeptcd() {
        return fimuldeptcd;
    }

    public void setFimuldeptcd(Integer fimuldeptcd) {
        this.fimuldeptcd = fimuldeptcd;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}