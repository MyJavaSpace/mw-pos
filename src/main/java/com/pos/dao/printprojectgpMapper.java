package com.pos.dao;

import com.pos.entity.printprojectgp;
import com.pos.entity.printprojectgpKey;

public interface printprojectgpMapper {
    int deleteByPrimaryKey(printprojectgpKey key);

    int insert(printprojectgp record);

    int insertSelective(printprojectgp record);

    printprojectgp selectByPrimaryKey(printprojectgpKey key);

    int updateByPrimaryKeySelective(printprojectgp record);

    int updateByPrimaryKey(printprojectgp record);
}