package com.pos.entity;

public class TbtableinfoKey {
    private String fsKind;

    private String fsTableId;

    private String fsTableName;

    public String getFsKind() {
        return fsKind;
    }

    public void setFsKind(String fsKind) {
        this.fsKind = fsKind == null ? null : fsKind.trim();
    }

    public String getFsTableId() {
        return fsTableId;
    }

    public void setFsTableId(String fsTableId) {
        this.fsTableId = fsTableId == null ? null : fsTableId.trim();
    }

    public String getFsTableName() {
        return fsTableName;
    }

    public void setFsTableName(String fsTableName) {
        this.fsTableName = fsTableName == null ? null : fsTableName.trim();
    }
}