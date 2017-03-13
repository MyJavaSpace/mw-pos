package com.pos.dao;

import com.pos.entity.Tbdiscount;
import com.pos.entity.TbdiscountKey;

public interface TbdiscountMapper {
    int deleteByPrimaryKey(TbdiscountKey key);

    int insert(Tbdiscount record);

    int insertSelective(Tbdiscount record);

    Tbdiscount selectByPrimaryKey(TbdiscountKey key);

    int updateByPrimaryKeySelective(Tbdiscount record);

    int updateByPrimaryKey(Tbdiscount record);
}