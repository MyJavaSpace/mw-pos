package com.pos.dao;

import com.pos.entity.Tbprintprojectgp;
import com.pos.entity.TbprintprojectgpKey;

public interface TbprintprojectgpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbprintprojectgpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbprintprojectgp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbprintprojectgp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbprintprojectgp selectByPrimaryKey(TbprintprojectgpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbprintprojectgp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbprintprojectgp
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbprintprojectgp record);
}