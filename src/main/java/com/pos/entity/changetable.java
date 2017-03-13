package com.pos.entity;

public class changetable {
    private String fssellno;

    private Integer fitimes;

    private String fsmtableid;

    private String fsmtableidNew;

    private String fschangereason;

    private String fscreatetime;

    private String fscreateusername;

    private String fsshopguid;

    public String getFssellno() {
        return fssellno;
    }

    public void setFssellno(String fssellno) {
        this.fssellno = fssellno == null ? null : fssellno.trim();
    }

    public Integer getFitimes() {
        return fitimes;
    }

    public void setFitimes(Integer fitimes) {
        this.fitimes = fitimes;
    }

    public String getFsmtableid() {
        return fsmtableid;
    }

    public void setFsmtableid(String fsmtableid) {
        this.fsmtableid = fsmtableid == null ? null : fsmtableid.trim();
    }

    public String getFsmtableidNew() {
        return fsmtableidNew;
    }

    public void setFsmtableidNew(String fsmtableidNew) {
        this.fsmtableidNew = fsmtableidNew == null ? null : fsmtableidNew.trim();
    }

    public String getFschangereason() {
        return fschangereason;
    }

    public void setFschangereason(String fschangereason) {
        this.fschangereason = fschangereason == null ? null : fschangereason.trim();
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