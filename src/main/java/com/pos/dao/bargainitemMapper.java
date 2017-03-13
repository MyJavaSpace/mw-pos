package com.pos.dao;

import com.pos.entity.Bargainitem;
import com.pos.entity.BargainitemKey;

public interface BargainitemMapper {
    int deleteByPrimaryKey(BargainitemKey key);

    int insert(Bargainitem record);

    int insertSelective(Bargainitem record);

    Bargainitem selectByPrimaryKey(BargainitemKey key);

    int updateByPrimaryKeySelective(Bargainitem record);

    int updateByPrimaryKey(Bargainitem record);
}