package com.pos.dao;

import com.pos.entity.Tbprintprojectgp;
import com.pos.entity.TbprintprojectgpKey;

public interface TbprintprojectgpMapper {
    int deleteByPrimaryKey(TbprintprojectgpKey key);

    int insert(Tbprintprojectgp record);

    int insertSelective(Tbprintprojectgp record);

    Tbprintprojectgp selectByPrimaryKey(TbprintprojectgpKey key);

    int updateByPrimaryKeySelective(Tbprintprojectgp record);

    int updateByPrimaryKey(Tbprintprojectgp record);
}