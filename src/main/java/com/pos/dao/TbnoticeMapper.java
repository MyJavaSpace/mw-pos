package com.pos.dao;

import com.pos.entity.Tbnotice;

public interface TbnoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbnotice record);

    int insertSelective(Tbnotice record);

    Tbnotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbnotice record);

    int updateByPrimaryKey(Tbnotice record);
}