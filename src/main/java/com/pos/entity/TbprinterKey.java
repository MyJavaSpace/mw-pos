package com.pos.entity;

public class TbprinterKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbprinter.fiID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private Integer fiID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbprinter.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbprinter.fiID
     *
     * @return the value of tbprinter.fiID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public Integer getFiID() {
        return fiID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbprinter.fiID
     *
     * @param fiID the value for tbprinter.fiID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFiID(Integer fiID) {
        this.fiID = fiID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbprinter.fsShopGUID
     *
     * @return the value of tbprinter.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbprinter.fsShopGUID
     *
     * @param fsShopGUID the value for tbprinter.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}