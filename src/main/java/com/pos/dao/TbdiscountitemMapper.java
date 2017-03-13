package com.pos.dao;

import com.pos.entity.Tbdiscountitem;
import com.pos.entity.TbdiscountitemKey;

public interface TbdiscountitemMapper {
    int deleteByPrimaryKey(TbdiscountitemKey key);

    int insert(Tbdiscountitem record);

    int insertSelective(Tbdiscountitem record);

    Tbdiscountitem selectByPrimaryKey(TbdiscountitemKey key);

    int updateByPrimaryKeySelective(Tbdiscountitem record);

    int updateByPrimaryKey(Tbdiscountitem record);
}