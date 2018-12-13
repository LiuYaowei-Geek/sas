package com.lyw.sas.facade;

import com.lyw.sas.model.SasProblem;
import com.lyw.sas.model.SasRank;

import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 14:03 2018/5/10
 */
public interface SasQuerryFacade {
    /**
     * 查询题目列表
     * @param type
     * @return
     */
    List<SasProblem> querryProblemList (String type);

    /**
     * 查询名次
     * @param sasRank
     * @return
     */
    int querryRankNum (SasRank sasRank);



}
