package com.pos.entity;

public class TbrevenuetypeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbrevenuetype.fsRevenueTypeId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsRevenueTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbrevenuetype.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbrevenuetype.fsRevenueTypeId
     *
     * @return the value of tbrevenuetype.fsRevenueTypeId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsRevenueTypeId() {
        return fsRevenueTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbrevenuetype.fsRevenueTypeId
     *
     * @param fsRevenueTypeId the value for tbrevenuetype.fsRevenueTypeId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsRevenueTypeId(String fsRevenueTypeId) {
        this.fsRevenueTypeId = fsRevenueTypeId == null ? null : fsRevenueTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbrevenuetype.fsShopGUID
     *
     * @return the value of tbrevenuetype.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbrevenuetype.fsShopGUID
     *
     * @param fsShopGUID the value for tbrevenuetype.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}