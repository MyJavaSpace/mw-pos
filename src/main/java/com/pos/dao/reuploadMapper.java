package com.pos.dao;

import com.pos.entity.reupload;

public interface reuploadMapper {
    int deleteByPrimaryKey(String fsguid);

    int insert(reupload record);

    int insertSelective(reupload record);

    reupload selectByPrimaryKey(String fsguid);

    int updateByPrimaryKeySelective(reupload record);

    int updateByPrimaryKey(reupload record);
}