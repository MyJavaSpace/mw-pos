package com.pos.entity;

public class Msg {
    private Integer fimsgno;

    private Integer fimsgkind;

    private String fsmsg;

    private String fssender;

    private String fsmtableid;

    private String fsmtablename;

    private String fssellno;

    private String fsreceiver;

    private Integer fistatus;

    private String fsreadtime;

    private String fsreadusername;

    private String fsshopguid;

    private String fscreatetime;

    public Integer getFimsgno() {
        return fimsgno;
    }

    public void setFimsgno(Integer fimsgno) {
        this.fimsgno = fimsgno;
    }

    public Integer getFimsgkind() {
        return fimsgkind;
    }

    public void setFimsgkind(Integer fimsgkind) {
        this.fimsgkind = fimsgkind;
    }

    public String getFsmsg() {
        return fsmsg;
    }

    public void setFsmsg(String fsmsg) {
        this.fsmsg = fsmsg == null ? null : fsmsg.trim();
    }

    public String getFssender() {
        return fssender;
    }

    public void setFssender(String fssender) {
        this.fssender = fssender == null ? null : fssender.trim();
    }

    public String getFsmtableid() {
        return fsmtableid;
    }

    public void setFsmtableid(String fsmtableid) {
        this.fsmtableid = fsmtableid == null ? null : fsmtableid.trim();
    }

    public String getFsmtablename() {
        return fsmtablename;
    }

    public void setFsmtablename(String fsmtablename) {
        this.fsmtablename = fsmtablename == null ? null : fsmtablename.trim();
    }

    public String getFssellno() {
        return fssellno;
    }

    public void setFssellno(String fssellno) {
        this.fssellno = fssellno == null ? null : fssellno.trim();
    }

    public String getFsreceiver() {
        return fsreceiver;
    }

    public void setFsreceiver(String fsreceiver) {
        this.fsreceiver = fsreceiver == null ? null : fsreceiver.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsreadtime() {
        return fsreadtime;
    }

    public void setFsreadtime(String fsreadtime) {
        this.fsreadtime = fsreadtime == null ? null : fsreadtime.trim();
    }

    public String getFsreadusername() {
        return fsreadusername;
    }

    public void setFsreadusername(String fsreadusername) {
        this.fsreadusername = fsreadusername == null ? null : fsreadusername.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }
}