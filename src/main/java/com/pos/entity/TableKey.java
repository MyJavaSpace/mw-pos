package com.pos.entity;

public class TableKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_key.table_name
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String table_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_key.key_value
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private Integer key_value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_key.table_name
     *
     * @return the value of table_key.table_name
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_key.table_name
     *
     * @param table_name the value for table_key.table_name
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_key.key_value
     *
     * @return the value of table_key.key_value
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public Integer getKey_value() {
        return key_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_key.key_value
     *
     * @param key_value the value for table_key.key_value
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setKey_value(Integer key_value) {
        this.key_value = key_value;
    }
}