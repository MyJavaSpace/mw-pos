package com.pos.entity;

public class Tbwebmenu {
    private Integer fiMenuID;

    private String fsMenuName;

    private Integer fiParentId;

    private String fsMenuUrl;

    private String fsMpath;

    private Integer fiGroupID;

    private Integer fiSort;

    private String fsFoodTradeId;

    private Integer fiShopKind;

    private String fsMenuControlID;

    private String fsOnclick;

    private String fsiconCls;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public Integer getFiMenuID() {
        return fiMenuID;
    }

    public void setFiMenuID(Integer fiMenuID) {
        this.fiMenuID = fiMenuID;
    }

    public String getFsMenuName() {
        return fsMenuName;
    }

    public void setFsMenuName(String fsMenuName) {
        this.fsMenuName = fsMenuName == null ? null : fsMenuName.trim();
    }

    public Integer getFiParentId() {
        return fiParentId;
    }

    public void setFiParentId(Integer fiParentId) {
        this.fiParentId = fiParentId;
    }

    public String getFsMenuUrl() {
        return fsMenuUrl;
    }

    public void setFsMenuUrl(String fsMenuUrl) {
        this.fsMenuUrl = fsMenuUrl == null ? null : fsMenuUrl.trim();
    }

    public String getFsMpath() {
        return fsMpath;
    }

    public void setFsMpath(String fsMpath) {
        this.fsMpath = fsMpath == null ? null : fsMpath.trim();
    }

    public Integer getFiGroupID() {
        return fiGroupID;
    }

    public void setFiGroupID(Integer fiGroupID) {
        this.fiGroupID = fiGroupID;
    }

    public Integer getFiSort() {
        return fiSort;
    }

    public void setFiSort(Integer fiSort) {
        this.fiSort = fiSort;
    }

    public String getFsFoodTradeId() {
        return fsFoodTradeId;
    }

    public void setFsFoodTradeId(String fsFoodTradeId) {
        this.fsFoodTradeId = fsFoodTradeId == null ? null : fsFoodTradeId.trim();
    }

    public Integer getFiShopKind() {
        return fiShopKind;
    }

    public void setFiShopKind(Integer fiShopKind) {
        this.fiShopKind = fiShopKind;
    }

    public String getFsMenuControlID() {
        return fsMenuControlID;
    }

    public void setFsMenuControlID(String fsMenuControlID) {
        this.fsMenuControlID = fsMenuControlID == null ? null : fsMenuControlID.trim();
    }

    public String getFsOnclick() {
        return fsOnclick;
    }

    public void setFsOnclick(String fsOnclick) {
        this.fsOnclick = fsOnclick == null ? null : fsOnclick.trim();
    }

    public String getFsiconCls() {
        return fsiconCls;
    }

    public void setFsiconCls(String fsiconCls) {
        this.fsiconCls = fsiconCls == null ? null : fsiconCls.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
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
}