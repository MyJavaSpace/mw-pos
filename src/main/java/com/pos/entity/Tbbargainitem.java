package com.pos.entity;

import java.math.BigDecimal;

public class Tbbargainitem extends TbbargainitemKey {
    private BigDecimal fdBargainPrice;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiStatus;

    public BigDecimal getFdBargainPrice() {
        return fdBargainPrice;
    }

    public void setFdBargainPrice(BigDecimal fdBargainPrice) {
        this.fdBargainPrice = fdBargainPrice;
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

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}