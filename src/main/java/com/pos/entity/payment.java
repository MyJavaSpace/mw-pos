package com.pos.entity;

import java.math.BigDecimal;

public class Payment extends PaymentKey {
    private String fspaymenttypeid;

    private String fspaymentname;

    private BigDecimal fddefaultprice;

    private Integer fiisforeign;

    private BigDecimal fdexchangerate;

    private Integer fiiscalcpaid;

    private Integer fiiscalcinvoice;

    private Integer fiispremium;

    private String fsnote;

    private Integer fisortorder;

    private Integer fistatus;

    private Integer fidatakind;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private BigDecimal fddiscountrate;

    private String fscolor;

    private String fsshortcutkey;

    private String fshelpcode;

    private String fsdiscountpaymentid;

    private Integer fiispartamtdiscount;

    private Integer fiiseffectivedate;

    private String fsstardate;

    private String fsenddate;

    public String getFspaymenttypeid() {
        return fspaymenttypeid;
    }

    public void setFspaymenttypeid(String fspaymenttypeid) {
        this.fspaymenttypeid = fspaymenttypeid == null ? null : fspaymenttypeid.trim();
    }

    public String getFspaymentname() {
        return fspaymentname;
    }

    public void setFspaymentname(String fspaymentname) {
        this.fspaymentname = fspaymentname == null ? null : fspaymentname.trim();
    }

    public BigDecimal getFddefaultprice() {
        return fddefaultprice;
    }

    public void setFddefaultprice(BigDecimal fddefaultprice) {
        this.fddefaultprice = fddefaultprice;
    }

    public Integer getFiisforeign() {
        return fiisforeign;
    }

    public void setFiisforeign(Integer fiisforeign) {
        this.fiisforeign = fiisforeign;
    }

    public BigDecimal getFdexchangerate() {
        return fdexchangerate;
    }

    public void setFdexchangerate(BigDecimal fdexchangerate) {
        this.fdexchangerate = fdexchangerate;
    }

    public Integer getFiiscalcpaid() {
        return fiiscalcpaid;
    }

    public void setFiiscalcpaid(Integer fiiscalcpaid) {
        this.fiiscalcpaid = fiiscalcpaid;
    }

    public Integer getFiiscalcinvoice() {
        return fiiscalcinvoice;
    }

    public void setFiiscalcinvoice(Integer fiiscalcinvoice) {
        this.fiiscalcinvoice = fiiscalcinvoice;
    }

    public Integer getFiispremium() {
        return fiispremium;
    }

    public void setFiispremium(Integer fiispremium) {
        this.fiispremium = fiispremium;
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
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

    public BigDecimal getFddiscountrate() {
        return fddiscountrate;
    }

    public void setFddiscountrate(BigDecimal fddiscountrate) {
        this.fddiscountrate = fddiscountrate;
    }

    public String getFscolor() {
        return fscolor;
    }

    public void setFscolor(String fscolor) {
        this.fscolor = fscolor == null ? null : fscolor.trim();
    }

    public String getFsshortcutkey() {
        return fsshortcutkey;
    }

    public void setFsshortcutkey(String fsshortcutkey) {
        this.fsshortcutkey = fsshortcutkey == null ? null : fsshortcutkey.trim();
    }

    public String getFshelpcode() {
        return fshelpcode;
    }

    public void setFshelpcode(String fshelpcode) {
        this.fshelpcode = fshelpcode == null ? null : fshelpcode.trim();
    }

    public String getFsdiscountpaymentid() {
        return fsdiscountpaymentid;
    }

    public void setFsdiscountpaymentid(String fsdiscountpaymentid) {
        this.fsdiscountpaymentid = fsdiscountpaymentid == null ? null : fsdiscountpaymentid.trim();
    }

    public Integer getFiispartamtdiscount() {
        return fiispartamtdiscount;
    }

    public void setFiispartamtdiscount(Integer fiispartamtdiscount) {
        this.fiispartamtdiscount = fiispartamtdiscount;
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