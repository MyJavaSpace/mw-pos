package com.pos.dao;

import com.pos.entity.Tbfeedback;

public interface TbfeedbackMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(Tbfeedback record);

    int insertSelective(Tbfeedback record);

    Tbfeedback selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(Tbfeedback record);

    int updateByPrimaryKey(Tbfeedback record);
}