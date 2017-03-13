package com.pos.entity;

public class TbcustsurKey {
    private String fsCompanyGUID;

    private String fsCustSurId;

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsCustSurId() {
        return fsCustSurId;
    }

    public void setFsCustSurId(String fsCustSurId) {
        this.fsCustSurId = fsCustSurId == null ? null : fsCustSurId.trim();
    }
}