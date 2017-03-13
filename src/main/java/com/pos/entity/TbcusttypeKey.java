package com.pos.entity;

public class TbcusttypeKey {
    private String fsCompanyGUID;

    private String fsCustTypeId;

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsCustTypeId() {
        return fsCustTypeId;
    }

    public void setFsCustTypeId(String fsCustTypeId) {
        this.fsCustTypeId = fsCustTypeId == null ? null : fsCustTypeId.trim();
    }
}