package com.pos.entity;

public class TbreporttempletKey {
    private String fsReportId;

    private String fsReportTempletId;

    private String fsShopGUID;

    public String getFsReportId() {
        return fsReportId;
    }

    public void setFsReportId(String fsReportId) {
        this.fsReportId = fsReportId == null ? null : fsReportId.trim();
    }

    public String getFsReportTempletId() {
        return fsReportTempletId;
    }

    public void setFsReportTempletId(String fsReportTempletId) {
        this.fsReportTempletId = fsReportTempletId == null ? null : fsReportTempletId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}