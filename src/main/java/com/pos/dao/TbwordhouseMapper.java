package com.pos.dao;

import com.pos.entity.Tbwordhouse;
import com.pos.entity.TbwordhouseKey;

public interface TbwordhouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbwordhouseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbwordhouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbwordhouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbwordhouse selectByPrimaryKey(TbwordhouseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbwordhouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbwordhouse
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbwordhouse record);
}