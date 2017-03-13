package com.pos.entity;

public class Tbwordhouse extends TbwordhouseKey {
    private String fsFieldItem;

    private String fsWord;

    private Integer fiSortOrder;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiStatus;

    public String getFsFieldItem() {
        return fsFieldItem;
    }

    public void setFsFieldItem(String fsFieldItem) {
        this.fsFieldItem = fsFieldItem == null ? null : fsFieldItem.trim();
    }

    public String getFsWord() {
        return fsWord;
    }

    public void setFsWord(String fsWord) {
        this.fsWord = fsWord == null ? null : fsWord.trim();
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
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

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}