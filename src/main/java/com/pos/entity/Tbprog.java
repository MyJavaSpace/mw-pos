package com.pos.entity;

public class Tbprog {
    private String fsProgId;

    private String fsProgName;

    private Integer fiSortOrder;

    private String fsProgDesc;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsProgLvl;

    private String fsFoodTradeList;

    public String getFsProgId() {
        return fsProgId;
    }

    public void setFsProgId(String fsProgId) {
        this.fsProgId = fsProgId == null ? null : fsProgId.trim();
    }

    public String getFsProgName() {
        return fsProgName;
    }

    public void setFsProgName(String fsProgName) {
        this.fsProgName = fsProgName == null ? null : fsProgName.trim();
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }

    public String getFsProgDesc() {
        return fsProgDesc;
    }

    public void setFsProgDesc(String fsProgDesc) {
        this.fsProgDesc = fsProgDesc == null ? null : fsProgDesc.trim();
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

    public String getFsProgLvl() {
        return fsProgLvl;
    }

    public void setFsProgLvl(String fsProgLvl) {
        this.fsProgLvl = fsProgLvl == null ? null : fsProgLvl.trim();
    }

    public String getFsFoodTradeList() {
        return fsFoodTradeList;
    }

    public void setFsFoodTradeList(String fsFoodTradeList) {
        this.fsFoodTradeList = fsFoodTradeList == null ? null : fsFoodTradeList.trim();
    }
}