package com.pos.entity;

import java.math.BigDecimal;

public class Tbpayment extends TbpaymentKey {
    private String fsPaymentTypeId;

    private String fsPaymentName;

    private BigDecimal fdDefaultPrice;

    private Integer fiIsForeign;

    private BigDecimal fdExchangeRate;

    private Integer fiIsCalcPaid;

    private Integer fiIsCalcInvoice;

    private Integer fiIsPremium;

    private String fsNote;

    private Integer fiSortOrder;

    private Integer fiStatus;

    private Integer fiDataKind;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private BigDecimal fdDiscountRate;

    private String fsColor;

    private String fsShortcutKey;

    private String fsHelpCode;

    private String fsDiscountPaymentId;

    private Integer fiIsPartAmtDiscount;

    private Integer fiIsEffectiveDate;

    private String fsStarDate;

    private String fsEndDate;

    public String getFsPaymentTypeId() {
        return fsPaymentTypeId;
    }

    public void setFsPaymentTypeId(String fsPaymentTypeId) {
        this.fsPaymentTypeId = fsPaymentTypeId == null ? null : fsPaymentTypeId.trim();
    }

    public String getFsPaymentName() {
        return fsPaymentName;
    }

    public void setFsPaymentName(String fsPaymentName) {
        this.fsPaymentName = fsPaymentName == null ? null : fsPaymentName.trim();
    }

    public BigDecimal getFdDefaultPrice() {
        return fdDefaultPrice;
    }

    public void setFdDefaultPrice(BigDecimal fdDefaultPrice) {
        this.fdDefaultPrice = fdDefaultPrice;
    }

    public Integer getFiIsForeign() {
        return fiIsForeign;
    }

    public void setFiIsForeign(Integer fiIsForeign) {
        this.fiIsForeign = fiIsForeign;
    }

    public BigDecimal getFdExchangeRate() {
        return fdExchangeRate;
    }

    public void setFdExchangeRate(BigDecimal fdExchangeRate) {
        this.fdExchangeRate = fdExchangeRate;
    }

    public Integer getFiIsCalcPaid() {
        return fiIsCalcPaid;
    }

    public void setFiIsCalcPaid(Integer fiIsCalcPaid) {
        this.fiIsCalcPaid = fiIsCalcPaid;
    }

    public Integer getFiIsCalcInvoice() {
        return fiIsCalcInvoice;
    }

    public void setFiIsCalcInvoice(Integer fiIsCalcInvoice) {
        this.fiIsCalcInvoice = fiIsCalcInvoice;
    }

    public Integer getFiIsPremium() {
        return fiIsPremium;
    }

    public void setFiIsPremium(Integer fiIsPremium) {
        this.fiIsPremium = fiIsPremium;
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
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

    public BigDecimal getFdDiscountRate() {
        return fdDiscountRate;
    }

    public void setFdDiscountRate(BigDecimal fdDiscountRate) {
        this.fdDiscountRate = fdDiscountRate;
    }

    public String getFsColor() {
        return fsColor;
    }

    public void setFsColor(String fsColor) {
        this.fsColor = fsColor == null ? null : fsColor.trim();
    }

    public String getFsShortcutKey() {
        return fsShortcutKey;
    }

    public void setFsShortcutKey(String fsShortcutKey) {
        this.fsShortcutKey = fsShortcutKey == null ? null : fsShortcutKey.trim();
    }

    public String getFsHelpCode() {
        return fsHelpCode;
    }

    public void setFsHelpCode(String fsHelpCode) {
        this.fsHelpCode = fsHelpCode == null ? null : fsHelpCode.trim();
    }

    public String getFsDiscountPaymentId() {
        return fsDiscountPaymentId;
    }

    public void setFsDiscountPaymentId(String fsDiscountPaymentId) {
        this.fsDiscountPaymentId = fsDiscountPaymentId == null ? null : fsDiscountPaymentId.trim();
    }

    public Integer getFiIsPartAmtDiscount() {
        return fiIsPartAmtDiscount;
    }

    public void setFiIsPartAmtDiscount(Integer fiIsPartAmtDiscount) {
        this.fiIsPartAmtDiscount = fiIsPartAmtDiscount;
    }

    public Integer getFiIsEffectiveDate() {
        return fiIsEffectiveDate;
    }

    public void setFiIsEffectiveDate(Integer fiIsEffectiveDate) {
        this.fiIsEffectiveDate = fiIsEffectiveDate;
    }

    public String getFsStarDate() {
        return fsStarDate;
    }

    public void setFsStarDate(String fsStarDate) {
        this.fsStarDate = fsStarDate == null ? null : fsStarDate.trim();
    }

    public String getFsEndDate() {
        return fsEndDate;
    }

    public void setFsEndDate(String fsEndDate) {
        this.fsEndDate = fsEndDate == null ? null : fsEndDate.trim();
    }
}