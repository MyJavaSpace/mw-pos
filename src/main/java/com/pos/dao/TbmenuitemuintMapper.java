package com.pos.dao;

import com.pos.entity.Tbmenuitemuint;

public interface TbmenuitemuintMapper {
    int deleteByPrimaryKey(Integer fiOrderUintCd);

    int insert(Tbmenuitemuint record);

    int insertSelective(Tbmenuitemuint record);

    Tbmenuitemuint selectByPrimaryKey(Integer fiOrderUintCd);

    int updateByPrimaryKeySelective(Tbmenuitemuint record);

    int updateByPrimaryKey(Tbmenuitemuint record);
}