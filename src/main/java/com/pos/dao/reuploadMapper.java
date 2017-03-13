package com.pos.dao;

import com.pos.entity.Reupload;

public interface ReuploadMapper {
    int deleteByPrimaryKey(String fsguid);

    int insert(Reupload record);

    int insertSelective(Reupload record);

    Reupload selectByPrimaryKey(String fsguid);

    int updateByPrimaryKeySelective(Reupload record);

    int updateByPrimaryKey(Reupload record);
}