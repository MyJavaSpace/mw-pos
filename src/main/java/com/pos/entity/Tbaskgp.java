package com.pos.entity;

public class Tbaskgp extends TbaskgpKey {
    private String fsAskGpName;

    private Integer fiStatus;

    private Integer fiSortOrder;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiDataKind;

    private Integer fiIsSelect;

    private Integer fiChooseType;

    public String getFsAskGpName() {
        return fsAskGpName;
    }

    public void setFsAskGpName(String fsAskGpName) {
        this.fsAskGpName = fsAskGpName == null ? null : fsAskGpName.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
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

    public Integer getFiDataKind() {
        return fiDataKind;
    }

    public void setFiDataKind(Integer fiDataKind) {
        this.fiDataKind = fiDataKind;
    }

    public Integer getFiIsSelect() {
        return fiIsSelect;
    }

    public void setFiIsSelect(Integer fiIsSelect) {
        this.fiIsSelect = fiIsSelect;
    }

    public Integer getFiChooseType() {
        return fiChooseType;
    }

    public void setFiChooseType(Integer fiChooseType) {
        this.fiChooseType = fiChooseType;
    }
}