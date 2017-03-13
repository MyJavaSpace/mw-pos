package com.pos.dao;

import com.pos.entity.Apibusiness;

public interface ApibusinessMapper {
    int deleteByPrimaryKey(String fsbusinessno);

    int insert(Apibusiness record);

    int insertSelective(Apibusiness record);

    Apibusiness selectByPrimaryKey(String fsbusinessno);

    int updateByPrimaryKeySelective(Apibusiness record);

    int updateByPrimaryKey(Apibusiness record);
}