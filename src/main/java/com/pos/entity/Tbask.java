package com.pos.entity;

import java.math.BigDecimal;

public class Tbask extends TbaskKey {
    private String fsAskGpId;

    private String fsAskName;

    private BigDecimal fdAddPrice;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiItemCd;

    private Integer fiStatus;

    public String getFsAskGpId() {
        return fsAskGpId;
    }

    public void setFsAskGpId(String fsAskGpId) {
        this.fsAskGpId = fsAskGpId == null ? null : fsAskGpId.trim();
    }

    public String getFsAskName() {
        return fsAskName;
    }

    public void setFsAskName(String fsAskName) {
        this.fsAskName = fsAskName == null ? null : fsAskName.trim();
    }

    public BigDecimal getFdAddPrice() {
        return fdAddPrice;
    }

    public void setFdAddPrice(BigDecimal fdAddPrice) {
        this.fdAddPrice = fdAddPrice;
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

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}