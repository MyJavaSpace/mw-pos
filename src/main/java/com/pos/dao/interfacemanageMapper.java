package com.pos.dao;

import com.pos.entity.interfacemanage;

public interface interfacemanageMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(interfacemanage record);

    int insertSelective(interfacemanage record);

    interfacemanage selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(interfacemanage record);

    int updateByPrimaryKey(interfacemanage record);
}