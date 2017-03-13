package com.pos.entity;

public class TbviplvlKey {
    private String fsCompanyGUID;

    private String fsVIPLvlId;

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsVIPLvlId() {
        return fsVIPLvlId;
    }

    public void setFsVIPLvlId(String fsVIPLvlId) {
        this.fsVIPLvlId = fsVIPLvlId == null ? null : fsVIPLvlId.trim();
    }
}