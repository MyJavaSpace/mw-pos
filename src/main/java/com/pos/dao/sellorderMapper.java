package com.pos.dao;

import com.pos.entity.sellorder;
import com.pos.entity.sellorderKey;

public interface sellorderMapper {
    int deleteByPrimaryKey(sellorderKey key);

    int insert(sellorder record);

    int insertSelective(sellorder record);

    sellorder selectByPrimaryKey(sellorderKey key);

    int updateByPrimaryKeySelective(sellorder record);

    int updateByPrimaryKey(sellorder record);
}