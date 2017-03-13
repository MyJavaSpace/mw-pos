package com.pos.entity;

public class TableKey {
    private String table_name;

    private Integer key_value;

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    public Integer getKey_value() {
        return key_value;
    }

    public void setKey_value(Integer key_value) {
        this.key_value = key_value;
    }
}