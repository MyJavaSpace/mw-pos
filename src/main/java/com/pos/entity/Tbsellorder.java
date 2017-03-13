package com.pos.entity;

public class Tbsellorder extends TbsellorderKey {
    private Integer fiOrderCls;

    private Integer fiOrderSte;

    private String fsNote;

    private String fsUpdateTime;

    private String fsCreateTime;

    private String fsCreateUserId;

    private String fsCreateUserName;

    private String fsDataSrckind;

    private String fsSrcVerno;

    private Integer lver;

    public Integer getFiOrderCls() {
        return fiOrderCls;
    }

    public void setFiOrderCls(Integer fiOrderCls) {
        this.fiOrderCls = fiOrderCls;
    }

    public Integer getFiOrderSte() {
        return fiOrderSte;
    }

    public void setFiOrderSte(Integer fiOrderSte) {
        this.fiOrderSte = fiOrderSte;
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

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}