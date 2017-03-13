package com.pos.entity;

public class Printer extends PrinterKey {
    private String fsprintername;

    private String fsip;

    private Integer fiismakeprn;

    private Integer fitimeout;

    private Integer firetry;

    private Integer fitaskcount;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fscommandtype;

    private Integer fiprintercls;

    private String fsstr1;

    private Integer fiint1;

    private Integer fipapersize;

    private Integer fiprinterstatus;

    private String fsbakprintername;

    public String getFsprintername() {
        return fsprintername;
    }

    public void setFsprintername(String fsprintername) {
        this.fsprintername = fsprintername == null ? null : fsprintername.trim();
    }

    public String getFsip() {
        return fsip;
    }

    public void setFsip(String fsip) {
        this.fsip = fsip == null ? null : fsip.trim();
    }

    public Integer getFiismakeprn() {
        return fiismakeprn;
    }

    public void setFiismakeprn(Integer fiismakeprn) {
        this.fiismakeprn = fiismakeprn;
    }

    public Integer getFitimeout() {
        return fitimeout;
    }

    public void setFitimeout(Integer fitimeout) {
        this.fitimeout = fitimeout;
    }

    public Integer getFiretry() {
        return firetry;
    }

    public void setFiretry(Integer firetry) {
        this.firetry = firetry;
    }

    public Integer getFitaskcount() {
        return fitaskcount;
    }

    public void setFitaskcount(Integer fitaskcount) {
        this.fitaskcount = fitaskcount;
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

    public String getFscommandtype() {
        return fscommandtype;
    }

    public void setFscommandtype(String fscommandtype) {
        this.fscommandtype = fscommandtype == null ? null : fscommandtype.trim();
    }

    public Integer getFiprintercls() {
        return fiprintercls;
    }

    public void setFiprintercls(Integer fiprintercls) {
        this.fiprintercls = fiprintercls;
    }

    public String getFsstr1() {
        return fsstr1;
    }

    public void setFsstr1(String fsstr1) {
        this.fsstr1 = fsstr1 == null ? null : fsstr1.trim();
    }

    public Integer getFiint1() {
        return fiint1;
    }

    public void setFiint1(Integer fiint1) {
        this.fiint1 = fiint1;
    }

    public Integer getFipapersize() {
        return fipapersize;
    }

    public void setFipapersize(Integer fipapersize) {
        this.fipapersize = fipapersize;
    }

    public Integer getFiprinterstatus() {
        return fiprinterstatus;
    }

    public void setFiprinterstatus(Integer fiprinterstatus) {
        this.fiprinterstatus = fiprinterstatus;
    }

    public String getFsbakprintername() {
        return fsbakprintername;
    }

    public void setFsbakprintername(String fsbakprintername) {
        this.fsbakprintername = fsbakprintername == null ? null : fsbakprintername.trim();
    }
}