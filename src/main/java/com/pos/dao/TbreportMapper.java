package com.pos.dao;

import com.pos.entity.Tbreport;
import com.pos.entity.TbreportKey;

public interface TbreportMapper {
    int deleteByPrimaryKey(TbreportKey key);

    int insert(Tbreport record);

    int insertSelective(Tbreport record);

    Tbreport selectByPrimaryKey(TbreportKey key);

    int updateByPrimaryKeySelective(Tbreport record);

    int updateByPrimaryKey(Tbreport record);
}