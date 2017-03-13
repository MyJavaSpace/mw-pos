package com.pos.entity;

import java.math.BigDecimal;

public class creditaccount extends creditaccountKey {
    private String fscreditaccountname;

    private BigDecimal fdcreditamt;

    private BigDecimal fddebtamt;

    private String fscontact;

    private String fscellphonect;

    private String fstelct;

    private Integer fiimgwidth;

    private Integer fiimgheight;

    private String fsimageurl;

    private String fsimagepath;

    private String fsnote;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFscreditaccountname() {
        return fscreditaccountname;
    }

    public void setFscreditaccountname(String fscreditaccountname) {
        this.fscreditaccountname = fscreditaccountname == null ? null : fscreditaccountname.trim();
    }

    public BigDecimal getFdcreditamt() {
        return fdcreditamt;
    }

    public void setFdcreditamt(BigDecimal fdcreditamt) {
        this.fdcreditamt = fdcreditamt;
    }

    public BigDecimal getFddebtamt() {
        return fddebtamt;
    }

    public void setFddebtamt(BigDecimal fddebtamt) {
        this.fddebtamt = fddebtamt;
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

    public String getFstelct() {
        return fstelct;
    }

    public void setFstelct(String fstelct) {
        this.fstelct = fstelct == null ? null : fstelct.trim();
    }

    public Integer getFiimgwidth() {
        return fiimgwidth;
    }

    public void setFiimgwidth(Integer fiimgwidth) {
        this.fiimgwidth = fiimgwidth;
    }

    public Integer getFiimgheight() {
        return fiimgheight;
    }

    public void setFiimgheight(Integer fiimgheight) {
        this.fiimgheight = fiimgheight;
    }

    public String getFsimageurl() {
        return fsimageurl;
    }

    public void setFsimageurl(String fsimageurl) {
        this.fsimageurl = fsimageurl == null ? null : fsimageurl.trim();
    }

    public String getFsimagepath() {
        return fsimagepath;
    }

    public void setFsimagepath(String fsimagepath) {
        this.fsimagepath = fsimagepath == null ? null : fsimagepath.trim();
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