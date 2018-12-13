package com.lyw.sas.service;

import com.lyw.sas.model.SasRank;

import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:56 2018/5/15
 */
public interface SasRankService {
    SasRank score2db(SasRank sasRank);
    int rankNo(SasRank sasRank);
    List<SasRank> top3indb(String proType);
}
