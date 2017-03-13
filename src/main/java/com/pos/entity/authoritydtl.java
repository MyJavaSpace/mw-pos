package com.pos.entity;

public class authoritydtl extends authoritydtlKey {
    private Integer fiusable;

    private String fsupdatetime;

    private Integer fistatus;

    public Integer getFiusable() {
        return fiusable;
    }

    public void setFiusable(Integer fiusable) {
        this.fiusable = fiusable;
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }
}