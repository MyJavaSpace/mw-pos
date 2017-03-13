package com.pos.entity;

public class TbmenuitemaskgpKey {
    private Integer fiItemCd;

    private String fsAskGpId;

    private String fsShopGUID;

    public Integer getFiItemCd() {
        return fiItemCd;
    }

    public void setFiItemCd(Integer fiItemCd) {
        this.fiItemCd = fiItemCd;
    }

    public String getFsAskGpId() {
        return fsAskGpId;
    }

    public void setFsAskGpId(String fsAskGpId) {
        this.fsAskGpId = fsAskGpId == null ? null : fsAskGpId.trim();
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}