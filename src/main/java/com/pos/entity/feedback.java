package com.pos.entity;

public class Feedback {
    private Integer fiid;

    private String fstheme;

    private Integer fitype;

    private String fscontact;

    private String fscellphonect;

    private String fsemail;

    private String fscontent;

    private String fscreatetime;

    private String fscreateuserid;

    private String fscreateusername;

    private String fsshopguid;

    private String fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public Integer getFiid() {
        return fiid;
    }

    public void setFiid(Integer fiid) {
        this.fiid = fiid;
    }

    public String getFstheme() {
        return fstheme;
    }

    public void setFstheme(String fstheme) {
        this.fstheme = fstheme == null ? null : fstheme.trim();
    }

    public Integer getFitype() {
        return fitype;
    }

    public void setFitype(Integer fitype) {
        this.fitype = fitype;
    }

    public String getFscontact() {
        return fscontact;
    }

    public void setFscontact(String fscontact) {
        this.fscontact = fscontact == null ? null : fscontact.trim();
    }

    public String getFscellphonect() {
        return fscellphonect;
    }

    public void setFscellphonect(String fscellphonect) {
        this.fscellphonect = fscellphonect == null ? null : fscellphonect.trim();
    }

    public String getFsemail() {
        return fsemail;
    }

    public void setFsemail(String fsemail) {
        this.fsemail = fsemail == null ? null : fsemail.trim();
    }

    public String getFscontent() {
        return fscontent;
    }

    public void setFscontent(String fscontent) {
        this.fscontent = fscontent == null ? null : fscontent.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }

    public String getFscreateuserid() {
        return fscreateuserid;
    }

    public void setFscreateuserid(String fscreateuserid) {
        this.fscreateuserid = fscreateuserid == null ? null : fscreateuserid.trim();
    }

    public String getFscreateusername() {
        return fscreateusername;
    }

    public void setFscreateusername(String fscreateusername) {
        this.fscreateusername = fscreateusername == null ? null : fscreateusername.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFistatus() {
        return fistatus;
    }

    public void setFistatus(String fistatus) {
        this.fistatus = fistatus == null ? null : fistatus.trim();
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