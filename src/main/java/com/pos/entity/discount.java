package com.pos.entity;

import java.math.BigDecimal;

public class Discount extends DiscountKey {
    private String fsdiscountname;

    private Integer fidiscountrate;

    private Integer fiisvipuse;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fidatakind;

    private Integer fivipid;

    private Integer ficouponid;

    private BigDecimal fdddv;

    private Integer fidiscreason;

    private Integer fiiseffectivedate;

    private String fsstardate;

    private String fsenddate;

    public String getFsdiscountname() {
        return fsdiscountname;
    }

    public void setFsdiscountname(String fsdiscountname) {
        this.fsdiscountname = fsdiscountname == null ? null : fsdiscountname.trim();
    }

    public Integer getFidiscountrate() {
        return fidiscountrate;
    }

    public void setFidiscountrate(Integer fidiscountrate) {
        this.fidiscountrate = fidiscountrate;
    }

    public Integer getFiisvipuse() {
        return fiisvipuse;
    }

    public void setFiisvipuse(Integer fiisvipuse) {
        this.fiisvipuse = fiisvipuse;
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

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
    }

    public Integer getFivipid() {
        return fivipid;
    }

    public void setFivipid(Integer fivipid) {
        this.fivipid = fivipid;
    }

    public Integer getFicouponid() {
        return ficouponid;
    }

    public void setFicouponid(Integer ficouponid) {
        this.ficouponid = ficouponid;
    }

    public BigDecimal getFdddv() {
        return fdddv;
    }

    public void setFdddv(BigDecimal fdddv) {
        this.fdddv = fdddv;
    }

    public Integer getFidiscreason() {
        return fidiscreason;
    }

    public void setFidiscreason(Integer fidiscreason) {
        this.fidiscreason = fidiscreason;
    }

    public Integer getFiiseffectivedate() {
        return fiiseffectivedate;
    }

    public void setFiiseffectivedate(Integer fiiseffectivedate) {
        this.fiiseffectivedate = fiiseffectivedate;
    }

    public String getFsstardate() {
        return fsstardate;
    }

    public void setFsstardate(String fsstardate) {
        this.fsstardate = fsstardate == null ? null : fsstardate.trim();
    }

    public String getFsenddate() {
        return fsenddate;
    }

    public void setFsenddate(String fsenddate) {
        this.fsenddate = fsenddate == null ? null : fsenddate.trim();
    }
}