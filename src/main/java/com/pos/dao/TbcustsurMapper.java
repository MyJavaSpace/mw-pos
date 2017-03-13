package com.pos.dao;

import com.pos.entity.Tbcustsur;
import com.pos.entity.TbcustsurKey;

public interface TbcustsurMapper {
    int deleteByPrimaryKey(TbcustsurKey key);

    int insert(Tbcustsur record);

    int insertSelective(Tbcustsur record);

    Tbcustsur selectByPrimaryKey(TbcustsurKey key);

    int updateByPrimaryKeySelective(Tbcustsur record);

    int updateByPrimaryKey(Tbcustsur record);
}