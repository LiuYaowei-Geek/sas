package com.lyw.sas.dao;

import com.lyw.sas.model.SasProblem;

import java.util.List;

public interface SasProblemDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SasProblem record);

    int insertSelective(SasProblem record);

    SasProblem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SasProblem record);

    int updateByPrimaryKey(SasProblem record);

    List<SasProblem> selectByProType(String problemType);
}