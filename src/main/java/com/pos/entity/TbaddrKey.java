package com.pos.entity;

public class TbaddrKey {
    private String fsCityId;

    private String fsDistrictId;

    private String fsProvinceId;

    public String getFsCityId() {
        return fsCityId;
    }

    public void setFsCityId(String fsCityId) {
        this.fsCityId = fsCityId == null ? null : fsCityId.trim();
    }

    public String getFsDistrictId() {
        return fsDistrictId;
    }

    public void setFsDistrictId(String fsDistrictId) {
        this.fsDistrictId = fsDistrictId == null ? null : fsDistrictId.trim();
    }

    public String getFsProvinceId() {
        return fsProvinceId;
    }

    public void setFsProvinceId(String fsProvinceId) {
        this.fsProvinceId = fsProvinceId == null ? null : fsProvinceId.trim();
    }
}