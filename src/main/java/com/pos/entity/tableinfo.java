package com.pos.entity;

public class Tableinfo extends TableinfoKey {
    private Integer fisortorder;

    private String fsfoodtradelist;

    public Integer getFisortorder() {
        return fisortorder;
    }

    public void setFisortorder(Integer fisortorder) {
        this.fisortorder = fisortorder;
    }

    public String getFsfoodtradelist() {
        return fsfoodtradelist;
    }

    public void setFsfoodtradelist(String fsfoodtradelist) {
        this.fsfoodtradelist = fsfoodtradelist == null ? null : fsfoodtradelist.trim();
    }
}