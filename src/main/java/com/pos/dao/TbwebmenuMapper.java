package com.pos.dao;

import com.pos.entity.Tbwebmenu;

public interface TbwebmenuMapper {
    int deleteByPrimaryKey(Integer fiMenuID);

    int insert(Tbwebmenu record);

    int insertSelective(Tbwebmenu record);

    Tbwebmenu selectByPrimaryKey(Integer fiMenuID);

    int updateByPrimaryKeySelective(Tbwebmenu record);

    int updateByPrimaryKey(Tbwebmenu record);
}