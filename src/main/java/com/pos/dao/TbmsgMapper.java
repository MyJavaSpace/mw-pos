package com.pos.dao;

import com.pos.entity.Tbmsg;

public interface TbmsgMapper {
    int deleteByPrimaryKey(Integer fiMsgNo);

    int insert(Tbmsg record);

    int insertSelective(Tbmsg record);

    Tbmsg selectByPrimaryKey(Integer fiMsgNo);

    int updateByPrimaryKeySelective(Tbmsg record);

    int updateByPrimaryKey(Tbmsg record);
}