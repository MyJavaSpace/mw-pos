package com.pos.entity;

public class TbtransferprnKey {
    private String fsDeptId_Make;

    private String fsDeptId_Transfer;

    private String fsShopGUID;

    public String getFsDeptId_Make() {
        return fsDeptId_Make;
    }

    public void setFsDeptId_Make(String fsDeptId_Make) {
        this.fsDeptId_Make = fsDeptId_Make == null ? null : fsDeptId_Make.trim();
    }

    public String getFsDeptId_Transfer() {
        return fsDeptId_Transfer;
    }

    public void setFsDeptId_Transfer(String fsDeptId_Transfer) {
        this.fsDeptId_Transfer = fsDeptId_Transfer == null ? null : fsDeptId_Transfer.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}