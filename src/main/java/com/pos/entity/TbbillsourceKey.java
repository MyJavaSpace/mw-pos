package com.pos.entity;

public class TbbillsourceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbillsource.fsBillSourceId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsBillSourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbbillsource.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsShopGUID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbillsource.fsBillSourceId
     *
     * @return the value of tbbillsource.fsBillSourceId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsBillSourceId() {
        return fsBillSourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbillsource.fsBillSourceId
     *
     * @param fsBillSourceId the value for tbbillsource.fsBillSourceId
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsBillSourceId(String fsBillSourceId) {
        this.fsBillSourceId = fsBillSourceId == null ? null : fsBillSourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbbillsource.fsShopGUID
     *
     * @return the value of tbbillsource.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsShopGUID() {
        return fsShopGUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbbillsource.fsShopGUID
     *
     * @param fsShopGUID the value for tbbillsource.fsShopGUID
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsShopGUID(String fsShopGUID) {
        this.fsShopGUID = fsShopGUID == null ? null : fsShopGUID.trim();
    }
}