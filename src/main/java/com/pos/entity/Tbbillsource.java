package com.pos.entity;

public class Tbbillsource extends TbbillsourceKey {
    private String fsBillSourceName;

    private Integer fiStatus;

    private Integer fiDataKind;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiBillSource;

    private Integer fiMessageNotice;

    private Integer fiVoiceNotice;

    public String getFsBillSourceName() {
        return fsBillSourceName;
    }

    public void setFsBillSourceName(String fsBillSourceName) {
        this.fsBillSourceName = fsBillSourceName == null ? null : fsBillSourceName.trim();
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public Integer getFiDataKind() {
        return fiDataKind;
    }

    public void setFiDataKind(Integer fiDataKind) {
        this.fiDataKind = fiDataKind;
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

    public Integer getFiBillSource() {
        return fiBillSource;
    }

    public void setFiBillSource(Integer fiBillSource) {
        this.fiBillSource = fiBillSource;
    }

    public Integer getFiMessageNotice() {
        return fiMessageNotice;
    }

    public void setFiMessageNotice(Integer fiMessageNotice) {
        this.fiMessageNotice = fiMessageNotice;
    }

    public Integer getFiVoiceNotice() {
        return fiVoiceNotice;
    }

    public void setFiVoiceNotice(Integer fiVoiceNotice) {
        this.fiVoiceNotice = fiVoiceNotice;
    }
}