package com.pos.dao;

import com.pos.entity.Deliverer;
import com.pos.entity.DelivererKey;

public interface DelivererMapper {
    int deleteByPrimaryKey(DelivererKey key);

    int insert(Deliverer record);

    int insertSelective(Deliverer record);

    Deliverer selectByPrimaryKey(DelivererKey key);

    int updateByPrimaryKeySelective(Deliverer record);

    int updateByPrimaryKey(Deliverer record);
}