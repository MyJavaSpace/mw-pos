package com.pos.dao;

import com.pos.entity.feedback;

public interface feedbackMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(feedback record);

    int insertSelective(feedback record);

    feedback selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(feedback record);

    int updateByPrimaryKey(feedback record);
}