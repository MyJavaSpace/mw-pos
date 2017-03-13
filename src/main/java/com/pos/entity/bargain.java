package com.pos.entity;

public class bargain extends bargainKey {
    private String fsbargainname;

    private String fsbegintime;

    private String fsendtime;

    private String fsmsectionidlist;

    private Integer fiplantype;

    private String fsplantypevalue;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fibargaincls;

    private String fsnotusabledate;

    private Integer fiupdatetype;

    private String fscustomstarttime;

    private String fscustomendtime;

    public String getFsbargainname() {
        return fsbargainname;
    }

    public void setFsbargainname(String fsbargainname) {
        this.fsbargainname = fsbargainname == null ? null : fsbargainname.trim();
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

    public String getFsmsectionidlist() {
        return fsmsectionidlist;
    }

    public void setFsmsectionidlist(String fsmsectionidlist) {
        this.fsmsectionidlist = fsmsectionidlist == null ? null : fsmsectionidlist.trim();
    }

    public Integer getFiplantype() {
        return fiplantype;
    }

    public void setFiplantype(Integer fiplantype) {
        this.fiplantype = fiplantype;
    }

    public String getFsplantypevalue() {
        return fsplantypevalue;
    }

    public void setFsplantypevalue(String fsplantypevalue) {
        this.fsplantypevalue = fsplantypevalue == null ? null : fsplantypevalue.trim();
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

    public Integer getFibargaincls() {
        return fibargaincls;
    }

    public void setFibargaincls(Integer fibargaincls) {
        this.fibargaincls = fibargaincls;
    }

    public String getFsnotusabledate() {
        return fsnotusabledate;
    }

    public void setFsnotusabledate(String fsnotusabledate) {
        this.fsnotusabledate = fsnotusabledate == null ? null : fsnotusabledate.trim();
    }

    public Integer getFiupdatetype() {
        return fiupdatetype;
    }

    public void setFiupdatetype(Integer fiupdatetype) {
        this.fiupdatetype = fiupdatetype;
    }

    public String getFscustomstarttime() {
        return fscustomstarttime;
    }

    public void setFscustomstarttime(String fscustomstarttime) {
        this.fscustomstarttime = fscustomstarttime == null ? null : fscustomstarttime.trim();
    }

    public String getFscustomendtime() {
        return fscustomendtime;
    }

    public void setFscustomendtime(String fscustomendtime) {
        this.fscustomendtime = fscustomendtime == null ? null : fscustomendtime.trim();
    }
}