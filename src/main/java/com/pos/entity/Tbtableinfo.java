package com.pos.entity;

public class Tbtableinfo extends TbtableinfoKey {
    private Integer fiSortOrder;

    private String fsFoodTradeList;

    public Integer getFiSortOrder() {
        return fiSortOrder;
    }

    public void setFiSortOrder(Integer fiSortOrder) {
        this.fiSortOrder = fiSortOrder;
    }

    public String getFsFoodTradeList() {
        return fsFoodTradeList;
    }

    public void setFsFoodTradeList(String fsFoodTradeList) {
        this.fsFoodTradeList = fsFoodTradeList == null ? null : fsFoodTradeList.trim();
    }
}