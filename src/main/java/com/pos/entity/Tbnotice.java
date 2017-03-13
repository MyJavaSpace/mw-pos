package com.pos.entity;

public class Tbnotice {
    private Integer id;

    private String fsTitle;

    private String fsContent;

    private Integer fiType;

    private Integer fiStatus;

    private String fsCreatUser;

    private String fsCreatTime;

    private String fsShopGUID;

    private String fsUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFsTitle() {
        return fsTitle;
    }

    public void setFsTitle(String fsTitle) {
        this.fsTitle = fsTitle == null ? null : fsTitle.trim();
    }

    public String getFsContent() {
        return fsContent;
    }

    public void setFsContent(String fsContent) {
        this.fsContent = fsContent == null ? null : fsContent.trim();
    }

    public Integer getFiType() {
        return fiType;
    }

    public void setFiType(Integer fiType) {
        this.fiType = fiType;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsCreatUser() {
        return fsCreatUser;
    }

    public void setFsCreatUser(String fsCreatUser) {
        this.fsCreatUser = fsCreatUser == null ? null : fsCreatUser.trim();
    }

    public String getFsCreatTime() {
        return fsCreatTime;
    }

    public void setFsCreatTime(String fsCreatTime) {
        this.fsCreatTime = fsCreatTime == null ? null : fsCreatTime.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }
}