package com.pos.dao;

import com.pos.entity.Tbparam;

public interface TbparamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(String fsParamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbparam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbparam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbparam selectByPrimaryKey(String fsParamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbparam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbparam
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbparam record);
}