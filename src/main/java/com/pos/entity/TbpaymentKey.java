package com.pos.entity;

public class TbpaymentKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpayment.fsPaymentId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsPaymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpayment.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpayment.fsPaymentId
     *
     * @return the value of tbpayment.fsPaymentId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsPaymentId() {
        return fsPaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpayment.fsPaymentId
     *
     * @param fsPaymentId the value for tbpayment.fsPaymentId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsPaymentId(String fsPaymentId) {
        this.fsPaymentId = fsPaymentId == null ? null : fsPaymentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpayment.fsShopGUID
     *
     * @return the value of tbpayment.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpayment.fsShopGUID
     *
     * @param fsShopGUID the value for tbpayment.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}