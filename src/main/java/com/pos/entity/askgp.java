package com.pos.entity;

public class askgp extends askgpKey {
    private String fsaskgpname;

    private Integer fistatus;

    private Integer fisortorder;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    private Integer fidatakind;

    private Integer fiisselect;

    private Integer fichoosetype;

    public String getFsaskgpname() {
        return fsaskgpname;
    }

    public void setFsaskgpname(String fsaskgpname) {
        this.fsaskgpname = fsaskgpname == null ? null : fsaskgpname.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
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

    public Integer getFidatakind() {
        return fidatakind;
    }

    public void setFidatakind(Integer fidatakind) {
        this.fidatakind = fidatakind;
    }

    public Integer getFiisselect() {
        return fiisselect;
    }

    public void setFiisselect(Integer fiisselect) {
        this.fiisselect = fiisselect;
    }

    public Integer getFichoosetype() {
        return fichoosetype;
    }

    public void setFichoosetype(Integer fichoosetype) {
        this.fichoosetype = fichoosetype;
    }
}