package com.pos.entity;

public class Tbmtableste extends TbmtablesteKey {
    private String fsMTableSteName;

    private String fsColor;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsMTableSteName() {
        return fsMTableSteName;
    }

    public void setFsMTableSteName(String fsMTableSteName) {
        this.fsMTableSteName = fsMTableSteName == null ? null : fsMTableSteName.trim();
    }

    public String getFsColor() {
        return fsColor;
    }

    public void setFsColor(String fsColor) {
        this.fsColor = fsColor == null ? null : fsColor.trim();
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
}