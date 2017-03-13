package com.pos.dao;

import com.pos.entity.ApibusinesslistKey;

public interface ApibusinesslistMapper {
    int deleteByPrimaryKey(ApibusinesslistKey key);

    int insert(ApibusinesslistKey record);

    int insertSelective(ApibusinesslistKey record);
}