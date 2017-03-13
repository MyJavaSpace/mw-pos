package com.pos.entity;

public class Tbdept extends TbdeptKey {
    private String fsDeptName;

    private Integer fiDeptCls;

    private String fsPrinterName;

    private String fsPrinterName2;

    private Integer fiIsBackBill;

    private Integer fiIsHurryBill;

    private Integer fiIsChangeBill;

    private Integer fiIsTaskBill;

    private Integer fiIsTurnBill;

    private Integer fiIsOneItemCut;

    private Integer fiPrintCopies;

    private Integer fiStatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFsDeptName() {
        return fsDeptName;
    }

    public void setFsDeptName(String fsDeptName) {
        this.fsDeptName = fsDeptName == null ? null : fsDeptName.trim();
    }

    public Integer getFiDeptCls() {
        return fiDeptCls;
    }

    public void setFiDeptCls(Integer fiDeptCls) {
        this.fiDeptCls = fiDeptCls;
    }

    public String getFsPrinterName() {
        return fsPrinterName;
    }

    public void setFsPrinterName(String fsPrinterName) {
        this.fsPrinterName = fsPrinterName == null ? null : fsPrinterName.trim();
    }

    public String getFsPrinterName2() {
        return fsPrinterName2;
    }

    public void setFsPrinterName2(String fsPrinterName2) {
        this.fsPrinterName2 = fsPrinterName2 == null ? null : fsPrinterName2.trim();
    }

    public Integer getFiIsBackBill() {
        return fiIsBackBill;
    }

    public void setFiIsBackBill(Integer fiIsBackBill) {
        this.fiIsBackBill = fiIsBackBill;
    }

    public Integer getFiIsHurryBill() {
        return fiIsHurryBill;
    }

    public void setFiIsHurryBill(Integer fiIsHurryBill) {
        this.fiIsHurryBill = fiIsHurryBill;
    }

    public Integer getFiIsChangeBill() {
        return fiIsChangeBill;
    }

    public void setFiIsChangeBill(Integer fiIsChangeBill) {
        this.fiIsChangeBill = fiIsChangeBill;
    }

    public Integer getFiIsTaskBill() {
        return fiIsTaskBill;
    }

    public void setFiIsTaskBill(Integer fiIsTaskBill) {
        this.fiIsTaskBill = fiIsTaskBill;
    }

    public Integer getFiIsTurnBill() {
        return fiIsTurnBill;
    }

    public void setFiIsTurnBill(Integer fiIsTurnBill) {
        this.fiIsTurnBill = fiIsTurnBill;
    }

    public Integer getFiIsOneItemCut() {
        return fiIsOneItemCut;
    }

    public void setFiIsOneItemCut(Integer fiIsOneItemCut) {
        this.fiIsOneItemCut = fiIsOneItemCut;
    }

    public Integer getFiPrintCopies() {
        return fiPrintCopies;
    }

    public void setFiPrintCopies(Integer fiPrintCopies) {
        this.fiPrintCopies = fiPrintCopies;
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