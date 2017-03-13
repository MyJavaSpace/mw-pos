package com.pos.entity;

public class revenuetypeKey {
    private String fsrevenuetypeid;

    private String fsshopguid;

    public String getFsrevenuetypeid() {
        return fsrevenuetypeid;
    }

    public void setFsrevenuetypeid(String fsrevenuetypeid) {
        this.fsrevenuetypeid = fsrevenuetypeid == null ? null : fsrevenuetypeid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}