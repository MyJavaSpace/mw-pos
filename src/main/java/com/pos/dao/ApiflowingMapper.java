package com.pos.dao;

import com.pos.entity.Apiflowing;
import com.pos.entity.ApiflowingWithBLOBs;

public interface ApiflowingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(String fsflowingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(ApiflowingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(ApiflowingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    ApiflowingWithBLOBs selectByPrimaryKey(String fsflowingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(ApiflowingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(ApiflowingWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apiflowing
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Apiflowing record);
}