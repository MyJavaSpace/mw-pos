package com.pos.entity;

public class Tbaddr extends TbaddrKey {
    private String fsProvinceName;

    private String fsCityName;

    private String fsDistrictName;

    private String fsPostal;

    public String getFsProvinceName() {
        return fsProvinceName;
    }

    public void setFsProvinceName(String fsProvinceName) {
        this.fsProvinceName = fsProvinceName == null ? null : fsProvinceName.trim();
    }

    public String getFsCityName() {
        return fsCityName;
    }

    public void setFsCityName(String fsCityName) {
        this.fsCityName = fsCityName == null ? null : fsCityName.trim();
    }

    public String getFsDistrictName() {
        return fsDistrictName;
    }

    public void setFsDistrictName(String fsDistrictName) {
        this.fsDistrictName = fsDistrictName == null ? null : fsDistrictName.trim();
    }

    public String getFsPostal() {
        return fsPostal;
    }

    public void setFsPostal(String fsPostal) {
        this.fsPostal = fsPostal == null ? null : fsPostal.trim();
    }
}