package com.pos.entity;

public class Tbauthoritydtl extends TbauthoritydtlKey {
    private Integer fiUsable;

    private String fsUpdateTime;

    private Integer fiStatus;

    public Integer getFiUsable() {
        return fiUsable;
    }

    public void setFiUsable(Integer fiUsable) {
        this.fiUsable = fiUsable;
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}