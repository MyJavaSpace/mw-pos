package com.pos.dao;

import com.pos.entity.Tbtrade;
import com.pos.entity.TbtradeKey;

public interface TbtradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbtradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbtrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbtrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbtrade selectByPrimaryKey(TbtradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbtrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbtrade
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbtrade record);
}