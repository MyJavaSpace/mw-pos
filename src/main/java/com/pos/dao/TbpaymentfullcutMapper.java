package com.pos.dao;

import com.pos.entity.Tbpaymentfullcut;
import com.pos.entity.TbpaymentfullcutKey;

public interface TbpaymentfullcutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbpaymentfullcutKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbpaymentfullcut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbpaymentfullcut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbpaymentfullcut selectByPrimaryKey(TbpaymentfullcutKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbpaymentfullcut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbpaymentfullcut
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbpaymentfullcut record);
}