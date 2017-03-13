package com.pos.entity;

public class TbcuststeKey {
    private String fsCompanyGUID;

    private String fsCustSteId;

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsCustSteId() {
        return fsCustSteId;
    }

    public void setFsCustSteId(String fsCustSteId) {
        this.fsCustSteId = fsCustSteId == null ? null : fsCustSteId.trim();
    }
}