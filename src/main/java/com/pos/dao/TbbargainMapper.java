package com.pos.dao;

import com.pos.entity.Tbbargain;
import com.pos.entity.TbbargainKey;

public interface TbbargainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(TbbargainKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(Tbbargain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(Tbbargain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    Tbbargain selectByPrimaryKey(TbbargainKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(Tbbargain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbbargain
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbbargain record);
}