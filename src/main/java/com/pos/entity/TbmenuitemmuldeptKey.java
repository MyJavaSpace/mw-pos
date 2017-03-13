package com.pos.entity;

public class TbmenuitemmuldeptKey {
    private Integer fiMulDeptCd;

    private String fsShopGUID;

    public Integer getFiMulDeptCd() {
        return fiMulDeptCd;
    }

    public void setFiMulDeptCd(Integer fiMulDeptCd) {
        this.fiMulDeptCd = fiMulDeptCd;
    }

    public String getFsShopGUID() {
        return fsShopGUID;
    }

    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}