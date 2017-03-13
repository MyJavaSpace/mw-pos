package com.pos.entity;

public class custsur extends custsurKey {
    private String fscustsurname;

    private String fsnote;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFscustsurname() {
        return fscustsurname;
    }

    public void setFscustsurname(String fscustsurname) {
        this.fscustsurname = fscustsurname == null ? null : fscustsurname.trim();
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
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