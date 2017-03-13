package com.pos.dao;

import com.pos.entity.Tbmenuitemaskgp;
import com.pos.entity.TbmenuitemaskgpKey;

public interface TbmenuitemaskgpMapper {
    int deleteByPrimaryKey(TbmenuitemaskgpKey key);

    int insert(Tbmenuitemaskgp record);

    int insertSelective(Tbmenuitemaskgp record);

    Tbmenuitemaskgp selectByPrimaryKey(TbmenuitemaskgpKey key);

    int updateByPrimaryKeySelective(Tbmenuitemaskgp record);

    int updateByPrimaryKey(Tbmenuitemaskgp record);
}