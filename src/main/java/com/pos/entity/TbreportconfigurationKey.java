package com.pos.entity;

public class TbreportconfigurationKey {
    private String fsConfigurationId;

    private String fsShopGUID;

    public String getFsConfigurationId() {
        return fsConfigurationId;
    }

    public void setFsConfigurationId(String fsConfigurationId) {
        this.fsConfigurationId = fsConfigurationId == null ? null : fsConfigurationId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}