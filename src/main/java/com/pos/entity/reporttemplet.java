package com.pos.entity;

public class reporttemplet extends reporttempletKey {
    private String fsreporttempletname;

    private String fsreporttempletdesc;

    private Integer fipapersize;

    private String fsrptfile;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private String fsfoodtradeid;

    public String getFsreporttempletname() {
        return fsreporttempletname;
    }

    public void setFsreporttempletname(String fsreporttempletname) {
        this.fsreporttempletname = fsreporttempletname == null ? null : fsreporttempletname.trim();
    }

    public String getFsreporttempletdesc() {
        return fsreporttempletdesc;
    }

    public void setFsreporttempletdesc(String fsreporttempletdesc) {
        this.fsreporttempletdesc = fsreporttempletdesc == null ? null : fsreporttempletdesc.trim();
    }

    public Integer getFipapersize() {
        return fipapersize;
    }

    public void setFipapersize(Integer fipapersize) {
        this.fipapersize = fipapersize;
    }

    public String getFsrptfile() {
        return fsrptfile;
    }

    public void setFsrptfile(String fsrptfile) {
        this.fsrptfile = fsrptfile == null ? null : fsrptfile.trim();
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

    public String getFsfoodtradeid() {
        return fsfoodtradeid;
    }

    public void setFsfoodtradeid(String fsfoodtradeid) {
        this.fsfoodtradeid = fsfoodtradeid == null ? null : fsfoodtradeid.trim();
    }
}