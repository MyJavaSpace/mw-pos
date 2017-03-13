package com.pos.entity;

public class PrintprojectgpKey {
    private Integer figroupid;

    private String fsshopguid;

    public Integer getFigroupid() {
        return figroupid;
    }

    public void setFigroupid(Integer figroupid) {
        this.figroupid = figroupid;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}