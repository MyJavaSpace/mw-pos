package com.pos.entity;

public class TbuserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbuser.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbuser.fsStaffId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsStaffId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbuser.fsShopGUID
     *
     * @return the value of tbuser.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbuser.fsShopGUID
     *
     * @param fsShopGUID the value for tbuser.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbuser.fsStaffId
     *
     * @return the value of tbuser.fsStaffId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsStaffId() {
        return fsStaffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbuser.fsStaffId
     *
     * @param fsStaffId the value for tbuser.fsStaffId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsStaffId(String fsStaffId) {
        this.fsStaffId = fsStaffId == null ? null : fsStaffId.trim();
    }
}