package com.lyw.sas.web.controller;

import com.lyw.sas.model.SasRank;
import com.lyw.sas.model.SasUser;
import com.lyw.sas.service.SasRankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:55 2018/5/15
 */
@Controller
public class SasRankController {

    private static Logger logger = LoggerFactory.getLogger(SasRankController.class);

    @Autowired
    private SasRankService sasRankService;

    @RequestMapping(value = "/rank", method = {RequestMethod.GET, RequestMethod.POST})
    public String rank(HttpServletRequest request, Model model) {
        String studentId = ((SasUser)request.getSession().getAttribute("sasUser")).getStudentId();
        int score = (int)request.getSession().getAttribute("score");
        String proType = (String)request.getSession().getAttribute("proType");
        SasRank sasRank = new SasRank();
        sasRank.setStudentId(studentId);
        sasRank.setProblemType(proType);
        sasRank.setScore(score + "");
        sasRankService.score2db(sasRank);
        int rankNo = sasRankService.rankNo(sasRank);
        List<SasRank> sasRankList = sasRankService.top3indb(proType);
        model.addAttribute("rankNo", rankNo);
        model.addAttribute("sasRankList",sasRankList);
        return "rank";
    }
}
