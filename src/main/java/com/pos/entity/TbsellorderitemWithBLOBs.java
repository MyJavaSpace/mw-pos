package com.pos.entity;

public class TbsellorderitemWithBLOBs extends Tbsellorderitem {
    private String fsDeptId;

    private String fsNote;

    public String getFsDeptId() {
        return fsDeptId;
    }

    public void setFsDeptId(String fsDeptId) {
        this.fsDeptId = fsDeptId == null ? null : fsDeptId.trim();
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }
}