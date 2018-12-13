package com.lyw.sas.dao;

import com.lyw.sas.model.SasRank;

import java.util.List;

public interface SasRankDao {
    int insert(SasRank record);

    int insertSelective(SasRank record);

    int selectRankNo(SasRank sasRank);

    List<SasRank> selectTop3indb(String proType);

    SasRank selectSasRank(String stuId);
}