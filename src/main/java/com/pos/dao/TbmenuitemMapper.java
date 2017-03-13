package com.pos.dao;

import com.pos.entity.Tbmenuitem;
import com.pos.entity.TbmenuitemKey;

public interface TbmenuitemMapper {
    int deleteByPrimaryKey(TbmenuitemKey key);

    int insert(Tbmenuitem record);

    int insertSelective(Tbmenuitem record);

    Tbmenuitem selectByPrimaryKey(TbmenuitemKey key);

    int updateByPrimaryKeySelective(Tbmenuitem record);

    int updateByPrimaryKey(Tbmenuitem record);
}