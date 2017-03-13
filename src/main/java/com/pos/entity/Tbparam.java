package com.pos.entity;

public class Tbparam {
    private String fsParamId;

    private String fsParamName;

    private String fsNote;

    private String fsUpdateTime;

    private Integer fiParamCls;

    private String fsFoodTradeList;

    public String getFsParamId() {
        return fsParamId;
    }

    public void setFsParamId(String fsParamId) {
        this.fsParamId = fsParamId == null ? null : fsParamId.trim();
    }

    public String getFsParamName() {
        return fsParamName;
    }

    public void setFsParamName(String fsParamName) {
        this.fsParamName = fsParamName == null ? null : fsParamName.trim();
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public Integer getFiParamCls() {
        return fiParamCls;
    }

    public void setFiParamCls(Integer fiParamCls) {
        this.fiParamCls = fiParamCls;
    }

    public String getFsFoodTradeList() {
        return fsFoodTradeList;
    }

    public void setFsFoodTradeList(String fsFoodTradeList) {
        this.fsFoodTradeList = fsFoodTradeList == null ? null : fsFoodTradeList.trim();
    }
}