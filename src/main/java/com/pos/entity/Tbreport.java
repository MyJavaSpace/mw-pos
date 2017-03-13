package com.pos.entity;

public class Tbreport extends TbreportKey {
    private String fsReportName;

    private String fsReportTempletId;

    private String fsNote;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiReportCls;

    private Integer fiStatus;

    private String fsFoodTradeList;

    public String getFsReportName() {
        return fsReportName;
    }

    public void setFsReportName(String fsReportName) {
        this.fsReportName = fsReportName == null ? null : fsReportName.trim();
    }

    public String getFsReportTempletId() {
        return fsReportTempletId;
    }

    public void setFsReportTempletId(String fsReportTempletId) {
        this.fsReportTempletId = fsReportTempletId == null ? null : fsReportTempletId.trim();
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

    public Integer getFiReportCls() {
        return fiReportCls;
    }

    public void setFiReportCls(Integer fiReportCls) {
        this.fiReportCls = fiReportCls;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsFoodTradeList() {
        return fsFoodTradeList;
    }

    public void setFsFoodTradeList(String fsFoodTradeList) {
        this.fsFoodTradeList = fsFoodTradeList == null ? null : fsFoodTradeList.trim();
    }
}