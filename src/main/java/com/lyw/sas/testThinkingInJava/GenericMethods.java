package com.lyw.sas.testThinkingInJava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 22:45 2018/12/13
 */
public class GenericMethods {

    private Logger logger= LoggerFactory.getLogger(GenericMethods.class);

    public <T> void f(T x) {
        logger.info("test generic methods, className={}", x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}