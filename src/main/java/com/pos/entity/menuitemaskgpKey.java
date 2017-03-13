package com.pos.entity;

public class MenuitemaskgpKey {
    private Integer fiitemcd;

    private String fsaskgpid;

    private String fsshopguid;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public String getFsaskgpid() {
        return fsaskgpid;
    }

    public void setFsaskgpid(String fsaskgpid) {
        this.fsaskgpid = fsaskgpid == null ? null : fsaskgpid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}