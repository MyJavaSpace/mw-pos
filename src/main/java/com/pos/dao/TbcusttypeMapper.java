package com.pos.dao;

import com.pos.entity.Tbcusttype;
import com.pos.entity.TbcusttypeKey;

public interface TbcusttypeMapper {
    int deleteByPrimaryKey(TbcusttypeKey key);

    int insert(Tbcusttype record);

    int insertSelective(Tbcusttype record);

    Tbcusttype selectByPrimaryKey(TbcusttypeKey key);

    int updateByPrimaryKeySelective(Tbcusttype record);

    int updateByPrimaryKey(Tbcusttype record);
}