package com.pos.dao;

import com.pos.entity.Interfacemanage;

public interface InterfacemanageMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(Interfacemanage record);

    int insertSelective(Interfacemanage record);

    Interfacemanage selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(Interfacemanage record);

    int updateByPrimaryKey(Interfacemanage record);
}