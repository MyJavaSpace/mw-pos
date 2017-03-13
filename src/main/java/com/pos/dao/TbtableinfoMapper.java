package com.pos.dao;

import com.pos.entity.Tbtableinfo;
import com.pos.entity.TbtableinfoKey;

public interface TbtableinfoMapper {
    int deleteByPrimaryKey(TbtableinfoKey key);

    int insert(Tbtableinfo record);

    int insertSelective(Tbtableinfo record);

    Tbtableinfo selectByPrimaryKey(TbtableinfoKey key);

    int updateByPrimaryKeySelective(Tbtableinfo record);

    int updateByPrimaryKey(Tbtableinfo record);
}