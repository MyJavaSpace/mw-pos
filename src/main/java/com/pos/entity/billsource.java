package com.pos.entity;

public class Billsource extends BillsourceKey {
    private String fsbillsourcename;

    private Integer fistatus;

    private Integer fidatakind;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fibillsource;

    private Integer fimessagenotice;

    private Integer fivoicenotice;

    public String getFsbillsourcename() {
        return fsbillsourcename;
    }

    public void setFsbillsourcename(String fsbillsourcename) {
        this.fsbillsourcename = fsbillsourcename == null ? null : fsbillsourcename.trim();
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

    public Integer getFibillsource() {
        return fibillsource;
    }

    public void setFibillsource(Integer fibillsource) {
        this.fibillsource = fibillsource;
    }

    public Integer getFimessagenotice() {
        return fimessagenotice;
    }

    public void setFimessagenotice(Integer fimessagenotice) {
        this.fimessagenotice = fimessagenotice;
    }

    public Integer getFivoicenotice() {
        return fivoicenotice;
    }

    public void setFivoicenotice(Integer fivoicenotice) {
        this.fivoicenotice = fivoicenotice;
    }
}