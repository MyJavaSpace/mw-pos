package com.pos.dao;

import com.pos.entity.Tbshopgroupdtl;
import com.pos.entity.TbshopgroupdtlKey;

public interface TbshopgroupdtlMapper {
    int deleteByPrimaryKey(TbshopgroupdtlKey key);

    int insert(Tbshopgroupdtl record);

    int insertSelective(Tbshopgroupdtl record);

    Tbshopgroupdtl selectByPrimaryKey(TbshopgroupdtlKey key);

    int updateByPrimaryKeySelective(Tbshopgroupdtl record);

    int updateByPrimaryKey(Tbshopgroupdtl record);
}