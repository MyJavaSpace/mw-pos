package com.pos.entity;

public class TbhostexternalKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbhostexternal.fiCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private Integer fiCls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbhostexternal.fsHostId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsHostId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbhostexternal.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbhostexternal.fiCls
     *
     * @return the value of tbhostexternal.fiCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public Integer getFiCls() {
        return fiCls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbhostexternal.fiCls
     *
     * @param fiCls the value for tbhostexternal.fiCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFiCls(Integer fiCls) {
        this.fiCls = fiCls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbhostexternal.fsHostId
     *
     * @return the value of tbhostexternal.fsHostId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsHostId() {
        return fsHostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbhostexternal.fsHostId
     *
     * @param fsHostId the value for tbhostexternal.fsHostId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsHostId(String fsHostId) {
        this.fsHostId = fsHostId == null ? null : fsHostId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbhostexternal.fsShopGUID
     *
     * @return the value of tbhostexternal.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbhostexternal.fsShopGUID
     *
     * @param fsShopGUID the value for tbhostexternal.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}