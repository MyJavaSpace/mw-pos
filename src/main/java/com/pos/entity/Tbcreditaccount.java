package com.pos.entity;

import java.math.BigDecimal;

public class Tbcreditaccount extends TbcreditaccountKey {
    private String fsCreditAccountName;

    private BigDecimal fdCreditAmt;

    private BigDecimal fdDebtAmt;

    private String fsContact;

    private String fsCellphoneCt;

    private String fsTelCt;

    private Integer fiImgWidth;

    private Integer fiImgHeight;

    private String fsImageURL;

    private String fsImagePath;

    private String fsNote;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsCreditAccountName() {
        return fsCreditAccountName;
    }

    public void setFsCreditAccountName(String fsCreditAccountName) {
        this.fsCreditAccountName = fsCreditAccountName == null ? null : fsCreditAccountName.trim();
    }

    public BigDecimal getFdCreditAmt() {
        return fdCreditAmt;
    }

    public void setFdCreditAmt(BigDecimal fdCreditAmt) {
        this.fdCreditAmt = fdCreditAmt;
    }

    public BigDecimal getFdDebtAmt() {
        return fdDebtAmt;
    }

    public void setFdDebtAmt(BigDecimal fdDebtAmt) {
        this.fdDebtAmt = fdDebtAmt;
    }

    public String getFsContact() {
        return fsContact;
    }

    public void setFsContact(String fsContact) {
        this.fsContact = fsContact == null ? null : fsContact.trim();
    }

    public String getFsCellphoneCt() {
        return fsCellphoneCt;
    }

    public void setFsCellphoneCt(String fsCellphoneCt) {
        this.fsCellphoneCt = fsCellphoneCt == null ? null : fsCellphoneCt.trim();
    }

    public String getFsTelCt() {
        return fsTelCt;
    }

    public void setFsTelCt(String fsTelCt) {
        this.fsTelCt = fsTelCt == null ? null : fsTelCt.trim();
    }

    public Integer getFiImgWidth() {
        return fiImgWidth;
    }

    public void setFiImgWidth(Integer fiImgWidth) {
        this.fiImgWidth = fiImgWidth;
    }

    public Integer getFiImgHeight() {
        return fiImgHeight;
    }

    public void setFiImgHeight(Integer fiImgHeight) {
        this.fiImgHeight = fiImgHeight;
    }

    public String getFsImageURL() {
        return fsImageURL;
    }

    public void setFsImageURL(String fsImageURL) {
        this.fsImageURL = fsImageURL == null ? null : fsImageURL.trim();
    }

    public String getFsImagePath() {
        return fsImagePath;
    }

    public void setFsImagePath(String fsImagePath) {
        this.fsImagePath = fsImagePath == null ? null : fsImagePath.trim();
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