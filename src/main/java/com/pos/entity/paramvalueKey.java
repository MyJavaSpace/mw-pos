package com.pos.entity;

public class ParamvalueKey {
    private String fsparamid;

    private String fsshopguid;

    public String getFsparamid() {
        return fsparamid;
    }

    public void setFsparamid(String fsparamid) {
        this.fsparamid = fsparamid == null ? null : fsparamid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}