package com.pos.dao;

import com.pos.entity.Application;
import com.pos.entity.ApplicationKey;

public interface ApplicationMapper {
    int deleteByPrimaryKey(ApplicationKey key);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(ApplicationKey key);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}