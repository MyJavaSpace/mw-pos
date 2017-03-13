package com.pos.entity;

public class TbvipdiscountKey {
    private String fsShopGUID;

    private String fsVIPLvlId;

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsVIPLvlId() {
        return fsVIPLvlId;
    }

    public void setFsVIPLvlId(String fsVIPLvlId) {
        this.fsVIPLvlId = fsVIPLvlId == null ? null : fsVIPLvlId.trim();
    }
}