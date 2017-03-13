package com.pos.dao;

import com.pos.entity.Tbmenuitemsetsidedtl;
import com.pos.entity.TbmenuitemsetsidedtlKey;

public interface TbmenuitemsetsidedtlMapper {
    int deleteByPrimaryKey(TbmenuitemsetsidedtlKey key);

    int insert(Tbmenuitemsetsidedtl record);

    int insertSelective(Tbmenuitemsetsidedtl record);

    Tbmenuitemsetsidedtl selectByPrimaryKey(TbmenuitemsetsidedtlKey key);

    int updateByPrimaryKeySelective(Tbmenuitemsetsidedtl record);

    int updateByPrimaryKey(Tbmenuitemsetsidedtl record);
}