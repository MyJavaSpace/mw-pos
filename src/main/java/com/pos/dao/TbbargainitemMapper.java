package com.pos.dao;

import com.pos.entity.Tbbargainitem;
import com.pos.entity.TbbargainitemKey;

public interface TbbargainitemMapper {
    int deleteByPrimaryKey(TbbargainitemKey key);

    int insert(Tbbargainitem record);

    int insertSelective(Tbbargainitem record);

    Tbbargainitem selectByPrimaryKey(TbbargainitemKey key);

    int updateByPrimaryKeySelective(Tbbargainitem record);

    int updateByPrimaryKey(Tbbargainitem record);
}