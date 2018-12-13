<%@ page import="com.lyw.sas.model.SasUser" %><%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/18
  Time: 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% SasUser a = (SasUser) request.getSession().getAttribute("sasUser"); %>
<html>
<head>
    <title>rank</title>
</head>
<body>
<center>
<form action="/sas/welcome">
    <h2>welcome <%=a.getStudentName()%></h2>
    <tr>
        <td>你的名次为：${rankNo}</td>
    </tr>
    <c:forEach items="${sasRankList}" var="sasRankList">
        <tr>
            <td>学号：${sasRankList.studentId}</td>
            <td>题目类型：${sasRankList.problemType}</td>
            <td>分数：${sasRankList.score}</td>
            <br/>
        </tr>
    </c:forEach>
    <tr>
        <td><input type="submit" value="返回"/></td>
    </tr>
</form>
</center>
</body>
</html>
