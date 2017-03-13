package com.pos.dao;

import com.pos.entity.Openparam;

public interface OpenparamMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(Openparam record);

    int insertSelective(Openparam record);

    Openparam selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(Openparam record);

    int updateByPrimaryKey(Openparam record);
}