package com.pos.dao;

import com.pos.entity.Printprojectgp;
import com.pos.entity.PrintprojectgpKey;

public interface PrintprojectgpMapper {
    int deleteByPrimaryKey(PrintprojectgpKey key);

    int insert(Printprojectgp record);

    int insertSelective(Printprojectgp record);

    Printprojectgp selectByPrimaryKey(PrintprojectgpKey key);

    int updateByPrimaryKeySelective(Printprojectgp record);

    int updateByPrimaryKey(Printprojectgp record);
}