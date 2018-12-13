package com.lyw.sas.web.controller;

import com.lyw.sas.model.SasProblem;
import com.lyw.sas.service.SasProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: lyw
 * @Description:
 * @Date: created in 0:55 2018/5/15
 */
@Controller
public class SasProblemController {
    @Autowired
    private SasProblemService sasProblemService;

    private static Logger logger = LoggerFactory.getLogger(SasProblemController.class);

    @RequestMapping(value = "/problem", method = {RequestMethod.GET, RequestMethod.POST})
    public String problem(HttpServletRequest request, Model model) {
        SasProblem sasProblem = new SasProblem();
        List<SasProblem> sasProblemList = null;
        sasProblem.setProblemType(request.getParameter("problemType"));
        logger.info("ProblemType={}", sasProblem.getProblemType());
        sasProblemList = sasProblemService.selectProList(sasProblem);
        logger.info("sasProblemList={}", sasProblemList);
//      展示题目的数量设置为3
        Random random = new Random();
        List<SasProblem> sasProDescList2show = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(sasProblemList.size());
            if (!sasProDescList2show.contains(sasProblemList.get(r))) {
                sasProDescList2show.add(sasProblemList.get(r));
            } else {
                i--;
            }
        }
        logger.info("sasProDescList2show={}", sasProDescList2show);
        System.out.println(sasProDescList2show);
        model.addAttribute("sasProDescList2show", sasProDescList2show);
        request.getSession().setAttribute("sasProDescList2show", sasProDescList2show);
        return "problem";
    }

    @RequestMapping(value = "/checkAnswer", method = {RequestMethod.GET, RequestMethod.POST})
    public String checkAnswer(HttpServletRequest request, Model model) {
        String userAnswer = request.getParameter("answer");
        int score = 0;
        List<SasProblem> sasProDescList2show = new ArrayList<>();
        sasProDescList2show = (List<SasProblem>) request.getSession().getAttribute("sasProDescList2show");
        String rightAnswer = "";
        for (SasProblem sasProblem : sasProDescList2show)
            rightAnswer += sasProblem.getProblemAnswerRight();
        for (int i = 0; i < userAnswer.length(); i++) {
            if (userAnswer.charAt(i) == rightAnswer.charAt(i))
                score++;
        }
        String proType = sasProDescList2show.get(0).getProblemType();
        model.addAttribute("proType", proType);
        model.addAttribute("score", score * 10);
        request.getSession().setAttribute("proType", proType);
        request.getSession().setAttribute("score", (score * 10));
        return "score";
    }
}
