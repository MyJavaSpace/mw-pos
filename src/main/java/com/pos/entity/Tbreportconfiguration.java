package com.pos.entity;

public class Tbreportconfiguration extends TbreportconfigurationKey {
    private String fsConfigurationName;

    private String fsConfigurationValue;

    private String fsFoodTradeId;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsConfigurationName() {
        return fsConfigurationName;
    }

    public void setFsConfigurationName(String fsConfigurationName) {
        this.fsConfigurationName = fsConfigurationName == null ? null : fsConfigurationName.trim();
    }

    public String getFsConfigurationValue() {
        return fsConfigurationValue;
    }

    public void setFsConfigurationValue(String fsConfigurationValue) {
        this.fsConfigurationValue = fsConfigurationValue == null ? null : fsConfigurationValue.trim();
    }

    public String getFsFoodTradeId() {
        return fsFoodTradeId;
    }

    public void setFsFoodTradeId(String fsFoodTradeId) {
        this.fsFoodTradeId = fsFoodTradeId == null ? null : fsFoodTradeId.trim();
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