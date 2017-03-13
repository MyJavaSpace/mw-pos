package com.pos.entity;

public class paymenttypeKey {
    private String fspaymenttypeid;

    private String fsshopguid;

    public String getFspaymenttypeid() {
        return fspaymenttypeid;
    }

    public void setFspaymenttypeid(String fspaymenttypeid) {
        this.fspaymenttypeid = fspaymenttypeid == null ? null : fspaymenttypeid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}