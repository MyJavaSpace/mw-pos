package com.pos.dao;

import com.pos.entity.Tbhostver;
import com.pos.entity.TbhostverKey;

public interface TbhostverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbhostverKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbhostver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbhostver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbhostver selectByPrimaryKey(TbhostverKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbhostver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbhostver
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbhostver record);
}