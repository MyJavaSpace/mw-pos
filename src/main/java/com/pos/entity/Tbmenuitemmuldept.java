package com.pos.entity;

public class Tbmenuitemmuldept extends TbmenuitemmuldeptKey {
    private Integer fiItemCd;

    private String fsDeptId;

    private String fsMAreaId;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public String getFsDeptId() {
        return fsDeptId;
    }

    public void setFsDeptId(String fsDeptId) {
        this.fsDeptId = fsDeptId == null ? null : fsDeptId.trim();
    }

    public String getFsMAreaId() {
        return fsMAreaId;
    }

    public void setFsMAreaId(String fsMAreaId) {
        this.fsMAreaId = fsMAreaId == null ? null : fsMAreaId.trim();
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