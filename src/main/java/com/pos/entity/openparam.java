package com.pos.entity;

public class openparam {
    private Integer fiid;

    private String fsmareaid;

    private Integer fiorderuintcd;

    private Integer fiitemcd;

    private Integer finumbertype;

    private Integer fisaleqty;

    private Integer fiisgift;

    private Integer fistatus;

    private String fsshopguid;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public Integer getFiid() {
        return fiid;
    }

    public void setFiid(Integer fiid) {
        this.fiid = fiid;
    }

    public String getFsmareaid() {
        return fsmareaid;
    }

    public void setFsmareaid(String fsmareaid) {
        this.fsmareaid = fsmareaid == null ? null : fsmareaid.trim();
    }

    public Integer getFiorderuintcd() {
        return fiorderuintcd;
    }

    public void setFiorderuintcd(Integer fiorderuintcd) {
        this.fiorderuintcd = fiorderuintcd;
    }

    public Integer getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Integer fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public Integer getFinumbertype() {
        return finumbertype;
    }

    public void setFinumbertype(Integer finumbertype) {
        this.finumbertype = finumbertype;
    }

    public Integer getFisaleqty() {
        return fisaleqty;
    }

    public void setFisaleqty(Integer fisaleqty) {
        this.fisaleqty = fisaleqty;
    }

    public Integer getFiisgift() {
        return fiisgift;
    }

    public void setFiisgift(Integer fiisgift) {
        this.fiisgift = fiisgift;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
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