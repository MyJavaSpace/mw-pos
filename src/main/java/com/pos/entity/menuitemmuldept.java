package com.pos.entity;

public class menuitemmuldept extends menuitemmuldeptKey {
    private Integer fiitemcd;

    private String fsdeptid;

    private String fsmareaid;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public String getFsdeptid() {
        return fsdeptid;
    }

    public void setFsdeptid(String fsdeptid) {
        this.fsdeptid = fsdeptid == null ? null : fsdeptid.trim();
    }

    public String getFsmareaid() {
        return fsmareaid;
    }

    public void setFsmareaid(String fsmareaid) {
        this.fsmareaid = fsmareaid == null ? null : fsmareaid.trim();
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