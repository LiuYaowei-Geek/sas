package com.lyw.sas.dao;

import com.lyw.sas.model.SasUser;

public interface SasUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SasUser record);

    int insertSelective(SasUser record);

    SasUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SasUser record);

    int updateByPrimaryKey(SasUser record);

    SasUser selectBystuId (String stuId);

}