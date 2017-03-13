package com.pos.dao;

import com.pos.entity.Filever;

public interface FileverMapper {
    int deleteByPrimaryKey(String fsfilename);

    int insert(Filever record);

    int insertSelective(Filever record);

    Filever selectByPrimaryKey(String fsfilename);

    int updateByPrimaryKeySelective(Filever record);

    int updateByPrimaryKey(Filever record);
}