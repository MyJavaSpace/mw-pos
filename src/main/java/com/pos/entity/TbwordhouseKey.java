package com.pos.entity;

public class TbwordhouseKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbwordhouse.fiId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private Integer fiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbwordhouse.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbwordhouse.fiId
     *
     * @return the value of tbwordhouse.fiId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public Integer getFiId() {
        return fiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbwordhouse.fiId
     *
     * @param fiId the value for tbwordhouse.fiId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbwordhouse.fsShopGUID
     *
     * @return the value of tbwordhouse.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbwordhouse.fsShopGUID
     *
     * @param fsShopGUID the value for tbwordhouse.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}