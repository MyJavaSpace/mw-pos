package com.pos.entity;

import java.math.BigDecimal;

public class Tbdeliverer extends TbdelivererKey {
    private String fsDelivererName;

    private Integer fiDeliverertype;

    private String fsDeliverer;

    private String fsCellphone;

    private BigDecimal fdChange;

    private String fsNote;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsDelivererName() {
        return fsDelivererName;
    }

    public void setFsDelivererName(String fsDelivererName) {
        this.fsDelivererName = fsDelivererName == null ? null : fsDelivererName.trim();
    }

    public Integer getFiDeliverertype() {
        return fiDeliverertype;
    }

    public void setFiDeliverertype(Integer fiDeliverertype) {
        this.fiDeliverertype = fiDeliverertype;
    }

    public String getFsDeliverer() {
        return fsDeliverer;
    }

    public void setFsDeliverer(String fsDeliverer) {
        this.fsDeliverer = fsDeliverer == null ? null : fsDeliverer.trim();
    }

    public String getFsCellphone() {
        return fsCellphone;
    }

    public void setFsCellphone(String fsCellphone) {
        this.fsCellphone = fsCellphone == null ? null : fsCellphone.trim();
    }

    public BigDecimal getFdChange() {
        return fdChange;
    }

    public void setFdChange(BigDecimal fdChange) {
        this.fdChange = fdChange;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
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