package com.pos.dao;

import com.pos.entity.Tbviplvl;
import com.pos.entity.TbviplvlKey;

public interface TbviplvlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbviplvlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbviplvl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbviplvl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbviplvl selectByPrimaryKey(TbviplvlKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbviplvl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbviplvl
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbviplvl record);
}