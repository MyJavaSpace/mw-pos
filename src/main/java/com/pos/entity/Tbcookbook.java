package com.pos.entity;

import java.math.BigDecimal;

public class Tbcookbook extends TbcookbookKey {
    private String fscookname;

    private BigDecimal fdpricerange;

    private Integer fidecround;

    private Integer fistatus;

    private String fsUpdateTime;

    private String fsUpdateUserId;

    private String fsUpdateUserName;

    public String getFscookname() {
        return fscookname;
    }

    public void setFscookname(String fscookname) {
        this.fscookname = fscookname == null ? null : fscookname.trim();
    }

    public BigDecimal getFdpricerange() {
        return fdpricerange;
    }

    public void setFdpricerange(BigDecimal fdpricerange) {
        this.fdpricerange = fdpricerange;
    }

    public Integer getFidecround() {
        return fidecround;
    }

    public void setFidecround(Integer fidecround) {
        this.fidecround = fidecround;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }
}