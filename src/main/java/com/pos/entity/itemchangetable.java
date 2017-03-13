package com.pos.entity;

import java.math.BigDecimal;

public class itemchangetable {
    private String fssellno;

    private String fsmtableid;

    private String fsseq;

    private Long fiitemcd;

    private String fsitemid;

    private String fsitemname;

    private BigDecimal fdchangeqty;

    private String fschangereason;

    private String fssellnoNew;

    private String fsmtableidNew;

    private String fscreatetime;

    private String fscreateusername;

    private String fsshopguid;

    public String getFssellno() {
        return fssellno;
    }

    public void setFssellno(String fssellno) {
        this.fssellno = fssellno == null ? null : fssellno.trim();
    }

    public String getFsmtableid() {
        return fsmtableid;
    }

    public void setFsmtableid(String fsmtableid) {
        this.fsmtableid = fsmtableid == null ? null : fsmtableid.trim();
    }

    public String getFsseq() {
        return fsseq;
    }

    public void setFsseq(String fsseq) {
        this.fsseq = fsseq == null ? null : fsseq.trim();
    }

    public Long getFiitemcd() {
        return fiitemcd;
    }

    public void setFiitemcd(Long fiitemcd) {
        this.fiitemcd = fiitemcd;
    }

    public String getFsitemid() {
        return fsitemid;
    }

    public void setFsitemid(String fsitemid) {
        this.fsitemid = fsitemid == null ? null : fsitemid.trim();
    }

    public String getFsitemname() {
        return fsitemname;
    }

    public void setFsitemname(String fsitemname) {
        this.fsitemname = fsitemname == null ? null : fsitemname.trim();
    }

    public BigDecimal getFdchangeqty() {
        return fdchangeqty;
    }

    public void setFdchangeqty(BigDecimal fdchangeqty) {
        this.fdchangeqty = fdchangeqty;
    }

    public String getFschangereason() {
        return fschangereason;
    }

    public void setFschangereason(String fschangereason) {
        this.fschangereason = fschangereason == null ? null : fschangereason.trim();
    }

    public String getFssellnoNew() {
        return fssellnoNew;
    }

    public void setFssellnoNew(String fssellnoNew) {
        this.fssellnoNew = fssellnoNew == null ? null : fssellnoNew.trim();
    }

    public String getFsmtableidNew() {
        return fsmtableidNew;
    }

    public void setFsmtableidNew(String fsmtableidNew) {
        this.fsmtableidNew = fsmtableidNew == null ? null : fsmtableidNew.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }

    public String getFscreateusername() {
        return fscreateusername;
    }

    public void setFscreateusername(String fscreateusername) {
        this.fscreateusername = fscreateusername == null ? null : fscreateusername.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}