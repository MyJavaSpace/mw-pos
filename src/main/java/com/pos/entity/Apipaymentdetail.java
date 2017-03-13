package com.pos.entity;

import java.math.BigDecimal;

public class Apipaymentdetail {
    private String fspayno;

    private String fsorderid;

    private String fsshopguid;

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

    private BigDecimal fdamount1;

    private BigDecimal fdextreceipt;

    private String fssqe;

    private String fssellno;

    private Integer fiReturnstate;

    private String fsdate;

    private String fscheckbillno;

    private Integer fibank_own;

    private BigDecimal fdmeiweiFee;

    private BigDecimal fdthirdpartyFee;

    private BigDecimal fdali_discount;

    private BigDecimal fdext_discount;

    private String fsPayFinished;

    private String fspay_paytime;

    public String getFspayno() {
        return fspayno;
    }

    public void setFspayno(String fspayno) {
        this.fspayno = fspayno == null ? null : fspayno.trim();
    }

    public String getFsorderid() {
        return fsorderid;
    }

    public void setFsorderid(String fsorderid) {
        this.fsorderid = fsorderid == null ? null : fsorderid.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

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

    public BigDecimal getFdamount1() {
        return fdamount1;
    }

    public void setFdamount1(BigDecimal fdamount1) {
        this.fdamount1 = fdamount1;
    }

    public BigDecimal getFdextreceipt() {
        return fdextreceipt;
    }

    public void setFdextreceipt(BigDecimal fdextreceipt) {
        this.fdextreceipt = fdextreceipt;
    }

    public String getFssqe() {
        return fssqe;
    }

    public void setFssqe(String fssqe) {
        this.fssqe = fssqe == null ? null : fssqe.trim();
    }

    public String getFssellno() {
        return fssellno;
    }

    public void setFssellno(String fssellno) {
        this.fssellno = fssellno == null ? null : fssellno.trim();
    }

    public Integer getFiReturnstate() {
        return fiReturnstate;
    }

    public void setFiReturnstate(Integer fiReturnstate) {
        this.fiReturnstate = fiReturnstate;
    }

    public String getFsdate() {
        return fsdate;
    }

    public void setFsdate(String fsdate) {
        this.fsdate = fsdate == null ? null : fsdate.trim();
    }

    public String getFscheckbillno() {
        return fscheckbillno;
    }

    public void setFscheckbillno(String fscheckbillno) {
        this.fscheckbillno = fscheckbillno == null ? null : fscheckbillno.trim();
    }

    public Integer getFibank_own() {
        return fibank_own;
    }

    public void setFibank_own(Integer fibank_own) {
        this.fibank_own = fibank_own;
    }

    public BigDecimal getFdmeiweiFee() {
        return fdmeiweiFee;
    }

    public void setFdmeiweiFee(BigDecimal fdmeiweiFee) {
        this.fdmeiweiFee = fdmeiweiFee;
    }

    public BigDecimal getFdthirdpartyFee() {
        return fdthirdpartyFee;
    }

    public void setFdthirdpartyFee(BigDecimal fdthirdpartyFee) {
        this.fdthirdpartyFee = fdthirdpartyFee;
    }

    public BigDecimal getFdali_discount() {
        return fdali_discount;
    }

    public void setFdali_discount(BigDecimal fdali_discount) {
        this.fdali_discount = fdali_discount;
    }

    public BigDecimal getFdext_discount() {
        return fdext_discount;
    }

    public void setFdext_discount(BigDecimal fdext_discount) {
        this.fdext_discount = fdext_discount;
    }

    public String getFsPayFinished() {
        return fsPayFinished;
    }

    public void setFsPayFinished(String fsPayFinished) {
        this.fsPayFinished = fsPayFinished == null ? null : fsPayFinished.trim();
    }

    public String getFspay_paytime() {
        return fspay_paytime;
    }

    public void setFspay_paytime(String fspay_paytime) {
        this.fspay_paytime = fspay_paytime == null ? null : fspay_paytime.trim();
    }
}