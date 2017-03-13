package com.pos.dao;

import com.pos.entity.Tbshopgroup;
import com.pos.entity.TbshopgroupWithBLOBs;

public interface TbshopgroupMapper {
    int deleteByPrimaryKey(Integer fiShopGroupId);

    int insert(TbshopgroupWithBLOBs record);

    int insertSelective(TbshopgroupWithBLOBs record);

    TbshopgroupWithBLOBs selectByPrimaryKey(Integer fiShopGroupId);

    int updateByPrimaryKeySelective(TbshopgroupWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbshopgroupWithBLOBs record);

    int updateByPrimaryKey(Tbshopgroup record);
}