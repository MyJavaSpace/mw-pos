package com.pos.dao;

import com.pos.entity.Tbask;
import com.pos.entity.TbaskKey;

public interface TbaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbaskKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbask selectByPrimaryKey(TbaskKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbask
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbask record);
}