package com.pos.dao;

import com.pos.entity.Tbpublish;
import com.pos.entity.TbpublishKey;

public interface TbpublishMapper {
    int deleteByPrimaryKey(TbpublishKey key);

    int insert(Tbpublish record);

    int insertSelective(Tbpublish record);

    Tbpublish selectByPrimaryKey(TbpublishKey key);

    int updateByPrimaryKeySelective(Tbpublish record);

    int updateByPrimaryKey(Tbpublish record);
}