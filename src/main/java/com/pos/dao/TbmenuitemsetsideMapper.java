package com.pos.dao;

import com.pos.entity.Tbmenuitemsetside;
import com.pos.entity.TbmenuitemsetsideKey;

public interface TbmenuitemsetsideMapper {
    int deleteByPrimaryKey(TbmenuitemsetsideKey key);

    int insert(Tbmenuitemsetside record);

    int insertSelective(Tbmenuitemsetside record);

    Tbmenuitemsetside selectByPrimaryKey(TbmenuitemsetsideKey key);

    int updateByPrimaryKeySelective(Tbmenuitemsetside record);

    int updateByPrimaryKey(Tbmenuitemsetside record);
}