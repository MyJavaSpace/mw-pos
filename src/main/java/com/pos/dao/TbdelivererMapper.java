package com.pos.dao;

import com.pos.entity.Tbdeliverer;
import com.pos.entity.TbdelivererKey;

public interface TbdelivererMapper {
    int deleteByPrimaryKey(TbdelivererKey key);

    int insert(Tbdeliverer record);

    int insertSelective(Tbdeliverer record);

    Tbdeliverer selectByPrimaryKey(TbdelivererKey key);

    int updateByPrimaryKeySelective(Tbdeliverer record);

    int updateByPrimaryKey(Tbdeliverer record);
}