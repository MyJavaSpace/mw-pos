package com.pos.entity;

import java.math.BigDecimal;

public class Tbsell extends TbsellKey {
    private String fsSellDate;

    private String fsSellTime;

    private String fsMSectionId;

    private String fsMAreaId;

    private String fsMTableId;

    private String fsMTableName;

    private String fsMealNumber;

    private Integer fiCustSum;

    private String fsCustGUID;

    private String fsCustId;

    private String fsCustName;

    private String fsCustMobile;

    private String fsCardNo;

    private String fsVIPSource;

    private Integer fiIsVIP;

    private String fsSendAddr;

    private String fsSendOnTime;

    private String fsSendUserId;

    private String fsSendUserName;

    private String fsPutUpTime;

    private String fsAssignTime;

    private String fsStaffId;

    private String fsStaffName;

    private Integer fiBillStatus;

    private Integer fiBillKind;

    private Integer fiBillSource;

    private BigDecimal fdSaleAmt;

    private BigDecimal fdDiscountAmt;

    private BigDecimal fdServiceAmt;

    private BigDecimal fdExpAmt;

    private BigDecimal fdPayAmt;

    private BigDecimal fdDiffAmt;

    private BigDecimal fdRealAmt;

    private BigDecimal fdGiftAmt;

    private BigDecimal fdBackAmt;

    private String fsDiscountId;

    private String fsDiscountName;

    private String fsCreditAccountId;

    private String fsCreditAccountName;

    private BigDecimal fdDebtAmt;

    private String fsMasterSellNo;

    private String fsRelationMTable;

    private String fsNote;

    private String fsPrintExpTime;

    private String fsCheckEndTime;

    private Integer fiIsInvoice;

    private String fsInvoiceCls;

    private String fsInvoiceTitle;

    private BigDecimal fdInvoiceAmt;

    private Integer fiPrintTimes_Op;

    private Integer fiPrintTimes_Exp;

    private Integer fiIsVerify;

    private String fsVerifyUserName;

    private String fsVerifyTime;

    private Integer fiModifyTag;

    private Integer fiReCheckTag;

    private String fsHostId;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsUpdateTime;

    private String fsBillSourceId;

    private String fsBillSourceName;

    private String fsBillSourceNo;

    private BigDecimal fdDisExpAmt;

    private BigDecimal fdRoundAmt;

    private BigDecimal fdFreeSveAmt;

    private String fsFreeSveAmtUserId;

    private String fsFreeSveAmtUserName;

    private String fsReCheckUserId;

    private String fsReCheckUserName;

    private String fsReCheckReason;

    private String fsDataSrckind;

    private String fsSrcVerno;

    private BigDecimal fdGiftRoundAmt;

    private BigDecimal fdDiscountRoundAmt;

    private BigDecimal fdBackRoundAmt;

    private BigDecimal fdServiceRoundAmt;

    private BigDecimal fdSaleRoundAmt;

    private BigDecimal fdGiftQty;

    private BigDecimal fdBackQty;

    private Integer lver;

    public String getFsSellDate() {
        return fsSellDate;
    }

    public void setFsSellDate(String fsSellDate) {
        this.fsSellDate = fsSellDate == null ? null : fsSellDate.trim();
    }

    public String getFsSellTime() {
        return fsSellTime;
    }

    public void setFsSellTime(String fsSellTime) {
        this.fsSellTime = fsSellTime == null ? null : fsSellTime.trim();
    }

    public String getFsMSectionId() {
        return fsMSectionId;
    }

    public void setFsMSectionId(String fsMSectionId) {
        this.fsMSectionId = fsMSectionId == null ? null : fsMSectionId.trim();
    }

    public String getFsMAreaId() {
        return fsMAreaId;
    }

    public void setFsMAreaId(String fsMAreaId) {
        this.fsMAreaId = fsMAreaId == null ? null : fsMAreaId.trim();
    }

    public String getFsMTableId() {
        return fsMTableId;
    }

    public void setFsMTableId(String fsMTableId) {
        this.fsMTableId = fsMTableId == null ? null : fsMTableId.trim();
    }

    public String getFsMTableName() {
        return fsMTableName;
    }

    public void setFsMTableName(String fsMTableName) {
        this.fsMTableName = fsMTableName == null ? null : fsMTableName.trim();
    }

    public String getFsMealNumber() {
        return fsMealNumber;
    }

    public void setFsMealNumber(String fsMealNumber) {
        this.fsMealNumber = fsMealNumber == null ? null : fsMealNumber.trim();
    }

    public Integer getFiCustSum() {
        return fiCustSum;
    }

    public void setFiCustSum(Integer fiCustSum) {
        this.fiCustSum = fiCustSum;
    }

    public String getFsCustGUID() {
        return fsCustGUID;
    }

    public void setFsCustGUID(String fsCustGUID) {
        this.fsCustGUID = fsCustGUID == null ? null : fsCustGUID.trim();
    }

    public String getFsCustId() {
        return fsCustId;
    }

    public void setFsCustId(String fsCustId) {
        this.fsCustId = fsCustId == null ? null : fsCustId.trim();
    }

    public String getFsCustName() {
        return fsCustName;
    }

    public void setFsCustName(String fsCustName) {
        this.fsCustName = fsCustName == null ? null : fsCustName.trim();
    }

    public String getFsCustMobile() {
        return fsCustMobile;
    }

    public void setFsCustMobile(String fsCustMobile) {
        this.fsCustMobile = fsCustMobile == null ? null : fsCustMobile.trim();
    }

    public String getFsCardNo() {
        return fsCardNo;
    }

    public void setFsCardNo(String fsCardNo) {
        this.fsCardNo = fsCardNo == null ? null : fsCardNo.trim();
    }

    public String getFsVIPSource() {
        return fsVIPSource;
    }

    public void setFsVIPSource(String fsVIPSource) {
        this.fsVIPSource = fsVIPSource == null ? null : fsVIPSource.trim();
    }

    public Integer getFiIsVIP() {
        return fiIsVIP;
    }

    public void setFiIsVIP(Integer fiIsVIP) {
        this.fiIsVIP = fiIsVIP;
    }

    public String getFsSendAddr() {
        return fsSendAddr;
    }

    public void setFsSendAddr(String fsSendAddr) {
        this.fsSendAddr = fsSendAddr == null ? null : fsSendAddr.trim();
    }

    public String getFsSendOnTime() {
        return fsSendOnTime;
    }

    public void setFsSendOnTime(String fsSendOnTime) {
        this.fsSendOnTime = fsSendOnTime == null ? null : fsSendOnTime.trim();
    }

    public String getFsSendUserId() {
        return fsSendUserId;
    }

    public void setFsSendUserId(String fsSendUserId) {
        this.fsSendUserId = fsSendUserId == null ? null : fsSendUserId.trim();
    }

    public String getFsSendUserName() {
        return fsSendUserName;
    }

    public void setFsSendUserName(String fsSendUserName) {
        this.fsSendUserName = fsSendUserName == null ? null : fsSendUserName.trim();
    }

    public String getFsPutUpTime() {
        return fsPutUpTime;
    }

    public void setFsPutUpTime(String fsPutUpTime) {
        this.fsPutUpTime = fsPutUpTime == null ? null : fsPutUpTime.trim();
    }

    public String getFsAssignTime() {
        return fsAssignTime;
    }

    public void setFsAssignTime(String fsAssignTime) {
        this.fsAssignTime = fsAssignTime == null ? null : fsAssignTime.trim();
    }

    public String getFsStaffId() {
        return fsStaffId;
    }

    public void setFsStaffId(String fsStaffId) {
        this.fsStaffId = fsStaffId == null ? null : fsStaffId.trim();
    }

    public String getFsStaffName() {
        return fsStaffName;
    }

    public void setFsStaffName(String fsStaffName) {
        this.fsStaffName = fsStaffName == null ? null : fsStaffName.trim();
    }

    public Integer getFiBillStatus() {
        return fiBillStatus;
    }

    public void setFiBillStatus(Integer fiBillStatus) {
        this.fiBillStatus = fiBillStatus;
    }

    public Integer getFiBillKind() {
        return fiBillKind;
    }

    public void setFiBillKind(Integer fiBillKind) {
        this.fiBillKind = fiBillKind;
    }

    public Integer getFiBillSource() {
        return fiBillSource;
    }

    public void setFiBillSource(Integer fiBillSource) {
        this.fiBillSource = fiBillSource;
    }

    public BigDecimal getFdSaleAmt() {
        return fdSaleAmt;
    }

    public void setFdSaleAmt(BigDecimal fdSaleAmt) {
        this.fdSaleAmt = fdSaleAmt;
    }

    public BigDecimal getFdDiscountAmt() {
        return fdDiscountAmt;
    }

    public void setFdDiscountAmt(BigDecimal fdDiscountAmt) {
        this.fdDiscountAmt = fdDiscountAmt;
    }

    public BigDecimal getFdServiceAmt() {
        return fdServiceAmt;
    }

    public void setFdServiceAmt(BigDecimal fdServiceAmt) {
        this.fdServiceAmt = fdServiceAmt;
    }

    public BigDecimal getFdExpAmt() {
        return fdExpAmt;
    }

    public void setFdExpAmt(BigDecimal fdExpAmt) {
        this.fdExpAmt = fdExpAmt;
    }

    public BigDecimal getFdPayAmt() {
        return fdPayAmt;
    }

    public void setFdPayAmt(BigDecimal fdPayAmt) {
        this.fdPayAmt = fdPayAmt;
    }

    public BigDecimal getFdDiffAmt() {
        return fdDiffAmt;
    }

    public void setFdDiffAmt(BigDecimal fdDiffAmt) {
        this.fdDiffAmt = fdDiffAmt;
    }

    public BigDecimal getFdRealAmt() {
        return fdRealAmt;
    }

    public void setFdRealAmt(BigDecimal fdRealAmt) {
        this.fdRealAmt = fdRealAmt;
    }

    public BigDecimal getFdGiftAmt() {
        return fdGiftAmt;
    }

    public void setFdGiftAmt(BigDecimal fdGiftAmt) {
        this.fdGiftAmt = fdGiftAmt;
    }

    public BigDecimal getFdBackAmt() {
        return fdBackAmt;
    }

    public void setFdBackAmt(BigDecimal fdBackAmt) {
        this.fdBackAmt = fdBackAmt;
    }

    public String getFsDiscountId() {
        return fsDiscountId;
    }

    public void setFsDiscountId(String fsDiscountId) {
        this.fsDiscountId = fsDiscountId == null ? null : fsDiscountId.trim();
    }

    public String getFsDiscountName() {
        return fsDiscountName;
    }

    public void setFsDiscountName(String fsDiscountName) {
        this.fsDiscountName = fsDiscountName == null ? null : fsDiscountName.trim();
    }

    public String getFsCreditAccountId() {
        return fsCreditAccountId;
    }

    public void setFsCreditAccountId(String fsCreditAccountId) {
        this.fsCreditAccountId = fsCreditAccountId == null ? null : fsCreditAccountId.trim();
    }

    public String getFsCreditAccountName() {
        return fsCreditAccountName;
    }

    public void setFsCreditAccountName(String fsCreditAccountName) {
        this.fsCreditAccountName = fsCreditAccountName == null ? null : fsCreditAccountName.trim();
    }

    public BigDecimal getFdDebtAmt() {
        return fdDebtAmt;
    }

    public void setFdDebtAmt(BigDecimal fdDebtAmt) {
        this.fdDebtAmt = fdDebtAmt;
    }

    public String getFsMasterSellNo() {
        return fsMasterSellNo;
    }

    public void setFsMasterSellNo(String fsMasterSellNo) {
        this.fsMasterSellNo = fsMasterSellNo == null ? null : fsMasterSellNo.trim();
    }

    public String getFsRelationMTable() {
        return fsRelationMTable;
    }

    public void setFsRelationMTable(String fsRelationMTable) {
        this.fsRelationMTable = fsRelationMTable == null ? null : fsRelationMTable.trim();
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public String getFsPrintExpTime() {
        return fsPrintExpTime;
    }

    public void setFsPrintExpTime(String fsPrintExpTime) {
        this.fsPrintExpTime = fsPrintExpTime == null ? null : fsPrintExpTime.trim();
    }

    public String getFsCheckEndTime() {
        return fsCheckEndTime;
    }

    public void setFsCheckEndTime(String fsCheckEndTime) {
        this.fsCheckEndTime = fsCheckEndTime == null ? null : fsCheckEndTime.trim();
    }

    public Integer getFiIsInvoice() {
        return fiIsInvoice;
    }

    public void setFiIsInvoice(Integer fiIsInvoice) {
        this.fiIsInvoice = fiIsInvoice;
    }

    public String getFsInvoiceCls() {
        return fsInvoiceCls;
    }

    public void setFsInvoiceCls(String fsInvoiceCls) {
        this.fsInvoiceCls = fsInvoiceCls == null ? null : fsInvoiceCls.trim();
    }

    public String getFsInvoiceTitle() {
        return fsInvoiceTitle;
    }

    public void setFsInvoiceTitle(String fsInvoiceTitle) {
        this.fsInvoiceTitle = fsInvoiceTitle == null ? null : fsInvoiceTitle.trim();
    }

    public BigDecimal getFdInvoiceAmt() {
        return fdInvoiceAmt;
    }

    public void setFdInvoiceAmt(BigDecimal fdInvoiceAmt) {
        this.fdInvoiceAmt = fdInvoiceAmt;
    }

    public Integer getFiPrintTimes_Op() {
        return fiPrintTimes_Op;
    }

    public void setFiPrintTimes_Op(Integer fiPrintTimes_Op) {
        this.fiPrintTimes_Op = fiPrintTimes_Op;
    }

    public Integer getFiPrintTimes_Exp() {
        return fiPrintTimes_Exp;
    }

    public void setFiPrintTimes_Exp(Integer fiPrintTimes_Exp) {
        this.fiPrintTimes_Exp = fiPrintTimes_Exp;
    }

    public Integer getFiIsVerify() {
        return fiIsVerify;
    }

    public void setFiIsVerify(Integer fiIsVerify) {
        this.fiIsVerify = fiIsVerify;
    }

    public String getFsVerifyUserName() {
        return fsVerifyUserName;
    }

    public void setFsVerifyUserName(String fsVerifyUserName) {
        this.fsVerifyUserName = fsVerifyUserName == null ? null : fsVerifyUserName.trim();
    }

    public String getFsVerifyTime() {
        return fsVerifyTime;
    }

    public void setFsVerifyTime(String fsVerifyTime) {
        this.fsVerifyTime = fsVerifyTime == null ? null : fsVerifyTime.trim();
    }

    public Integer getFiModifyTag() {
        return fiModifyTag;
    }

    public void setFiModifyTag(Integer fiModifyTag) {
        this.fiModifyTag = fiModifyTag;
    }

    public Integer getFiReCheckTag() {
        return fiReCheckTag;
    }

    public void setFiReCheckTag(Integer fiReCheckTag) {
        this.fiReCheckTag = fiReCheckTag;
    }

    public String getFsHostId() {
        return fsHostId;
    }

    public void setFsHostId(String fsHostId) {
        this.fsHostId = fsHostId == null ? null : fsHostId.trim();
    }

    public String getFsCreateTime() {
        return fsCreateTime;
    }

    public void setFsCreateTime(String fsCreateTime) {
        this.fsCreateTime = fsCreateTime == null ? null : fsCreateTime.trim();
    }

    public String getFsCreateUserId() {
        return fsCreateUserId;
    }

    public void setFsCreateUserId(String fsCreateUserId) {
        this.fsCreateUserId = fsCreateUserId == null ? null : fsCreateUserId.trim();
    }

    public String getFsCreateUserName() {
        return fsCreateUserName;
    }

    public void setFsCreateUserName(String fsCreateUserName) {
        this.fsCreateUserName = fsCreateUserName == null ? null : fsCreateUserName.trim();
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsBillSourceId() {
        return fsBillSourceId;
    }

    public void setFsBillSourceId(String fsBillSourceId) {
        this.fsBillSourceId = fsBillSourceId == null ? null : fsBillSourceId.trim();
    }

    public String getFsBillSourceName() {
        return fsBillSourceName;
    }

    public void setFsBillSourceName(String fsBillSourceName) {
        this.fsBillSourceName = fsBillSourceName == null ? null : fsBillSourceName.trim();
    }

    public String getFsBillSourceNo() {
        return fsBillSourceNo;
    }

    public void setFsBillSourceNo(String fsBillSourceNo) {
        this.fsBillSourceNo = fsBillSourceNo == null ? null : fsBillSourceNo.trim();
    }

    public BigDecimal getFdDisExpAmt() {
        return fdDisExpAmt;
    }

    public void setFdDisExpAmt(BigDecimal fdDisExpAmt) {
        this.fdDisExpAmt = fdDisExpAmt;
    }

    public BigDecimal getFdRoundAmt() {
        return fdRoundAmt;
    }

    public void setFdRoundAmt(BigDecimal fdRoundAmt) {
        this.fdRoundAmt = fdRoundAmt;
    }

    public BigDecimal getFdFreeSveAmt() {
        return fdFreeSveAmt;
    }

    public void setFdFreeSveAmt(BigDecimal fdFreeSveAmt) {
        this.fdFreeSveAmt = fdFreeSveAmt;
    }

    public String getFsFreeSveAmtUserId() {
        return fsFreeSveAmtUserId;
    }

    public void setFsFreeSveAmtUserId(String fsFreeSveAmtUserId) {
        this.fsFreeSveAmtUserId = fsFreeSveAmtUserId == null ? null : fsFreeSveAmtUserId.trim();
    }

    public String getFsFreeSveAmtUserName() {
        return fsFreeSveAmtUserName;
    }

    public void setFsFreeSveAmtUserName(String fsFreeSveAmtUserName) {
        this.fsFreeSveAmtUserName = fsFreeSveAmtUserName == null ? null : fsFreeSveAmtUserName.trim();
    }

    public String getFsReCheckUserId() {
        return fsReCheckUserId;
    }

    public void setFsReCheckUserId(String fsReCheckUserId) {
        this.fsReCheckUserId = fsReCheckUserId == null ? null : fsReCheckUserId.trim();
    }

    public String getFsReCheckUserName() {
        return fsReCheckUserName;
    }

    public void setFsReCheckUserName(String fsReCheckUserName) {
        this.fsReCheckUserName = fsReCheckUserName == null ? null : fsReCheckUserName.trim();
    }

    public String getFsReCheckReason() {
        return fsReCheckReason;
    }

    public void setFsReCheckReason(String fsReCheckReason) {
        this.fsReCheckReason = fsReCheckReason == null ? null : fsReCheckReason.trim();
    }

    public String getFsDataSrckind() {
        return fsDataSrckind;
    }

    public void setFsDataSrckind(String fsDataSrckind) {
        this.fsDataSrckind = fsDataSrckind == null ? null : fsDataSrckind.trim();
    }

    public String getFsSrcVerno() {
        return fsSrcVerno;
    }

    public void setFsSrcVerno(String fsSrcVerno) {
        this.fsSrcVerno = fsSrcVerno == null ? null : fsSrcVerno.trim();
    }

    public BigDecimal getFdGiftRoundAmt() {
        return fdGiftRoundAmt;
    }

    public void setFdGiftRoundAmt(BigDecimal fdGiftRoundAmt) {
        this.fdGiftRoundAmt = fdGiftRoundAmt;
    }

    public BigDecimal getFdDiscountRoundAmt() {
        return fdDiscountRoundAmt;
    }

    public void setFdDiscountRoundAmt(BigDecimal fdDiscountRoundAmt) {
        this.fdDiscountRoundAmt = fdDiscountRoundAmt;
    }

    public BigDecimal getFdBackRoundAmt() {
        return fdBackRoundAmt;
    }

    public void setFdBackRoundAmt(BigDecimal fdBackRoundAmt) {
        this.fdBackRoundAmt = fdBackRoundAmt;
    }

    public BigDecimal getFdServiceRoundAmt() {
        return fdServiceRoundAmt;
    }

    public void setFdServiceRoundAmt(BigDecimal fdServiceRoundAmt) {
        this.fdServiceRoundAmt = fdServiceRoundAmt;
    }

    public BigDecimal getFdSaleRoundAmt() {
        return fdSaleRoundAmt;
    }

    public void setFdSaleRoundAmt(BigDecimal fdSaleRoundAmt) {
        this.fdSaleRoundAmt = fdSaleRoundAmt;
    }

    public BigDecimal getFdGiftQty() {
        return fdGiftQty;
    }

    public void setFdGiftQty(BigDecimal fdGiftQty) {
        this.fdGiftQty = fdGiftQty;
    }

    public BigDecimal getFdBackQty() {
        return fdBackQty;
    }

    public void setFdBackQty(BigDecimal fdBackQty) {
        this.fdBackQty = fdBackQty;
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}