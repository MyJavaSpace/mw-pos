package com.pos.entity;

public class Tbuseroperationlog {
    private String id;

    private String fsShopGUID;

    private String fsTargetType;

    private String fsTargetName;

    private String fsType;

    private String fsContent;

    private String fsCreateUser;

    private String fsCreateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsTargetType() {
        return fsTargetType;
    }

    public void setFsTargetType(String fsTargetType) {
        this.fsTargetType = fsTargetType == null ? null : fsTargetType.trim();
    }

    public String getFsTargetName() {
        return fsTargetName;
    }

    public void setFsTargetName(String fsTargetName) {
        this.fsTargetName = fsTargetName == null ? null : fsTargetName.trim();
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType == null ? null : fsType.trim();
    }

    public String getFsContent() {
        return fsContent;
    }

    public void setFsContent(String fsContent) {
        this.fsContent = fsContent == null ? null : fsContent.trim();
    }

    public String getFsCreateUser() {
        return fsCreateUser;
    }

    public void setFsCreateUser(String fsCreateUser) {
        this.fsCreateUser = fsCreateUser == null ? null : fsCreateUser.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }
}