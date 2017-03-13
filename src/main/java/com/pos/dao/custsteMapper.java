package com.pos.dao;

import com.pos.entity.Custste;
import com.pos.entity.CuststeKey;

public interface CuststeMapper {
    int deleteByPrimaryKey(CuststeKey key);

    int insert(Custste record);

    int insertSelective(Custste record);

    Custste selectByPrimaryKey(CuststeKey key);

    int updateByPrimaryKeySelective(Custste record);

    int updateByPrimaryKey(Custste record);
}