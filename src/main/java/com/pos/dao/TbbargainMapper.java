package com.pos.dao;

import com.pos.entity.Tbbargain;
import com.pos.entity.TbbargainKey;

public interface TbbargainMapper {
    int deleteByPrimaryKey(TbbargainKey key);

    int insert(Tbbargain record);

    int insertSelective(Tbbargain record);

    Tbbargain selectByPrimaryKey(TbbargainKey key);

    int updateByPrimaryKeySelective(Tbbargain record);

    int updateByPrimaryKey(Tbbargain record);
}