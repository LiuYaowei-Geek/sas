package com.lyw.sas.service;

import com.lyw.sas.model.SasProblem;

import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:56 2018/5/15
 */
public interface SasProblemService {
    List<SasProblem> selectProList(SasProblem sasProblem);
}
