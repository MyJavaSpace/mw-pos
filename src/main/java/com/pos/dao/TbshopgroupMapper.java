package com.pos.dao;

import com.pos.entity.Tbshopgroup;
import com.pos.entity.TbshopgroupWithBLOBs;

public interface TbshopgroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int deleteByPrimaryKey(Integer fiShopGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insert(TbshopgroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int insertSelective(TbshopgroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    TbshopgroupWithBLOBs selectByPrimaryKey(Integer fiShopGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeySelective(TbshopgroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TbshopgroupWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbshopgroup
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    int updateByPrimaryKey(Tbshopgroup record);
}