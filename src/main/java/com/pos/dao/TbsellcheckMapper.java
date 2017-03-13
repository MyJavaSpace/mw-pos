package com.pos.dao;

import com.pos.entity.Tbsellcheck;
import com.pos.entity.TbsellcheckKey;

public interface TbsellcheckMapper {
    int deleteByPrimaryKey(TbsellcheckKey key);

    int insert(Tbsellcheck record);

    int insertSelective(Tbsellcheck record);

    Tbsellcheck selectByPrimaryKey(TbsellcheckKey key);

    int updateByPrimaryKeySelective(Tbsellcheck record);

    int updateByPrimaryKey(Tbsellcheck record);
}