package com.pos.dao;

import com.pos.entity.Sellorder;
import com.pos.entity.SellorderKey;

public interface SellorderMapper {
    int deleteByPrimaryKey(SellorderKey key);

    int insert(Sellorder record);

    int insertSelective(Sellorder record);

    Sellorder selectByPrimaryKey(SellorderKey key);

    int updateByPrimaryKeySelective(Sellorder record);

    int updateByPrimaryKey(Sellorder record);
}