package com.pos.entity;

public class TbauthorityKey {
    private String fsProgId;

    private String fsProjId;

    private String fsRoleId;

    private String fsShopGUID;

    public String getFsProgId() {
        return fsProgId;
    }

    public void setFsProgId(String fsProgId) {
        this.fsProgId = fsProgId == null ? null : fsProgId.trim();
    }

    public String getFsProjId() {
        return fsProjId;
    }

    public void setFsProjId(String fsProjId) {
        this.fsProjId = fsProjId == null ? null : fsProjId.trim();
    }

    public String getFsRoleId() {
        return fsRoleId;
    }

    public void setFsRoleId(String fsRoleId) {
        this.fsRoleId = fsRoleId == null ? null : fsRoleId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}