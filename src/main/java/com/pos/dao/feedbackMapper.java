package com.pos.dao;

import com.pos.entity.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Integer fiid);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer fiid);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}