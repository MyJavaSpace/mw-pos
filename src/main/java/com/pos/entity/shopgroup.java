package com.pos.entity;

public class Shopgroup {
    private Integer fishopgroupid;

    private String fsshopgroupname;

    private String fsshopgroupkind;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fisortorder;

    public Integer getFishopgroupid() {
        return fishopgroupid;
    }

    public void setFishopgroupid(Integer fishopgroupid) {
        this.fishopgroupid = fishopgroupid;
    }

    public String getFsshopgroupname() {
        return fsshopgroupname;
    }

    public void setFsshopgroupname(String fsshopgroupname) {
        this.fsshopgroupname = fsshopgroupname == null ? null : fsshopgroupname.trim();
    }

    public String getFsshopgroupkind() {
        return fsshopgroupkind;
    }

    public void setFsshopgroupkind(String fsshopgroupkind) {
        this.fsshopgroupkind = fsshopgroupkind == null ? null : fsshopgroupkind.trim();
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

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }
}