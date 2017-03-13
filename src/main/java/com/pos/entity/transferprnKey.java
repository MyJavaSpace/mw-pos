package com.pos.entity;

public class transferprnKey {
    private String fsdeptidMake;

    private String fsdeptidTransfer;

    private String fsshopguid;

    public String getFsdeptidMake() {
        return fsdeptidMake;
    }

    public void setFsdeptidMake(String fsdeptidMake) {
        this.fsdeptidMake = fsdeptidMake == null ? null : fsdeptidMake.trim();
    }

    public String getFsdeptidTransfer() {
        return fsdeptidTransfer;
    }

    public void setFsdeptidTransfer(String fsdeptidTransfer) {
        this.fsdeptidTransfer = fsdeptidTransfer == null ? null : fsdeptidTransfer.trim();
    }

    public String getFsshopguid() {
        return fsshopguid;
    }

    public void setFsshopguid(String fsshopguid) {
        this.fsshopguid = fsshopguid == null ? null : fsshopguid.trim();
    }
}