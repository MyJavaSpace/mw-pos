package com.pos.dao;

import com.pos.entity.Webmenu;

public interface WebmenuMapper {
    int deleteByPrimaryKey(Integer fimenuid);

    int insert(Webmenu record);

    int insertSelective(Webmenu record);

    Webmenu selectByPrimaryKey(Integer fimenuid);

    int updateByPrimaryKeySelective(Webmenu record);

    int updateByPrimaryKey(Webmenu record);
}