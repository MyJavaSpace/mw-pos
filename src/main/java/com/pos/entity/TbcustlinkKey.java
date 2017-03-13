package com.pos.entity;

public class TbcustlinkKey {
    private String fsCustGUID;

    private String fsLinkCustGUID;

    public String getFsCustGUID() {
        return fsCustGUID;
    }

    public void setFsCustGUID(String fsCustGUID) {
        this.fsCustGUID = fsCustGUID == null ? null : fsCustGUID.trim();
    }

    public String getFsLinkCustGUID() {
        return fsLinkCustGUID;
    }

    public void setFsLinkCustGUID(String fsLinkCustGUID) {
        this.fsLinkCustGUID = fsLinkCustGUID == null ? null : fsLinkCustGUID.trim();
    }
}