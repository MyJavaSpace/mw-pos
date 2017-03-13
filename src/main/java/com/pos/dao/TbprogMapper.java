package com.pos.dao;

import com.pos.entity.Tbprog;

public interface TbprogMapper {
    int deleteByPrimaryKey(String fsProgId);

    int insert(Tbprog record);

    int insertSelective(Tbprog record);

    Tbprog selectByPrimaryKey(String fsProgId);

    int updateByPrimaryKeySelective(Tbprog record);

    int updateByPrimaryKey(Tbprog record);
}