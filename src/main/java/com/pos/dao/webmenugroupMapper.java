package com.pos.dao;

import com.pos.entity.Webmenugroup;

public interface WebmenugroupMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(Webmenugroup record);

    int insertSelective(Webmenugroup record);

    Webmenugroup selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(Webmenugroup record);

    int updateByPrimaryKey(Webmenugroup record);
}