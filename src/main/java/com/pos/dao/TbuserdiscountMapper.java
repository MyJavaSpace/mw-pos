package com.pos.dao;

import com.pos.entity.Tbuserdiscount;
import com.pos.entity.TbuserdiscountKey;

public interface TbuserdiscountMapper {
    int deleteByPrimaryKey(TbuserdiscountKey key);

    int insert(Tbuserdiscount record);

    int insertSelective(Tbuserdiscount record);

    Tbuserdiscount selectByPrimaryKey(TbuserdiscountKey key);

    int updateByPrimaryKeySelective(Tbuserdiscount record);

    int updateByPrimaryKey(Tbuserdiscount record);
}