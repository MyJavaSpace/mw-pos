package com.pos.dao;

import com.pos.entity.Tbuserdiscount;
import com.pos.entity.TbuserdiscountKey;

public interface TbuserdiscountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbuserdiscountKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbuserdiscount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbuserdiscount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbuserdiscount selectByPrimaryKey(TbuserdiscountKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbuserdiscount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuserdiscount
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbuserdiscount record);
}