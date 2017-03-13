package com.pos.entity;

import java.math.BigDecimal;

public class Wechatconfig {
    private String fsid;

    private BigDecimal fddeliverfee;

    private BigDecimal fdordermoney;

    private String fsshopguid;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsid() {
        return fsid;
    }

    public void setFsid(String fsid) {
        this.fsid = fsid == null ? null : fsid.trim();
    }

    public BigDecimal getFddeliverfee() {
        return fddeliverfee;
    }

    public void setFddeliverfee(BigDecimal fddeliverfee) {
        this.fddeliverfee = fddeliverfee;
    }

    public BigDecimal getFdordermoney() {
        return fdordermoney;
    }

    public void setFdordermoney(BigDecimal fdordermoney) {
        this.fdordermoney = fdordermoney;
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
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