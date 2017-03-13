package com.pos.dao;

import com.pos.entity.filever;

public interface fileverMapper {
    int deleteByPrimaryKey(String fsfilename);

    int insert(filever record);

    int insertSelective(filever record);

    filever selectByPrimaryKey(String fsfilename);

    int updateByPrimaryKeySelective(filever record);

    int updateByPrimaryKey(filever record);
}