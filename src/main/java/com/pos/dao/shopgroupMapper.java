package com.pos.dao;

import com.pos.entity.shopgroup;
import com.pos.entity.shopgroupWithBLOBs;

public interface shopgroupMapper {
    int deleteByPrimaryKey(Integer fishopgroupid);

    int insert(shopgroupWithBLOBs record);

    int insertSelective(shopgroupWithBLOBs record);

    shopgroupWithBLOBs selectByPrimaryKey(Integer fishopgroupid);

    int updateByPrimaryKeySelective(shopgroupWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs record);

    int updateByPrimaryKey(shopgroup record);
}