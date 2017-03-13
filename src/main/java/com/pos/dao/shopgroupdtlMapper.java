package com.pos.dao;

import com.pos.entity.Shopgroupdtl;
import com.pos.entity.ShopgroupdtlKey;

public interface ShopgroupdtlMapper {
    int deleteByPrimaryKey(ShopgroupdtlKey key);

    int insert(Shopgroupdtl record);

    int insertSelective(Shopgroupdtl record);

    Shopgroupdtl selectByPrimaryKey(ShopgroupdtlKey key);

    int updateByPrimaryKeySelective(Shopgroupdtl record);

    int updateByPrimaryKey(Shopgroupdtl record);
}