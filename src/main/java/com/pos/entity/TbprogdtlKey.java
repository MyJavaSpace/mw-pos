package com.pos.entity;

public class TbprogdtlKey {
    private String fsProgDtlId;

    private String fsProgId;

    public String getFsProgDtlId() {
        return fsProgDtlId;
    }

    public void setFsProgDtlId(String fsProgDtlId) {
        this.fsProgDtlId = fsProgDtlId == null ? null : fsProgDtlId.trim();
    }

    public String getFsProgId() {
        return fsProgId;
    }

    public void setFsProgId(String fsProgId) {
        this.fsProgId = fsProgId == null ? null : fsProgId.trim();
    }
}