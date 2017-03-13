package com.pos.dao;

import com.pos.entity.Tbinterfacemanage;

public interface TbinterfacemanageMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(Tbinterfacemanage record);

    int insertSelective(Tbinterfacemanage record);

    Tbinterfacemanage selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(Tbinterfacemanage record);

    int updateByPrimaryKey(Tbinterfacemanage record);
}