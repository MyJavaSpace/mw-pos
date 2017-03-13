package com.pos.dao;

import com.pos.entity.menuitemsetsidedtl;
import com.pos.entity.menuitemsetsidedtlKey;

public interface menuitemsetsidedtlMapper {
    int deleteByPrimaryKey(menuitemsetsidedtlKey key);

    int insert(menuitemsetsidedtl record);

    int insertSelective(menuitemsetsidedtl record);

    menuitemsetsidedtl selectByPrimaryKey(menuitemsetsidedtlKey key);

    int updateByPrimaryKeySelective(menuitemsetsidedtl record);

    int updateByPrimaryKey(menuitemsetsidedtl record);
}