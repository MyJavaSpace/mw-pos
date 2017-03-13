package com.pos.dao;

import com.pos.entity.Msg;

public interface MsgMapper {
    int deleteByPrimaryKey(Integer fimsgno);

    int insert(Msg record);

    int insertSelective(Msg record);

    Msg selectByPrimaryKey(Integer fimsgno);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}