package com.pos.dao;

import com.pos.entity.Menuitemsetsidedtl;
import com.pos.entity.MenuitemsetsidedtlKey;

public interface MenuitemsetsidedtlMapper {
    int deleteByPrimaryKey(MenuitemsetsidedtlKey key);

    int insert(Menuitemsetsidedtl record);

    int insertSelective(Menuitemsetsidedtl record);

    Menuitemsetsidedtl selectByPrimaryKey(MenuitemsetsidedtlKey key);

    int updateByPrimaryKeySelective(Menuitemsetsidedtl record);

    int updateByPrimaryKey(Menuitemsetsidedtl record);
}