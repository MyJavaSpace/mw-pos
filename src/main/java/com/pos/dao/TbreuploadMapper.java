package com.pos.dao;

import com.pos.entity.Tbreupload;

public interface TbreuploadMapper {
    int deleteByPrimaryKey(String fsGuid);

    int insert(Tbreupload record);

    int insertSelective(Tbreupload record);

    Tbreupload selectByPrimaryKey(String fsGuid);

    int updateByPrimaryKeySelective(Tbreupload record);

    int updateByPrimaryKey(Tbreupload record);
}