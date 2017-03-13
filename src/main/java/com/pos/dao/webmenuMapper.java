package com.pos.dao;

import com.pos.entity.webmenu;

public interface webmenuMapper {
    int deleteByPrimaryKey(Integer fimenuid);

    int insert(webmenu record);

    int insertSelective(webmenu record);

    webmenu selectByPrimaryKey(Integer fimenuid);

    int updateByPrimaryKeySelective(webmenu record);

    int updateByPrimaryKey(webmenu record);
}