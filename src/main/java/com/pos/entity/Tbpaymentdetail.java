package com.pos.entity;

import java.math.BigDecimal;

public class Tbpaymentdetail extends TbpaymentdetailKey {
    private Integer fisourceid;

    private Integer fipaymenttypeid;

    private Integer fisettlementmerchant;

    private Integer fitradetype;

    private Integer fipayee;

    private BigDecimal fdamount;

    private String fssyspayid;

    private String fstradeno;

    private String fsopenid;

    private String fstransuserid;

    private String alipayemail;

    private Integer fiisactive;

    private String fstradetime;

    private String fscreatetime;

    private String fsupdatetime;

    public Integer getFisourceid() {
        return fisourceid;
    }

    public void setFisourceid(Integer fisourceid) {
        this.fisourceid = fisourceid;
    }

    public Integer getFipaymenttypeid() {
        return fipaymenttypeid;
    }

    public void setFipaymenttypeid(Integer fipaymenttypeid) {
        this.fipaymenttypeid = fipaymenttypeid;
    }

    public Integer getFisettlementmerchant() {
        return fisettlementmerchant;
    }

    public void setFisettlementmerchant(Integer fisettlementmerchant) {
        this.fisettlementmerchant = fisettlementmerchant;
    }

    public Integer getFitradetype() {
        return fitradetype;
    }

    public void setFitradetype(Integer fitradetype) {
        this.fitradetype = fitradetype;
    }

    public Integer getFipayee() {
        return fipayee;
    }

    public void setFipayee(Integer fipayee) {
        this.fipayee = fipayee;
    }

    public BigDecimal getFdamount() {
        return fdamount;
    }

    public void setFdamount(BigDecimal fdamount) {
        this.fdamount = fdamount;
    }

    public String getFssyspayid() {
        return fssyspayid;
    }

    public void setFssyspayid(String fssyspayid) {
        this.fssyspayid = fssyspayid == null ? null : fssyspayid.trim();
    }

    public String getFstradeno() {
        return fstradeno;
    }

    public void setFstradeno(String fstradeno) {
        this.fstradeno = fstradeno == null ? null : fstradeno.trim();
    }

    public String getFsopenid() {
        return fsopenid;
    }

    public void setFsopenid(String fsopenid) {
        this.fsopenid = fsopenid == null ? null : fsopenid.trim();
    }

    public String getFstransuserid() {
        return fstransuserid;
    }

    public void setFstransuserid(String fstransuserid) {
        this.fstransuserid = fstransuserid == null ? null : fstransuserid.trim();
    }

    public String getAlipayemail() {
        return alipayemail;
    }

    public void setAlipayemail(String alipayemail) {
        this.alipayemail = alipayemail == null ? null : alipayemail.trim();
    }

    public Integer getFiisactive() {
        return fiisactive;
    }

    public void setFiisactive(Integer fiisactive) {
        this.fiisactive = fiisactive;
    }

    public String getFstradetime() {
        return fstradetime;
    }

    public void setFstradetime(String fstradetime) {
        this.fstradetime = fstradetime == null ? null : fstradetime.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }
}