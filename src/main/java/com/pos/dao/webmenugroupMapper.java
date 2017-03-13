package com.pos.dao;

import com.pos.entity.webmenugroup;

public interface webmenugroupMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(webmenugroup record);

    int insertSelective(webmenugroup record);

    webmenugroup selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(webmenugroup record);

    int updateByPrimaryKey(webmenugroup record);
}