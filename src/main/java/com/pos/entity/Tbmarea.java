package com.pos.entity;

public class Tbmarea extends TbmareaKey {
    private String fsMAreaName;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsPrinterName;

    private Integer fiSortOrder;

    public String getFsMAreaName() {
        return fsMAreaName;
    }

    public void setFsMAreaName(String fsMAreaName) {
        this.fsMAreaName = fsMAreaName == null ? null : fsMAreaName.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public String getFsPrinterName() {
        return fsPrinterName;
    }

    public void setFsPrinterName(String fsPrinterName) {
        this.fsPrinterName = fsPrinterName == null ? null : fsPrinterName.trim();
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }
}