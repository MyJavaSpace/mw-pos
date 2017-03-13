package com.pos.entity;

public class Tbsetings {
    private String fskey;

    private String fsvalue;

    private String fsreamark;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsShopGUID;

    public String getFskey() {
        return fskey;
    }

    public void setFskey(String fskey) {
        this.fskey = fskey == null ? null : fskey.trim();
    }

    public String getFsvalue() {
        return fsvalue;
    }

    public void setFsvalue(String fsvalue) {
        this.fsvalue = fsvalue == null ? null : fsvalue.trim();
    }

    public String getFsreamark() {
        return fsreamark;
    }

    public void setFsreamark(String fsreamark) {
        this.fsreamark = fsreamark == null ? null : fsreamark.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}