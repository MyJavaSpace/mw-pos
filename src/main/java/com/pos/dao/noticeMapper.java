package com.pos.dao;

import com.pos.entity.notice;

public interface noticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(notice record);

    int insertSelective(notice record);

    notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(notice record);

    int updateByPrimaryKey(notice record);
}