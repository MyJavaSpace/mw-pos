package com.pos.entity;

public class menucls extends menuclsKey {
    private String fsmenuclsname;

    private String fsmenuclsfullname;

    private String fsexpclsid;

    private String fsrevenuetypeid;

    private Integer fimenuclskind;

    private Integer fisortorder;

    private Integer fistatus;

    private Integer fidatakind;

    private Integer filevel;

    private Integer fidtllvl;

    private String fsmenuclsidP;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsmenuclsname() {
        return fsmenuclsname;
    }

    public void setFsmenuclsname(String fsmenuclsname) {
        this.fsmenuclsname = fsmenuclsname == null ? null : fsmenuclsname.trim();
    }

    public String getFsmenuclsfullname() {
        return fsmenuclsfullname;
    }

    public void setFsmenuclsfullname(String fsmenuclsfullname) {
        this.fsmenuclsfullname = fsmenuclsfullname == null ? null : fsmenuclsfullname.trim();
    }

    public String getFsexpclsid() {
        return fsexpclsid;
    }

    public void setFsexpclsid(String fsexpclsid) {
        this.fsexpclsid = fsexpclsid == null ? null : fsexpclsid.trim();
    }

    public String getFsrevenuetypeid() {
        return fsrevenuetypeid;
    }

    public void setFsrevenuetypeid(String fsrevenuetypeid) {
        this.fsrevenuetypeid = fsrevenuetypeid == null ? null : fsrevenuetypeid.trim();
    }

    public Integer getFimenuclskind() {
        return fimenuclskind;
    }

    public void setFimenuclskind(Integer fimenuclskind) {
        this.fimenuclskind = fimenuclskind;
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
    }

    public Integer getFilevel() {
        return filevel;
    }

    public void setFilevel(Integer filevel) {
        this.filevel = filevel;
    }

    public Integer getFidtllvl() {
        return fidtllvl;
    }

    public void setFidtllvl(Integer fidtllvl) {
        this.fidtllvl = fidtllvl;
    }

    public String getFsmenuclsidP() {
        return fsmenuclsidP;
    }

    public void setFsmenuclsidP(String fsmenuclsidP) {
        this.fsmenuclsidP = fsmenuclsidP == null ? null : fsmenuclsidP.trim();
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