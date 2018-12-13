<%@ page import="com.lyw.sas.model.SasUser" %><%--
  Created by IntelliJ IDEA.
  User: weishao
  Date: 2018/5/12
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% SasUser a = (SasUser) request.getSession().getAttribute("sasUser"); %>
<html>
<head>
    <title>home</title>
</head>
<body>
<center>
<form action="/sas/problem">
    <h2>welcome <%=a.getStudentName()%></h2>
    <tr>
        <td>题目类型：</td>
        <td><input type="submit" value="足球" id="football" name="problemType" /></td>
        <td><input type="submit" value="计算机" id="computer" name="problemType" /></td>
    </tr>
</form>
</center>
</body>
</html>
