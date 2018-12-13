package com.lyw.sas.service.impl;

import com.lyw.sas.dao.SasUserDao;
import com.lyw.sas.model.SasUser;
import com.lyw.sas.service.SasUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 16:47 2018/5/10
 */
@Service
public class SasUserServiceImpl implements SasUserService {
    private static Logger logger = LoggerFactory.getLogger(SasUserServiceImpl.class);

    @Autowired
    private SasUserDao sasUserDao;

    @Override
    public boolean regist(SasUser sasUser) {
        int count = sasUserDao.insert(sasUser);
        if (count < 0) {
            logger.info("[sas]----插入数据库失败, sasUser={}", sasUser);
            return false;
        }
        return true;
    }

    @Override
    public SasUser login(SasUser sasUser) {
        String stuId = sasUser.getStudentId();
        SasUser sasUserInDb = null;
        sasUserInDb = sasUserDao.selectBystuId(stuId);
        logger.info("[sas]----查询数据库此数据纪录条数, sasUserInDb={}", sasUserInDb);
        if (sasUserInDb != null) {
            logger.info("[sas]----数据库存在此数据纪录", sasUserInDb);
            return sasUserInDb;
        }
        return null;
    }

    @Override
    public String querryName(String stuId) {
        return null;
    }

    public void setSasUserDao(SasUserDao sasUserDao) {
        this.sasUserDao = sasUserDao;
    }
}
