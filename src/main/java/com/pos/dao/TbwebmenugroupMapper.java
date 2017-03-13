package com.pos.dao;

import com.pos.entity.Tbwebmenugroup;

public interface TbwebmenugroupMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(Tbwebmenugroup record);

    int insertSelective(Tbwebmenugroup record);

    Tbwebmenugroup selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(Tbwebmenugroup record);

    int updateByPrimaryKey(Tbwebmenugroup record);
}