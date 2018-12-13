<%@ page import="com.lyw.sas.model.SasUser" %><%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/15
  Time: 1:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% SasUser a = (SasUser) request.getSession().getAttribute("sasUser"); %>
<html>
<head>
    <title>problem</title>
</head>
<body>
<form action="/sas/checkAnswer">
    <h2>welcome <%=a.getStudentName()%></h2>
    <c:forEach items="${sasProDescList2show}" var="sasProblem">
        <tr>
        <td>题目: ${sasProblem.problemDesc}</td>
            <br/>
        <td>A.${sasProblem.problemAnswerA}</td>
        <td>B.${sasProblem.problemAnswerB}</td>
        <td>C.${sasProblem.problemAnswerC}</td>
        <td>D.${sasProblem.problemAnswerD}</td>
            <br/>
            <br/>
        </tr>
    </c:forEach>
    <tr>
        <td><input type="text" id="answer" name="answer"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"/></td>
    </tr>
</form>
</body>
</html>
