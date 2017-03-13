package com.pos.entity;

public class TbprinttaskWithBLOBs extends Tbprinttask {
    private String fsPrnData;

    private String fsPrnData2;

    public String getFsPrnData() {
        return fsPrnData;
    }

    public void setFsPrnData(String fsPrnData) {
        this.fsPrnData = fsPrnData == null ? null : fsPrnData.trim();
    }

    public String getFsPrnData2() {
        return fsPrnData2;
    }

    public void setFsPrnData2(String fsPrnData2) {
        this.fsPrnData2 = fsPrnData2 == null ? null : fsPrnData2.trim();
    }
}