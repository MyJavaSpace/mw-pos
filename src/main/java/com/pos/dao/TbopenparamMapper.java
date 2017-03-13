package com.pos.dao;

import com.pos.entity.Tbopenparam;

public interface TbopenparamMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(Tbopenparam record);

    int insertSelective(Tbopenparam record);

    Tbopenparam selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(Tbopenparam record);

    int updateByPrimaryKey(Tbopenparam record);
}