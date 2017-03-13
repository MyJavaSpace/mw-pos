package com.pos.entity;

public class Setings {
    private String fskey;

    private String fsvalue;

    private String fsreamark;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fsshopguid;

    public String getFskey() {
        return fskey;
    }

    public void setFskey(String fskey) {
        this.fskey = fskey == null ? null : fskey.trim();
    }

    public String getFsvalue() {
        return fsvalue;
    }

    public void setFsvalue(String fsvalue) {
        this.fsvalue = fsvalue == null ? null : fsvalue.trim();
    }

    public String getFsreamark() {
        return fsreamark;
    }

    public void setFsreamark(String fsreamark) {
        this.fsreamark = fsreamark == null ? null : fsreamark.trim();
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public String getFsupdateuserid() {
        return fsupdateuserid;
    }

    public void setFsupdateuserid(String fsupdateuserid) {
        this.fsupdateuserid = fsupdateuserid == null ? null : fsupdateuserid.trim();
    }

    public String getFsupdateusername() {
        return fsupdateusername;
    }

    public void setFsupdateusername(String fsupdateusername) {
        this.fsupdateusername = fsupdateusername == null ? null : fsupdateusername.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}