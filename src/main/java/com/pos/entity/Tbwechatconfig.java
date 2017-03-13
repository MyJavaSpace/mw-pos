package com.pos.entity;

import java.math.BigDecimal;

public class Tbwechatconfig {
    private String fsId;

    private BigDecimal fdDeliverFee;

    private BigDecimal fdOrderMoney;

    private String fsShopGUID;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsId() {
        return fsId;
    }

    public void setFsId(String fsId) {
        this.fsId = fsId == null ? null : fsId.trim();
    }

    public BigDecimal getFdDeliverFee() {
        return fdDeliverFee;
    }

    public void setFdDeliverFee(BigDecimal fdDeliverFee) {
        this.fdDeliverFee = fdDeliverFee;
    }

    public BigDecimal getFdOrderMoney() {
        return fdOrderMoney;
    }

    public void setFdOrderMoney(BigDecimal fdOrderMoney) {
        this.fdOrderMoney = fdOrderMoney;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
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