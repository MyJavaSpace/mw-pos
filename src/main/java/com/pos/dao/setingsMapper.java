package com.pos.dao;

import com.pos.entity.setings;

public interface setingsMapper {
    int deleteByPrimaryKey(String fskey);

    int insert(setings record);

    int insertSelective(setings record);

    setings selectByPrimaryKey(String fskey);

    int updateByPrimaryKeySelective(setings record);

    int updateByPrimaryKey(setings record);
}