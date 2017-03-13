package com.pos.entity;

public class Host extends HostKey {
    private String fshostdesc;

    private String fsencryption;

    private String fsprintername;

    private Integer fihostcls;

    private Integer filanguage;

    private String fsnote;

    private Integer fistatus;

    private Integer fidatakind;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFshostdesc() {
        return fshostdesc;
    }

    public void setFshostdesc(String fshostdesc) {
        this.fshostdesc = fshostdesc == null ? null : fshostdesc.trim();
    }

    public String getFsencryption() {
        return fsencryption;
    }

    public void setFsencryption(String fsencryption) {
        this.fsencryption = fsencryption == null ? null : fsencryption.trim();
    }

    public String getFsprintername() {
        return fsprintername;
    }

    public void setFsprintername(String fsprintername) {
        this.fsprintername = fsprintername == null ? null : fsprintername.trim();
    }

    public Integer getFihostcls() {
        return fihostcls;
    }

    public void setFihostcls(Integer fihostcls) {
        this.fihostcls = fihostcls;
    }

    public Integer getFilanguage() {
        return filanguage;
    }

    public void setFilanguage(Integer filanguage) {
        this.filanguage = filanguage;
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
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
}