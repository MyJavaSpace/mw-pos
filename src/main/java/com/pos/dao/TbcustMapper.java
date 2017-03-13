package com.pos.dao;

import com.pos.entity.Tbcust;

public interface TbcustMapper {
    int deleteByPrimaryKey(String fsCustGUID);

    int insert(Tbcust record);

    int insertSelective(Tbcust record);

    Tbcust selectByPrimaryKey(String fsCustGUID);

    int updateByPrimaryKeySelective(Tbcust record);

    int updateByPrimaryKey(Tbcust record);
}