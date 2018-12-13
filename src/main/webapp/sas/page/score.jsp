<%@ page import="com.lyw.sas.model.SasUser" %><%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/15
  Time: 1:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% SasUser a = (SasUser) request.getSession().getAttribute("sasUser"); %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>score</title>
</head>
<body>
<center>
<form action="/sas/rank">
    <h2>welcome <%=a.getStudentName()%></h2>
    <tr>
        <td>题目类型为：${proType}</td>
    </tr>
    <tr>
        <td>得分为：${score} 分</td>
    </tr>
    <tr>
        <td><input type="submit" value="查询名次"/></td>
    </tr>
</form>
</center>
</body>
</html>
