package com.lyw.sas.model;

import java.util.Date;

public class SasProblem {
    private Integer id;

    private String problemType;

    private String problemDesc;

    private String problemAnswerA;

    private String problemAnswerB;

    private String problemAnswerC;

    private String problemAnswerD;

    private String problemAnswerRight;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType == null ? null : problemType.trim();
    }

    public String getProblemDesc() {
        return problemDesc;
    }

    public void setProblemDesc(String problemDesc) {
        this.problemDesc = problemDesc == null ? null : problemDesc.trim();
    }

    public String getProblemAnswerA() {
        return problemAnswerA;
    }

    public void setProblemAnswerA(String problemAnswerA) {
        this.problemAnswerA = problemAnswerA == null ? null : problemAnswerA.trim();
    }

    public String getProblemAnswerB() {
        return problemAnswerB;
    }

    public void setProblemAnswerB(String problemAnswerB) {
        this.problemAnswerB = problemAnswerB == null ? null : problemAnswerB.trim();
    }

    public String getProblemAnswerC() {
        return problemAnswerC;
    }

    public void setProblemAnswerC(String problemAnswerC) {
        this.problemAnswerC = problemAnswerC == null ? null : problemAnswerC.trim();
    }

    public String getProblemAnswerD() {
        return problemAnswerD;
    }

    public void setProblemAnswerD(String problemAnswerD) {
        this.problemAnswerD = problemAnswerD == null ? null : problemAnswerD.trim();
    }

    public String getProblemAnswerRight() {
        return problemAnswerRight;
    }

    public void setProblemAnswerRight(String problemAnswerRight) {
        this.problemAnswerRight = problemAnswerRight == null ? null : problemAnswerRight.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}