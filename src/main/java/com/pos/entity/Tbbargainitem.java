package com.pos.entity;

import java.math.BigDecimal;

public class Tbbargainitem extends TbbargainitemKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbargainitem.fdBargainPrice
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private BigDecimal fdBargainPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbargainitem.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbargainitem.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbargainitem.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsUpdateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbargainitem.fiStatus
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private Integer fiStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbargainitem.fdBargainPrice
     *
     * @return the value of tbbargainitem.fdBargainPrice
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public BigDecimal getFdBargainPrice() {
        return fdBargainPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbargainitem.fdBargainPrice
     *
     * @param fdBargainPrice the value for tbbargainitem.fdBargainPrice
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFdBargainPrice(BigDecimal fdBargainPrice) {
        this.fdBargainPrice = fdBargainPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbargainitem.fsUpdateTime
     *
     * @return the value of tbbargainitem.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateTime() {
        return fsUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbargainitem.fsUpdateTime
     *
     * @param fsUpdateTime the value for tbbargainitem.fsUpdateTime
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateTime(String fsUpdateTime) {
        this.fsUpdateTime = fsUpdateTime == null ? null : fsUpdateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbargainitem.fsUpdateUserId
     *
     * @return the value of tbbargainitem.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateUserId() {
        return fsUpdateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbargainitem.fsUpdateUserId
     *
     * @param fsUpdateUserId the value for tbbargainitem.fsUpdateUserId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateUserId(String fsUpdateUserId) {
        this.fsUpdateUserId = fsUpdateUserId == null ? null : fsUpdateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbargainitem.fsUpdateUserName
     *
     * @return the value of tbbargainitem.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsUpdateUserName() {
        return fsUpdateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbargainitem.fsUpdateUserName
     *
     * @param fsUpdateUserName the value for tbbargainitem.fsUpdateUserName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsUpdateUserName(String fsUpdateUserName) {
        this.fsUpdateUserName = fsUpdateUserName == null ? null : fsUpdateUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbargainitem.fiStatus
     *
     * @return the value of tbbargainitem.fiStatus
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public Integer getFiStatus() {
        return fiStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbargainitem.fiStatus
     *
     * @param fiStatus the value for tbbargainitem.fiStatus
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFiStatus(Integer fiStatus) {
        this.fiStatus = fiStatus;
    }
}