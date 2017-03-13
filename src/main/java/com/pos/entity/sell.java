package com.pos.entity;

import java.math.BigDecimal;

public class Sell extends SellKey {
    private String fsselldate;

    private String fsselltime;

    private String fsmsectionid;

    private String fsmareaid;

    private String fsmtableid;

    private String fsmtablename;

    private String fsmealnumber;

    private Integer ficustsum;

    private String fscustguid;

    private String fscustid;

    private String fscustname;

    private String fscustmobile;

    private String fscardno;

    private String fsvipsource;

    private Integer fiisvip;

    private String fssendaddr;

    private String fssendontime;

    private String fssenduserid;

    private String fssendusername;

    private String fsputuptime;

    private String fsassigntime;

    private String fsstaffid;

    private String fsstaffname;

    private Integer fibillstatus;

    private Integer fibillkind;

    private Integer fibillsource;

    private BigDecimal fdsaleamt;

    private BigDecimal fddiscountamt;

    private BigDecimal fdserviceamt;

    private BigDecimal fdexpamt;

    private BigDecimal fdpayamt;

    private BigDecimal fddiffamt;

    private BigDecimal fdrealamt;

    private BigDecimal fdgiftamt;

    private BigDecimal fdbackamt;

    private String fsdiscountid;

    private String fsdiscountname;

    private String fscreditaccountid;

    private String fscreditaccountname;

    private BigDecimal fddebtamt;

    private String fsmastersellno;

    private String fsrelationmtable;

    private String fsnote;

    private String fsprintexptime;

    private String fscheckendtime;

    private Integer fiisinvoice;

    private String fsinvoicecls;

    private String fsinvoicetitle;

    private BigDecimal fdinvoiceamt;

    private Integer fiprinttimesOp;

    private Integer fiprinttimesExp;

    private Integer fiisverify;

    private String fsverifyusername;

    private String fsverifytime;

    private Integer fimodifytag;

    private Integer firechecktag;

    private String fshostid;

    private String fscreatetime;

    private String fscreateuserid;

    private String fscreateusername;

    private String fsupdatetime;

    private String fsbillsourceid;

    private String fsbillsourcename;

    private String fsbillsourceno;

    private BigDecimal fddisexpamt;

    private BigDecimal fdroundamt;

    private BigDecimal fdfreesveamt;

    private String fsfreesveamtuserid;

    private String fsfreesveamtusername;

    private String fsrecheckuserid;

    private String fsrecheckusername;

    private String fsrecheckreason;

    private String fsdatasrckind;

    private String fssrcverno;

    private BigDecimal fdgiftroundamt;

    private BigDecimal fddiscountroundamt;

    private BigDecimal fdbackroundamt;

    private BigDecimal fdserviceroundamt;

    private BigDecimal fdsaleroundamt;

    private BigDecimal fdgiftqty;

    private BigDecimal fdbackqty;

    private Integer lver;

    public String getFsselldate() {
        return fsselldate;
    }

    public void setFsselldate(String fsselldate) {
        this.fsselldate = fsselldate == null ? null : fsselldate.trim();
    }

    public String getFsselltime() {
        return fsselltime;
    }

    public void setFsselltime(String fsselltime) {
        this.fsselltime = fsselltime == null ? null : fsselltime.trim();
    }

    public String getFsmsectionid() {
        return fsmsectionid;
    }

    public void setFsmsectionid(String fsmsectionid) {
        this.fsmsectionid = fsmsectionid == null ? null : fsmsectionid.trim();
    }

    public String getFsmareaid() {
        return fsmareaid;
    }

    public void setFsmareaid(String fsmareaid) {
        this.fsmareaid = fsmareaid == null ? null : fsmareaid.trim();
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

    public String getFsmealnumber() {
        return fsmealnumber;
    }

    public void setFsmealnumber(String fsmealnumber) {
        this.fsmealnumber = fsmealnumber == null ? null : fsmealnumber.trim();
    }

    public Integer getFicustsum() {
        return ficustsum;
    }

    public void setFicustsum(Integer ficustsum) {
        this.ficustsum = ficustsum;
    }

    public String getFscustguid() {
        return fscustguid;
    }

    public void setFscustguid(String fscustguid) {
        this.fscustguid = fscustguid == null ? null : fscustguid.trim();
    }

    public String getFscustid() {
        return fscustid;
    }

    public void setFscustid(String fscustid) {
        this.fscustid = fscustid == null ? null : fscustid.trim();
    }

    public String getFscustname() {
        return fscustname;
    }

    public void setFscustname(String fscustname) {
        this.fscustname = fscustname == null ? null : fscustname.trim();
    }

    public String getFscustmobile() {
        return fscustmobile;
    }

    public void setFscustmobile(String fscustmobile) {
        this.fscustmobile = fscustmobile == null ? null : fscustmobile.trim();
    }

    public String getFscardno() {
        return fscardno;
    }

    public void setFscardno(String fscardno) {
        this.fscardno = fscardno == null ? null : fscardno.trim();
    }

    public String getFsvipsource() {
        return fsvipsource;
    }

    public void setFsvipsource(String fsvipsource) {
        this.fsvipsource = fsvipsource == null ? null : fsvipsource.trim();
    }

    public Integer getFiisvip() {
        return fiisvip;
    }

    public void setFiisvip(Integer fiisvip) {
        this.fiisvip = fiisvip;
    }

    public String getFssendaddr() {
        return fssendaddr;
    }

    public void setFssendaddr(String fssendaddr) {
        this.fssendaddr = fssendaddr == null ? null : fssendaddr.trim();
    }

    public String getFssendontime() {
        return fssendontime;
    }

    public void setFssendontime(String fssendontime) {
        this.fssendontime = fssendontime == null ? null : fssendontime.trim();
    }

    public String getFssenduserid() {
        return fssenduserid;
    }

    public void setFssenduserid(String fssenduserid) {
        this.fssenduserid = fssenduserid == null ? null : fssenduserid.trim();
    }

    public String getFssendusername() {
        return fssendusername;
    }

    public void setFssendusername(String fssendusername) {
        this.fssendusername = fssendusername == null ? null : fssendusername.trim();
    }

    public String getFsputuptime() {
        return fsputuptime;
    }

    public void setFsputuptime(String fsputuptime) {
        this.fsputuptime = fsputuptime == null ? null : fsputuptime.trim();
    }

    public String getFsassigntime() {
        return fsassigntime;
    }

    public void setFsassigntime(String fsassigntime) {
        this.fsassigntime = fsassigntime == null ? null : fsassigntime.trim();
    }

    public String getFsstaffid() {
        return fsstaffid;
    }

    public void setFsstaffid(String fsstaffid) {
        this.fsstaffid = fsstaffid == null ? null : fsstaffid.trim();
    }

    public String getFsstaffname() {
        return fsstaffname;
    }

    public void setFsstaffname(String fsstaffname) {
        this.fsstaffname = fsstaffname == null ? null : fsstaffname.trim();
    }

    public Integer getFibillstatus() {
        return fibillstatus;
    }

    public void setFibillstatus(Integer fibillstatus) {
        this.fibillstatus = fibillstatus;
    }

    public Integer getFibillkind() {
        return fibillkind;
    }

    public void setFibillkind(Integer fibillkind) {
        this.fibillkind = fibillkind;
    }

    public Integer getFibillsource() {
        return fibillsource;
    }

    public void setFibillsource(Integer fibillsource) {
        this.fibillsource = fibillsource;
    }

    public BigDecimal getFdsaleamt() {
        return fdsaleamt;
    }

    public void setFdsaleamt(BigDecimal fdsaleamt) {
        this.fdsaleamt = fdsaleamt;
    }

    public BigDecimal getFddiscountamt() {
        return fddiscountamt;
    }

    public void setFddiscountamt(BigDecimal fddiscountamt) {
        this.fddiscountamt = fddiscountamt;
    }

    public BigDecimal getFdserviceamt() {
        return fdserviceamt;
    }

    public void setFdserviceamt(BigDecimal fdserviceamt) {
        this.fdserviceamt = fdserviceamt;
    }

    public BigDecimal getFdexpamt() {
        return fdexpamt;
    }

    public void setFdexpamt(BigDecimal fdexpamt) {
        this.fdexpamt = fdexpamt;
    }

    public BigDecimal getFdpayamt() {
        return fdpayamt;
    }

    public void setFdpayamt(BigDecimal fdpayamt) {
        this.fdpayamt = fdpayamt;
    }

    public BigDecimal getFddiffamt() {
        return fddiffamt;
    }

    public void setFddiffamt(BigDecimal fddiffamt) {
        this.fddiffamt = fddiffamt;
    }

    public BigDecimal getFdrealamt() {
        return fdrealamt;
    }

    public void setFdrealamt(BigDecimal fdrealamt) {
        this.fdrealamt = fdrealamt;
    }

    public BigDecimal getFdgiftamt() {
        return fdgiftamt;
    }

    public void setFdgiftamt(BigDecimal fdgiftamt) {
        this.fdgiftamt = fdgiftamt;
    }

    public BigDecimal getFdbackamt() {
        return fdbackamt;
    }

    public void setFdbackamt(BigDecimal fdbackamt) {
        this.fdbackamt = fdbackamt;
    }

    public String getFsdiscountid() {
        return fsdiscountid;
    }

    public void setFsdiscountid(String fsdiscountid) {
        this.fsdiscountid = fsdiscountid == null ? null : fsdiscountid.trim();
    }

    public String getFsdiscountname() {
        return fsdiscountname;
    }

    public void setFsdiscountname(String fsdiscountname) {
        this.fsdiscountname = fsdiscountname == null ? null : fsdiscountname.trim();
    }

    public String getFscreditaccountid() {
        return fscreditaccountid;
    }

    public void setFscreditaccountid(String fscreditaccountid) {
        this.fscreditaccountid = fscreditaccountid == null ? null : fscreditaccountid.trim();
    }

    public String getFscreditaccountname() {
        return fscreditaccountname;
    }

    public void setFscreditaccountname(String fscreditaccountname) {
        this.fscreditaccountname = fscreditaccountname == null ? null : fscreditaccountname.trim();
    }

    public BigDecimal getFddebtamt() {
        return fddebtamt;
    }

    public void setFddebtamt(BigDecimal fddebtamt) {
        this.fddebtamt = fddebtamt;
    }

    public String getFsmastersellno() {
        return fsmastersellno;
    }

    public void setFsmastersellno(String fsmastersellno) {
        this.fsmastersellno = fsmastersellno == null ? null : fsmastersellno.trim();
    }

    public String getFsrelationmtable() {
        return fsrelationmtable;
    }

    public void setFsrelationmtable(String fsrelationmtable) {
        this.fsrelationmtable = fsrelationmtable == null ? null : fsrelationmtable.trim();
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public String getFsprintexptime() {
        return fsprintexptime;
    }

    public void setFsprintexptime(String fsprintexptime) {
        this.fsprintexptime = fsprintexptime == null ? null : fsprintexptime.trim();
    }

    public String getFscheckendtime() {
        return fscheckendtime;
    }

    public void setFscheckendtime(String fscheckendtime) {
        this.fscheckendtime = fscheckendtime == null ? null : fscheckendtime.trim();
    }

    public Integer getFiisinvoice() {
        return fiisinvoice;
    }

    public void setFiisinvoice(Integer fiisinvoice) {
        this.fiisinvoice = fiisinvoice;
    }

    public String getFsinvoicecls() {
        return fsinvoicecls;
    }

    public void setFsinvoicecls(String fsinvoicecls) {
        this.fsinvoicecls = fsinvoicecls == null ? null : fsinvoicecls.trim();
    }

    public String getFsinvoicetitle() {
        return fsinvoicetitle;
    }

    public void setFsinvoicetitle(String fsinvoicetitle) {
        this.fsinvoicetitle = fsinvoicetitle == null ? null : fsinvoicetitle.trim();
    }

    public BigDecimal getFdinvoiceamt() {
        return fdinvoiceamt;
    }

    public void setFdinvoiceamt(BigDecimal fdinvoiceamt) {
        this.fdinvoiceamt = fdinvoiceamt;
    }

    public Integer getFiprinttimesOp() {
        return fiprinttimesOp;
    }

    public void setFiprinttimesOp(Integer fiprinttimesOp) {
        this.fiprinttimesOp = fiprinttimesOp;
    }

    public Integer getFiprinttimesExp() {
        return fiprinttimesExp;
    }

    public void setFiprinttimesExp(Integer fiprinttimesExp) {
        this.fiprinttimesExp = fiprinttimesExp;
    }

    public Integer getFiisverify() {
        return fiisverify;
    }

    public void setFiisverify(Integer fiisverify) {
        this.fiisverify = fiisverify;
    }

    public String getFsverifyusername() {
        return fsverifyusername;
    }

    public void setFsverifyusername(String fsverifyusername) {
        this.fsverifyusername = fsverifyusername == null ? null : fsverifyusername.trim();
    }

    public String getFsverifytime() {
        return fsverifytime;
    }

    public void setFsverifytime(String fsverifytime) {
        this.fsverifytime = fsverifytime == null ? null : fsverifytime.trim();
    }

    public Integer getFimodifytag() {
        return fimodifytag;
    }

    public void setFimodifytag(Integer fimodifytag) {
        this.fimodifytag = fimodifytag;
    }

    public Integer getFirechecktag() {
        return firechecktag;
    }

    public void setFirechecktag(Integer firechecktag) {
        this.firechecktag = firechecktag;
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

    public String getFsbillsourceid() {
        return fsbillsourceid;
    }

    public void setFsbillsourceid(String fsbillsourceid) {
        this.fsbillsourceid = fsbillsourceid == null ? null : fsbillsourceid.trim();
    }

    public String getFsbillsourcename() {
        return fsbillsourcename;
    }

    public void setFsbillsourcename(String fsbillsourcename) {
        this.fsbillsourcename = fsbillsourcename == null ? null : fsbillsourcename.trim();
    }

    public String getFsbillsourceno() {
        return fsbillsourceno;
    }

    public void setFsbillsourceno(String fsbillsourceno) {
        this.fsbillsourceno = fsbillsourceno == null ? null : fsbillsourceno.trim();
    }

    public BigDecimal getFddisexpamt() {
        return fddisexpamt;
    }

    public void setFddisexpamt(BigDecimal fddisexpamt) {
        this.fddisexpamt = fddisexpamt;
    }

    public BigDecimal getFdroundamt() {
        return fdroundamt;
    }

    public void setFdroundamt(BigDecimal fdroundamt) {
        this.fdroundamt = fdroundamt;
    }

    public BigDecimal getFdfreesveamt() {
        return fdfreesveamt;
    }

    public void setFdfreesveamt(BigDecimal fdfreesveamt) {
        this.fdfreesveamt = fdfreesveamt;
    }

    public String getFsfreesveamtuserid() {
        return fsfreesveamtuserid;
    }

    public void setFsfreesveamtuserid(String fsfreesveamtuserid) {
        this.fsfreesveamtuserid = fsfreesveamtuserid == null ? null : fsfreesveamtuserid.trim();
    }

    public String getFsfreesveamtusername() {
        return fsfreesveamtusername;
    }

    public void setFsfreesveamtusername(String fsfreesveamtusername) {
        this.fsfreesveamtusername = fsfreesveamtusername == null ? null : fsfreesveamtusername.trim();
    }

    public String getFsrecheckuserid() {
        return fsrecheckuserid;
    }

    public void setFsrecheckuserid(String fsrecheckuserid) {
        this.fsrecheckuserid = fsrecheckuserid == null ? null : fsrecheckuserid.trim();
    }

    public String getFsrecheckusername() {
        return fsrecheckusername;
    }

    public void setFsrecheckusername(String fsrecheckusername) {
        this.fsrecheckusername = fsrecheckusername == null ? null : fsrecheckusername.trim();
    }

    public String getFsrecheckreason() {
        return fsrecheckreason;
    }

    public void setFsrecheckreason(String fsrecheckreason) {
        this.fsrecheckreason = fsrecheckreason == null ? null : fsrecheckreason.trim();
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

    public BigDecimal getFdgiftroundamt() {
        return fdgiftroundamt;
    }

    public void setFdgiftroundamt(BigDecimal fdgiftroundamt) {
        this.fdgiftroundamt = fdgiftroundamt;
    }

    public BigDecimal getFddiscountroundamt() {
        return fddiscountroundamt;
    }

    public void setFddiscountroundamt(BigDecimal fddiscountroundamt) {
        this.fddiscountroundamt = fddiscountroundamt;
    }

    public BigDecimal getFdbackroundamt() {
        return fdbackroundamt;
    }

    public void setFdbackroundamt(BigDecimal fdbackroundamt) {
        this.fdbackroundamt = fdbackroundamt;
    }

    public BigDecimal getFdserviceroundamt() {
        return fdserviceroundamt;
    }

    public void setFdserviceroundamt(BigDecimal fdserviceroundamt) {
        this.fdserviceroundamt = fdserviceroundamt;
    }

    public BigDecimal getFdsaleroundamt() {
        return fdsaleroundamt;
    }

    public void setFdsaleroundamt(BigDecimal fdsaleroundamt) {
        this.fdsaleroundamt = fdsaleroundamt;
    }

    public BigDecimal getFdgiftqty() {
        return fdgiftqty;
    }

    public void setFdgiftqty(BigDecimal fdgiftqty) {
        this.fdgiftqty = fdgiftqty;
    }

    public BigDecimal getFdbackqty() {
        return fdbackqty;
    }

    public void setFdbackqty(BigDecimal fdbackqty) {
        this.fdbackqty = fdbackqty;
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}