package com.pos.dao;

import com.pos.entity.Tbapplication;
import com.pos.entity.TbapplicationKey;

public interface TbapplicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbapplicationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbapplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbapplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbapplication selectByPrimaryKey(TbapplicationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbapplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbapplication
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbapplication record);
}