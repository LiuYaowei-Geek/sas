package com.lyw.sas.service.impl;

import com.lyw.sas.dao.SasProblemDao;
import com.lyw.sas.model.SasProblem;
import com.lyw.sas.service.SasProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:57 2018/5/15
 */
@Service
public class SasProblemServiceImpl implements SasProblemService {
    private static Logger logger = LoggerFactory.getLogger(SasUserServiceImpl.class);

    @Autowired
    private SasProblemDao sasProblemDao;

    @Override
    public List<SasProblem> selectProList(SasProblem sasProblem) {
        List<SasProblem> sasProblemList = null;
        sasProblemList = sasProblemDao.selectByProType(sasProblem.getProblemType());
        logger.info("[sas]----根据type查询题目列表, sasProblemList={}", sasProblemList);
        return sasProblemList;
    }

    public void setSasProblemDao(SasProblemDao sasProblemDao) {
        this.sasProblemDao = sasProblemDao;
    }


}
