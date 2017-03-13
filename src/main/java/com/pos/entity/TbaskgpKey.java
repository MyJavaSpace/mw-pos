package com.pos.entity;

public class TbaskgpKey {
    private String fsAskGpId;

    private String fsShopGUID;

    public String getFsAskGpId() {
        return fsAskGpId;
    }

    public void setFsAskGpId(String fsAskGpId) {
        this.fsAskGpId = fsAskGpId == null ? null : fsAskGpId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}