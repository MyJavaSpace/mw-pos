package com.pos.entity;

public class msection extends msectionKey {
    private String fsmsectionname;

    private String fsbegintime;

    private String fsendtime;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsmsectionname() {
        return fsmsectionname;
    }

    public void setFsmsectionname(String fsmsectionname) {
        this.fsmsectionname = fsmsectionname == null ? null : fsmsectionname.trim();
    }

    public String getFsbegintime() {
        return fsbegintime;
    }

    public void setFsbegintime(String fsbegintime) {
        this.fsbegintime = fsbegintime == null ? null : fsbegintime.trim();
    }

    public String getFsendtime() {
        return fsendtime;
    }

    public void setFsendtime(String fsendtime) {
        this.fsendtime = fsendtime == null ? null : fsendtime.trim();
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