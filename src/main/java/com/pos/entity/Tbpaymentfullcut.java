package com.pos.entity;

import java.math.BigDecimal;

public class Tbpaymentfullcut extends TbpaymentfullcutKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpaymentfullcut.fdFullmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private BigDecimal fdFullmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpaymentfullcut.fdCutmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private BigDecimal fdCutmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpaymentfullcut.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpaymentfullcut.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbpaymentfullcut.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateUserName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpaymentfullcut.fdFullmoney
     *
     * @return the value of tbpaymentfullcut.fdFullmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public BigDecimal getFdFullmoney() {
        return fdFullmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpaymentfullcut.fdFullmoney
     *
     * @param fdFullmoney the value for tbpaymentfullcut.fdFullmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFdFullmoney(BigDecimal fdFullmoney) {
        this.fdFullmoney = fdFullmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpaymentfullcut.fdCutmoney
     *
     * @return the value of tbpaymentfullcut.fdCutmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public BigDecimal getFdCutmoney() {
        return fdCutmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpaymentfullcut.fdCutmoney
     *
     * @param fdCutmoney the value for tbpaymentfullcut.fdCutmoney
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFdCutmoney(BigDecimal fdCutmoney) {
        this.fdCutmoney = fdCutmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpaymentfullcut.fsUpdateTime
     *
     * @return the value of tbpaymentfullcut.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpaymentfullcut.fsUpdateTime
     *
     * @param fsUpdateTime the value for tbpaymentfullcut.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpaymentfullcut.fsUpdateUserId
     *
     * @return the value of tbpaymentfullcut.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpaymentfullcut.fsUpdateUserId
     *
     * @param fsUpdateUserId the value for tbpaymentfullcut.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbpaymentfullcut.fsUpdateUserName
     *
     * @return the value of tbpaymentfullcut.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbpaymentfullcut.fsUpdateUserName
     *
     * @param fsUpdateUserName the value for tbpaymentfullcut.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }
}