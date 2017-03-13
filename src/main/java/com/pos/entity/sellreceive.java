package com.pos.entity;

import java.math.BigDecimal;

public class Sellreceive extends SellreceiveKey {
    private String fspaymentid;

    private BigDecimal fdforeignmoney;

    private BigDecimal fdexchangerate;

    private BigDecimal fdpaymoney;

    private BigDecimal fdrecemoney;

    private Integer fiiscalcpaid;

    private Integer fiiscalcinvoice;

    private String fsnote;

    private String fshostid;

    private String fscreatetime;

    private String fscreateuserid;

    private String fscreateusername;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fistatus;

    private String fsdatasrckind;

    private String fssrcverno;

    private String fspaymentname;

    private String fsbackup0;

    private String fsbackup1;

    private String fsbackup2;

    private Integer lver;

    private String fsmiscno;

    public String getFspaymentid() {
        return fspaymentid;
    }

    public void setFspaymentid(String fspaymentid) {
        this.fspaymentid = fspaymentid == null ? null : fspaymentid.trim();
    }

    public BigDecimal getFdforeignmoney() {
        return fdforeignmoney;
    }

    public void setFdforeignmoney(BigDecimal fdforeignmoney) {
        this.fdforeignmoney = fdforeignmoney;
    }

    public BigDecimal getFdexchangerate() {
        return fdexchangerate;
    }

    public void setFdexchangerate(BigDecimal fdexchangerate) {
        this.fdexchangerate = fdexchangerate;
    }

    public BigDecimal getFdpaymoney() {
        return fdpaymoney;
    }

    public void setFdpaymoney(BigDecimal fdpaymoney) {
        this.fdpaymoney = fdpaymoney;
    }

    public BigDecimal getFdrecemoney() {
        return fdrecemoney;
    }

    public void setFdrecemoney(BigDecimal fdrecemoney) {
        this.fdrecemoney = fdrecemoney;
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

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
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

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
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

    public String getFspaymentname() {
        return fspaymentname;
    }

    public void setFspaymentname(String fspaymentname) {
        this.fspaymentname = fspaymentname == null ? null : fspaymentname.trim();
    }

    public String getFsbackup0() {
        return fsbackup0;
    }

    public void setFsbackup0(String fsbackup0) {
        this.fsbackup0 = fsbackup0 == null ? null : fsbackup0.trim();
    }

    public String getFsbackup1() {
        return fsbackup1;
    }

    public void setFsbackup1(String fsbackup1) {
        this.fsbackup1 = fsbackup1 == null ? null : fsbackup1.trim();
    }

    public String getFsbackup2() {
        return fsbackup2;
    }

    public void setFsbackup2(String fsbackup2) {
        this.fsbackup2 = fsbackup2 == null ? null : fsbackup2.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }

    public String getFsmiscno() {
        return fsmiscno;
    }

    public void setFsmiscno(String fsmiscno) {
        this.fsmiscno = fsmiscno == null ? null : fsmiscno.trim();
    }
}