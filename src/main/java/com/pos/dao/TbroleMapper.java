package com.pos.dao;

import com.pos.entity.Tbrole;
import com.pos.entity.TbroleKey;

public interface TbroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbroleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbrole selectByPrimaryKey(TbroleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbrole
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbrole record);
}