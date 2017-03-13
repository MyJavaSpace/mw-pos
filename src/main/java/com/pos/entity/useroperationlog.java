package com.pos.entity;

public class Useroperationlog {
    private String id;

    private String fsshopguid;

    private String fstargettype;

    private String fstargetname;

    private String fstype;

    private String fscontent;

    private String fscreateuser;

    private String fscreatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }

    public String getFstargettype() {
        return fstargettype;
    }

    public void setFstargettype(String fstargettype) {
        this.fstargettype = fstargettype == null ? null : fstargettype.trim();
    }

    public String getFstargetname() {
        return fstargetname;
    }

    public void setFstargetname(String fstargetname) {
        this.fstargetname = fstargetname == null ? null : fstargetname.trim();
    }

    public String getFstype() {
        return fstype;
    }

    public void setFstype(String fstype) {
        this.fstype = fstype == null ? null : fstype.trim();
    }

    public String getFscontent() {
        return fscontent;
    }

    public void setFscontent(String fscontent) {
        this.fscontent = fscontent == null ? null : fscontent.trim();
    }

    public String getFscreateuser() {
        return fscreateuser;
    }

    public void setFscreateuser(String fscreateuser) {
        this.fscreateuser = fscreateuser == null ? null : fscreateuser.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }
}