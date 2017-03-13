package com.pos.entity;

public class TbreportKey {
    private String fsReportId;

    private String fsShopGUID;

    public String getFsReportId() {
        return fsReportId;
    }

    public void setFsReportId(String fsReportId) {
        this.fsReportId = fsReportId == null ? null : fsReportId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}