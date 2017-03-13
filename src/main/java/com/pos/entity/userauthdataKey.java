package com.pos.entity;

public class userauthdataKey {
    private String fsdatakind;

    private String fsshopguid;

    private String fsuserid;

    private String fsvalue;

    public String getFsdatakind() {
        return fsdatakind;
    }

    public void setFsdatakind(String fsdatakind) {
        this.fsdatakind = fsdatakind == null ? null : fsdatakind.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFsuserid() {
        return fsuserid;
    }

    public void setFsuserid(String fsuserid) {
        this.fsuserid = fsuserid == null ? null : fsuserid.trim();
    }

    public String getFsvalue() {
        return fsvalue;
    }

    public void setFsvalue(String fsvalue) {
        this.fsvalue = fsvalue == null ? null : fsvalue.trim();
    }
}