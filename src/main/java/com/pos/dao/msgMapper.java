package com.pos.dao;

import com.pos.entity.msg;

public interface msgMapper {
    int deleteByPrimaryKey(Integer fimsgno);

    int insert(msg record);

    int insertSelective(msg record);

    msg selectByPrimaryKey(Integer fimsgno);

    int updateByPrimaryKeySelective(msg record);

    int updateByPrimaryKey(msg record);
}