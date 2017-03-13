package com.pos.dao;

import com.pos.entity.Tbproj;

public interface TbprojMapper {
    int deleteByPrimaryKey(String fsProjId);

    int insert(Tbproj record);

    int insertSelective(Tbproj record);

    Tbproj selectByPrimaryKey(String fsProjId);

    int updateByPrimaryKeySelective(Tbproj record);

    int updateByPrimaryKey(Tbproj record);
}