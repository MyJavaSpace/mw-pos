package com.pos.dao;

import com.pos.entity.Tbcustste;
import com.pos.entity.TbcuststeKey;

public interface TbcuststeMapper {
    int deleteByPrimaryKey(TbcuststeKey key);

    int insert(Tbcustste record);

    int insertSelective(Tbcustste record);

    Tbcustste selectByPrimaryKey(TbcuststeKey key);

    int updateByPrimaryKeySelective(Tbcustste record);

    int updateByPrimaryKey(Tbcustste record);
}