package com.lyw.sas.web.controller;

import com.lyw.sas.dao.SasUserDao;
import com.lyw.sas.model.SasUser;
import com.lyw.sas.service.SasUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 16:42 2018/5/10
 */
@Controller
public class SasUserController {
    @Autowired
    private SasUserService sasUserService;
    @Autowired
    private SasUserDao sasUserDao;

    private static Logger logger = LoggerFactory.getLogger(SasUserController.class);

    @RequestMapping(value = "/checkLogin", method = {RequestMethod.GET, RequestMethod.POST})
    public String checkLogin(String studentId, String studentPassword,
                             HttpServletRequest request, Model model) {
        logger.info("[sas]----校验数据库是否存在此登录数据");
        studentId = request.getParameter("studentId");
        studentPassword = request.getParameter("studentPassword");
        SasUser sasUser = new SasUser();
        sasUser.setStudentId(studentId);
        sasUser.setStudentPassword(studentPassword);
        logger.info("sasUser={}", sasUser);
        SasUser sasUserInDb = sasUserService.login(sasUser);
        if (sasUserInDb == null) {
            logger.info("[sas]----查询数据库无此数据记录，请重新登录");
            return "error";
        }
        logger.info("[sas]----查询数据库有此数据记录，转入主界面");
        request.getSession().setAttribute("sasUser", sasUserInDb);
        return "home";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {
        logger.info("[sas]----welcome to login.jsp");
        return "login";
    }

    @RequestMapping(value = "/regist", method = {RequestMethod.GET, RequestMethod.POST})
    public String regist() {
        logger.info("[sas]----welcome to login.jsp");
        return "regist";
    }

    @RequestMapping(value = "/checkRegist", method = {RequestMethod.GET, RequestMethod.POST})
    public String checkRegist(String studentId, String studentPassword, String studentName,
                         HttpServletRequest request, Model model) {
        logger.info("[sas]----welcome to regist.jsp");
        studentId = request.getParameter("studentId");
        studentPassword = request.getParameter("studentPassword");
        studentName = request.getParameter("studentName");
        SasUser sasUser = new SasUser();
        sasUser.setStudentId(studentId);
        sasUser.setStudentName(studentName);
        sasUser.setStudentPassword(studentPassword);
        logger.info("sasUser={}", sasUser);
        SasUser sasUserInDb = sasUserService.login(sasUser);
        logger.info("[sas]----查询数据库是否已存在此数据记录, sasUserInDb={}", sasUserInDb);
        if (sasUserInDb == null) {
            logger.info("[sas]----查询数据库无此数据记录，将数据插入数据库");
            boolean registFlag = sasUserService.regist(sasUser);
            if (registFlag == true) {
                logger.info("[sas]----数据插入成功,请登录, sasUser={}", sasUser);
                return "login";
            } else {
                logger.info("[sas]----数据插入失败, sasUser={}", sasUser);
                return "error";
            }
        }
        logger.info("[sas]----查询数据库有此数据记录，注册失败，请登录");
        return "login";
    }

    @RequestMapping(value = "/welcome", method = {RequestMethod.GET, RequestMethod.POST})
    public String welcome() {
        logger.info("[sas]----welcome to sas!");
        return "welcome";
    }
}
