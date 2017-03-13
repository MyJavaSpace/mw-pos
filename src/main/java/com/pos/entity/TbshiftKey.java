package com.pos.entity;

public class TbshiftKey {
    private String fsShiftId;

    private String fsShopGUID;

    public String getFsShiftId() {
        return fsShiftId;
    }

    public void setFsShiftId(String fsShiftId) {
        this.fsShiftId = fsShiftId == null ? null : fsShiftId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}