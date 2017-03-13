package com.pos.entity;

import java.math.BigDecimal;

public class ask extends askKey {
    private String fsaskgpid;

    private String fsaskname;

    private BigDecimal fdaddprice;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fiitemcd;

    private Integer fistatus;

    public String getFsaskgpid() {
        return fsaskgpid;
    }

    public void setFsaskgpid(String fsaskgpid) {
        this.fsaskgpid = fsaskgpid == null ? null : fsaskgpid.trim();
    }

    public String getFsaskname() {
        return fsaskname;
    }

    public void setFsaskname(String fsaskname) {
        this.fsaskname = fsaskname == null ? null : fsaskname.trim();
    }

    public BigDecimal getFdaddprice() {
        return fdaddprice;
    }

    public void setFdaddprice(BigDecimal fdaddprice) {
        this.fdaddprice = fdaddprice;
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

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }
}