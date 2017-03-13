package com.pos.dao;

import com.pos.entity.Tbparam;

public interface TbparamMapper {
    int deleteByPrimaryKey(String fsParamId);

    int insert(Tbparam record);

    int insertSelective(Tbparam record);

    Tbparam selectByPrimaryKey(String fsParamId);

    int updateByPrimaryKeySelective(Tbparam record);

    int updateByPrimaryKey(Tbparam record);
}