package com.pos.entity;

public class Tbseqno extends TbseqnoKey {
    private Integer fiSeqNo;

    private String fsUpdateTime;

    private Integer lver;

    public Integer getFiSeqNo() {
        return fiSeqNo;
    }

    public void setFiSeqNo(Integer fiSeqNo) {
        this.fiSeqNo = fiSeqNo;
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}