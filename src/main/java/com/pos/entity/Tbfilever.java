package com.pos.entity;

public class Tbfilever {
    private String fsFileName;

    private String fsVer;

    private String fsDir;

    private String fsNote;

    public String getFsFileName() {
        return fsFileName;
    }

    public void setFsFileName(String fsFileName) {
        this.fsFileName = fsFileName == null ? null : fsFileName.trim();
    }

    public String getFsVer() {
        return fsVer;
    }

    public void setFsVer(String fsVer) {
        this.fsVer = fsVer == null ? null : fsVer.trim();
    }

    public String getFsDir() {
        return fsDir;
    }

    public void setFsDir(String fsDir) {
        this.fsDir = fsDir == null ? null : fsDir.trim();
    }

    public String getFsNote() {
        return fsNote;
    }

    public void setFsNote(String fsNote) {
        this.fsNote = fsNote == null ? null : fsNote.trim();
    }
}