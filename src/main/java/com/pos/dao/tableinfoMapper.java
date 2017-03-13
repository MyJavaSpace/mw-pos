package com.pos.dao;

import com.pos.entity.Tableinfo;
import com.pos.entity.TableinfoKey;

public interface TableinfoMapper {
    int deleteByPrimaryKey(TableinfoKey key);

    int insert(Tableinfo record);

    int insertSelective(Tableinfo record);

    Tableinfo selectByPrimaryKey(TableinfoKey key);

    int updateByPrimaryKeySelective(Tableinfo record);

    int updateByPrimaryKey(Tableinfo record);
}