package com.lyw.sas.service.impl;

import com.lyw.sas.dao.SasRankDao;
import com.lyw.sas.model.SasRank;
import com.lyw.sas.service.SasRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:56 2018/5/15
 */
@Service
public class SasRankServiceImpl implements SasRankService {

    @Autowired
    private SasRankDao sasRankDao;

    @Override
    public SasRank score2db(SasRank sasRank) {
        if (sasRankDao.selectSasRank(sasRank.getStudentId()) == null)
            sasRankDao.insertSelective(sasRank);
        return sasRank;
    }

    @Override
    public int rankNo(SasRank sasRank) {
        int count = 0;
        count = sasRankDao.selectRankNo(sasRank);
        return count;
    }

    @Override
    public List<SasRank> top3indb(String proType) {
        List<SasRank> sasRankList = null;
        sasRankList = sasRankDao.selectTop3indb(proType);
        return sasRankList;
    }
}
