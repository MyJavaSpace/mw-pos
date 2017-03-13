package com.pos.entity;

public class Tbfoodtrade {
    private String fsFoodTradeId;

    private String fsFoodTradeName;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsFoodTradeId() {
        return fsFoodTradeId;
    }

    public void setFsFoodTradeId(String fsFoodTradeId) {
        this.fsFoodTradeId = fsFoodTradeId == null ? null : fsFoodTradeId.trim();
    }

    public String getFsFoodTradeName() {
        return fsFoodTradeName;
    }

    public void setFsFoodTradeName(String fsFoodTradeName) {
        this.fsFoodTradeName = fsFoodTradeName == null ? null : fsFoodTradeName.trim();
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