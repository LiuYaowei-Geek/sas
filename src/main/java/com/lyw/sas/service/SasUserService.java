package com.lyw.sas.service;

import com.lyw.sas.model.SasUser;
/**
 * @Author: lyw
 * @Description:
 * @Date: created in 16:47 2018/5/10
 */
public interface SasUserService {
    boolean regist (SasUser sasUser);
    SasUser login (SasUser sasUser);
    String querryName(String stuId);
}
