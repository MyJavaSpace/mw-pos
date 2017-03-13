package com.pos.entity;

import java.math.BigDecimal;

public class sellcheck extends sellcheckKey {
    private String fschecktime;

    private String fsshiftid;

    private BigDecimal fdreceamt;

    private BigDecimal fdrealamt;

    private BigDecimal fdinvoiceamt;

    private Integer fistatus;

    private String fsnote;

    private Integer fichecktimes;

    private Integer fiprinttimes;

    private String fsverifyuserid;

    private String fsverifytime;

    private String fshostid;

    private String fscreatetime;

    private String fscreateuserid;

    private String fscreateusername;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fsverifyusername;

    private String fsdatasrckind;

    private String fssrcverno;

    private String fsshiftname;

    private Integer lver;

    public String getFschecktime() {
        return fschecktime;
    }

    public void setFschecktime(String fschecktime) {
        this.fschecktime = fschecktime == null ? null : fschecktime.trim();
    }

    public String getFsshiftid() {
        return fsshiftid;
    }

    public void setFsshiftid(String fsshiftid) {
        this.fsshiftid = fsshiftid == null ? null : fsshiftid.trim();
    }

    public BigDecimal getFdreceamt() {
        return fdreceamt;
    }

    public void setFdreceamt(BigDecimal fdreceamt) {
        this.fdreceamt = fdreceamt;
    }

    public BigDecimal getFdrealamt() {
        return fdrealamt;
    }

    public void setFdrealamt(BigDecimal fdrealamt) {
        this.fdrealamt = fdrealamt;
    }

    public BigDecimal getFdinvoiceamt() {
        return fdinvoiceamt;
    }

    public void setFdinvoiceamt(BigDecimal fdinvoiceamt) {
        this.fdinvoiceamt = fdinvoiceamt;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public Integer getFichecktimes() {
        return fichecktimes;
    }

    public void setFichecktimes(Integer fichecktimes) {
        this.fichecktimes = fichecktimes;
    }

    public Integer getFiprinttimes() {
        return fiprinttimes;
    }

    public void setFiprinttimes(Integer fiprinttimes) {
        this.fiprinttimes = fiprinttimes;
    }

    public String getFsverifyuserid() {
        return fsverifyuserid;
    }

    public void setFsverifyuserid(String fsverifyuserid) {
        this.fsverifyuserid = fsverifyuserid == null ? null : fsverifyuserid.trim();
    }

    public String getFsverifytime() {
        return fsverifytime;
    }

    public void setFsverifytime(String fsverifytime) {
        this.fsverifytime = fsverifytime == null ? null : fsverifytime.trim();
    }

    public String getFshostid() {
        return fshostid;
    }

    public void setFshostid(String fshostid) {
        this.fshostid = fshostid == null ? null : fshostid.trim();
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

    public String getFsverifyusername() {
        return fsverifyusername;
    }

    public void setFsverifyusername(String fsverifyusername) {
        this.fsverifyusername = fsverifyusername == null ? null : fsverifyusername.trim();
    }

    public String getFsdatasrckind() {
        return fsdatasrckind;
    }

    public void setFsdatasrckind(String fsdatasrckind) {
        this.fsdatasrckind = fsdatasrckind == null ? null : fsdatasrckind.trim();
    }

    public String getFssrcverno() {
        return fssrcverno;
    }

    public void setFssrcverno(String fssrcverno) {
        this.fssrcverno = fssrcverno == null ? null : fssrcverno.trim();
    }

    public String getFsshiftname() {
        return fsshiftname;
    }

    public void setFsshiftname(String fsshiftname) {
        this.fsshiftname = fsshiftname == null ? null : fsshiftname.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}