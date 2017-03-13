package com.pos.entity;

import java.math.BigDecimal;

public class Deliverer extends DelivererKey {
    private String fsdeliverername;

    private Integer fideliverertype;

    private String fsdeliverer;

    private String fscellphone;

    private BigDecimal fdchange;

    private String fsnote;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsdeliverername() {
        return fsdeliverername;
    }

    public void setFsdeliverername(String fsdeliverername) {
        this.fsdeliverername = fsdeliverername == null ? null : fsdeliverername.trim();
    }

    public Integer getFideliverertype() {
        return fideliverertype;
    }

    public void setFideliverertype(Integer fideliverertype) {
        this.fideliverertype = fideliverertype;
    }

    public String getFsdeliverer() {
        return fsdeliverer;
    }

    public void setFsdeliverer(String fsdeliverer) {
        this.fsdeliverer = fsdeliverer == null ? null : fsdeliverer.trim();
    }

    public String getFscellphone() {
        return fscellphone;
    }

    public void setFscellphone(String fscellphone) {
        this.fscellphone = fscellphone == null ? null : fscellphone.trim();
    }

    public BigDecimal getFdchange() {
        return fdchange;
    }

    public void setFdchange(BigDecimal fdchange) {
        this.fdchange = fdchange;
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