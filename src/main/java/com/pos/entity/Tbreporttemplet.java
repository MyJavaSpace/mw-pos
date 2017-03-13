package com.pos.entity;

public class Tbreporttemplet extends TbreporttempletKey {
    private String fsReportTempletName;

    private String fsReportTempletDesc;

    private Integer fiPaperSize;

    private String fsRptFile;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private String fsFoodTradeId;

    public String getFsReportTempletName() {
        return fsReportTempletName;
    }

    public void setFsReportTempletName(String fsReportTempletName) {
        this.fsReportTempletName = fsReportTempletName == null ? null : fsReportTempletName.trim();
    }

    public String getFsReportTempletDesc() {
        return fsReportTempletDesc;
    }

    public void setFsReportTempletDesc(String fsReportTempletDesc) {
        this.fsReportTempletDesc = fsReportTempletDesc == null ? null : fsReportTempletDesc.trim();
    }

    public Integer getFiPaperSize() {
        return fiPaperSize;
    }

    public void setFiPaperSize(Integer fiPaperSize) {
        this.fiPaperSize = fiPaperSize;
    }

    public String getFsRptFile() {
        return fsRptFile;
    }

    public void setFsRptFile(String fsRptFile) {
        this.fsRptFile = fsRptFile == null ? null : fsRptFile.trim();
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

    public String getFsFoodTradeId() {
        return fsFoodTradeId;
    }

    public void setFsFoodTradeId(String fsFoodTradeId) {
        this.fsFoodTradeId = fsFoodTradeId == null ? null : fsFoodTradeId.trim();
    }
}