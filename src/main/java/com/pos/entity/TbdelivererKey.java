package com.pos.entity;

public class TbdelivererKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbdeliverer.fsDelivererId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsDelivererId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbdeliverer.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbdeliverer.fsDelivererId
     *
     * @return the value of tbdeliverer.fsDelivererId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsDelivererId() {
        return fsDelivererId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbdeliverer.fsDelivererId
     *
     * @param fsDelivererId the value for tbdeliverer.fsDelivererId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsDelivererId(String fsDelivererId) {
        this.fsDelivererId = fsDelivererId == null ? null : fsDelivererId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbdeliverer.fsShopGUID
     *
     * @return the value of tbdeliverer.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbdeliverer.fsShopGUID
     *
     * @param fsShopGUID the value for tbdeliverer.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}