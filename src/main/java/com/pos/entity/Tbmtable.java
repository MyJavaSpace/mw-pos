package com.pos.entity;

import java.math.BigDecimal;

public class Tbmtable extends TbmtableKey {
    private String fsMTableName;

    private String fsMTableClsId;

    private BigDecimal fdMTablePrice;

    private String fsMAreaId;

    private Integer fiSeats;

    private String fsSellNo;

    private String fsMTableSteId;

    private Integer fiOccupyFlag;

    private Integer fiWxMsgFlag;

    private String fsQRCode;

    private String fsHint;

    private Integer fiShareBills;

    private Integer fiStatus;

    private String fsCustGUID;

    private String fsCustName;

    private String fsCustMobile;

    private String fsBookingTime;

    private Integer fiOpenJob;

    private String fsOpenUserName;

    private String fsOpenHsTime;

    private Integer fsOrderJob;

    private String fsOrderUserName;

    private String fsOrderHsTime;

    private Integer fiCheckJob;

    private String fsCheckUserName;

    private String fsCheckHsTime;

    private Integer fiChangeJob;

    private String fsChangeUserName;

    private String fsChangeHsTime;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    private Integer fiSortOrder;

    public String getFsMTableName() {
        return fsMTableName;
    }

    public void setFsMTableName(String fsMTableName) {
        this.fsMTableName = fsMTableName == null ? null : fsMTableName.trim();
    }

    public String getFsMTableClsId() {
        return fsMTableClsId;
    }

    public void setFsMTableClsId(String fsMTableClsId) {
        this.fsMTableClsId = fsMTableClsId == null ? null : fsMTableClsId.trim();
    }

    public BigDecimal getFdMTablePrice() {
        return fdMTablePrice;
    }

    public void setFdMTablePrice(BigDecimal fdMTablePrice) {
        this.fdMTablePrice = fdMTablePrice;
    }

    public String getFsMAreaId() {
        return fsMAreaId;
    }

    public void setFsMAreaId(String fsMAreaId) {
        this.fsMAreaId = fsMAreaId == null ? null : fsMAreaId.trim();
    }

    public Integer getFiSeats() {
        return fiSeats;
    }

    public void setFiSeats(Integer fiSeats) {
        this.fiSeats = fiSeats;
    }

    public String getFsSellNo() {
        return fsSellNo;
    }

    public void setFsSellNo(String fsSellNo) {
        this.fsSellNo = fsSellNo == null ? null : fsSellNo.trim();
    }

    public String getFsMTableSteId() {
        return fsMTableSteId;
    }

    public void setFsMTableSteId(String fsMTableSteId) {
        this.fsMTableSteId = fsMTableSteId == null ? null : fsMTableSteId.trim();
    }

    public Integer getFiOccupyFlag() {
        return fiOccupyFlag;
    }

    public void setFiOccupyFlag(Integer fiOccupyFlag) {
        this.fiOccupyFlag = fiOccupyFlag;
    }

    public Integer getFiWxMsgFlag() {
        return fiWxMsgFlag;
    }

    public void setFiWxMsgFlag(Integer fiWxMsgFlag) {
        this.fiWxMsgFlag = fiWxMsgFlag;
    }

    public String getFsQRCode() {
        return fsQRCode;
    }

    public void setFsQRCode(String fsQRCode) {
        this.fsQRCode = fsQRCode == null ? null : fsQRCode.trim();
    }

    public String getFsHint() {
        return fsHint;
    }

    public void setFsHint(String fsHint) {
        this.fsHint = fsHint == null ? null : fsHint.trim();
    }

    public Integer getFiShareBills() {
        return fiShareBills;
    }

    public void setFiShareBills(Integer fiShareBills) {
        this.fiShareBills = fiShareBills;
    }

    public Integer getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }

    public String getFsCustGUID() {
        return fsCustGUID;
    }

    public void setFsCustGUID(String fsCustGUID) {
        this.fsCustGUID = fsCustGUID == null ? null : fsCustGUID.trim();
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

    public String getFsBookingTime() {
        return fsBookingTime;
    }

    public void setFsBookingTime(String fsBookingTime) {
        this.fsBookingTime = fsBookingTime == null ? null : fsBookingTime.trim();
    }

    public Integer getFiOpenJob() {
        return fiOpenJob;
    }

    public void setFiOpenJob(Integer fiOpenJob) {
        this.fiOpenJob = fiOpenJob;
    }

    public String getFsOpenUserName() {
        return fsOpenUserName;
    }

    public void setFsOpenUserName(String fsOpenUserName) {
        this.fsOpenUserName = fsOpenUserName == null ? null : fsOpenUserName.trim();
    }

    public String getFsOpenHsTime() {
        return fsOpenHsTime;
    }

    public void setFsOpenHsTime(String fsOpenHsTime) {
        this.fsOpenHsTime = fsOpenHsTime == null ? null : fsOpenHsTime.trim();
    }

    public Integer getFsOrderJob() {
        return fsOrderJob;
    }

    public void setFsOrderJob(Integer fsOrderJob) {
        this.fsOrderJob = fsOrderJob;
    }

    public String getFsOrderUserName() {
        return fsOrderUserName;
    }

    public void setFsOrderUserName(String fsOrderUserName) {
        this.fsOrderUserName = fsOrderUserName == null ? null : fsOrderUserName.trim();
    }

    public String getFsOrderHsTime() {
        return fsOrderHsTime;
    }

    public void setFsOrderHsTime(String fsOrderHsTime) {
        this.fsOrderHsTime = fsOrderHsTime == null ? null : fsOrderHsTime.trim();
    }

    public Integer getFiCheckJob() {
        return fiCheckJob;
    }

    public void setFiCheckJob(Integer fiCheckJob) {
        this.fiCheckJob = fiCheckJob;
    }

    public String getFsCheckUserName() {
        return fsCheckUserName;
    }

    public void setFsCheckUserName(String fsCheckUserName) {
        this.fsCheckUserName = fsCheckUserName == null ? null : fsCheckUserName.trim();
    }

    public String getFsCheckHsTime() {
        return fsCheckHsTime;
    }

    public void setFsCheckHsTime(String fsCheckHsTime) {
        this.fsCheckHsTime = fsCheckHsTime == null ? null : fsCheckHsTime.trim();
    }

    public Integer getFiChangeJob() {
        return fiChangeJob;
    }

    public void setFiChangeJob(Integer fiChangeJob) {
        this.fiChangeJob = fiChangeJob;
    }

    public String getFsChangeUserName() {
        return fsChangeUserName;
    }

    public void setFsChangeUserName(String fsChangeUserName) {
        this.fsChangeUserName = fsChangeUserName == null ? null : fsChangeUserName.trim();
    }

    public String getFsChangeHsTime() {
        return fsChangeHsTime;
    }

    public void setFsChangeHsTime(String fsChangeHsTime) {
        this.fsChangeHsTime = fsChangeHsTime == null ? null : fsChangeHsTime.trim();
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

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }
}