package com.pos.entity;

public class TbseqnoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbseqno.fsCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsCls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbseqno.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbseqno.fsCls
     *
     * @return the value of tbseqno.fsCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsCls() {
        return fsCls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbseqno.fsCls
     *
     * @param fsCls the value for tbseqno.fsCls
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsCls(String fsCls) {
        this.fsCls = fsCls == null ? null : fsCls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbseqno.fsShopGUID
     *
     * @return the value of tbseqno.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbseqno.fsShopGUID
     *
     * @param fsShopGUID the value for tbseqno.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}