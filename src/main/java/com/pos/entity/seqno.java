package com.pos.entity;

public class Seqno extends SeqnoKey {
    private Integer fiseqno;

    private String fsupdatetime;

    private Integer lver;

    public Integer getFiseqno() {
        return fiseqno;
    }

    public void setFiseqno(Integer fiseqno) {
        this.fiseqno = fiseqno;
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}