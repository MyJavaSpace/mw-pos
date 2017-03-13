package com.pos.dao;

import com.pos.entity.Shopgroup;
import com.pos.entity.ShopgroupWithBLOBs;

public interface ShopgroupMapper {
    int deleteByPrimaryKey(Integer fishopgroupid);

    int insert(ShopgroupWithBLOBs record);

    int insertSelective(ShopgroupWithBLOBs record);

    ShopgroupWithBLOBs selectByPrimaryKey(Integer fishopgroupid);

    int updateByPrimaryKeySelective(ShopgroupWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShopgroupWithBLOBs record);

    int updateByPrimaryKey(Shopgroup record);
}