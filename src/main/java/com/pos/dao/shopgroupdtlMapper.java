package com.pos.dao;

import com.pos.entity.shopgroupdtl;
import com.pos.entity.shopgroupdtlKey;

public interface shopgroupdtlMapper {
    int deleteByPrimaryKey(shopgroupdtlKey key);

    int insert(shopgroupdtl record);

    int insertSelective(shopgroupdtl record);

    shopgroupdtl selectByPrimaryKey(shopgroupdtlKey key);

    int updateByPrimaryKeySelective(shopgroupdtl record);

    int updateByPrimaryKey(shopgroupdtl record);
}