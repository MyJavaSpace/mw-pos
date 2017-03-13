package com.pos.entity;

public class TbtradeKey {
    private String fsCompanyGUID;

    private String fsTradeId;

    public String getFsCompanyGUID() {
        return fsCompanyGUID;
    }

    public void setFsCompanyGUID(String fsCompanyGUID) {
        this.fsCompanyGUID = fsCompanyGUID == null ? null : fsCompanyGUID.trim();
    }

    public String getFsTradeId() {
        return fsTradeId;
    }

    public void setFsTradeId(String fsTradeId) {
        this.fsTradeId = fsTradeId == null ? null : fsTradeId.trim();
    }
}