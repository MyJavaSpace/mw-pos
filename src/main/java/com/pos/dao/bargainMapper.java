package com.pos.dao;

import com.pos.entity.bargain;
import com.pos.entity.bargainKey;

public interface bargainMapper {
    int deleteByPrimaryKey(bargainKey key);

    int insert(bargain record);

    int insertSelective(bargain record);

    bargain selectByPrimaryKey(bargainKey key);

    int updateByPrimaryKeySelective(bargain record);

    int updateByPrimaryKey(bargain record);
}