package com.pos.dao;

import com.pos.entity.openparam;

public interface openparamMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(openparam record);

    int insertSelective(openparam record);

    openparam selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(openparam record);

    int updateByPrimaryKey(openparam record);
}