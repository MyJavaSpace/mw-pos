package com.pos.dao;

import com.pos.entity.bargainitem;
import com.pos.entity.bargainitemKey;

public interface bargainitemMapper {
    int deleteByPrimaryKey(bargainitemKey key);

    int insert(bargainitem record);

    int insertSelective(bargainitem record);

    bargainitem selectByPrimaryKey(bargainitemKey key);

    int updateByPrimaryKeySelective(bargainitem record);

    int updateByPrimaryKey(bargainitem record);
}